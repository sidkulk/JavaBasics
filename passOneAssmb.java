package passOneAssembler;

import java.util.*;
import java.io.*;

public class OnePassAsmb {
	public static void main(String[] args)throws Exception{
		
		String symb = "^\\d*[a-zA-Z][a-zA-Z0-9]*$";	//Regex for symbol
		String liter = "='[0-9]'";	//regex for literal
		
		HashMap<String, Integer> MOT = new HashMap<>();	//Mnemonic opcode table
		MOT.put("MOVER", 1);
		MOT.put("MOVEM", 2);
		MOT.put("ADD", 3);
		MOT.put("SUB", 4);
		MOT.put("MULTI", 5);
		MOT.put("DIV", 6);
		MOT.put("BC", 7);
		MOT.put("COMP", 8);
		MOT.put("PRINT", 9);
		MOT.put("READ", 10);
		
		HashMap<String, Integer> POT = new HashMap<>(); //Pseudo opcode table
		POT.put("START", 11);
		POT.put("END", 12);
		POT.put("EQU", 13);
		POT.put("ORIGIN", 14);
		POT.put("LTORG", 15);
		
		HashMap<String, Integer> DL = new HashMap<>();
		DL.put("DS", 16);
		DL.put("DC", 17);
		
		HashMap<String, Integer> Register = new HashMap<>();
		Register.put("AREG", 18);
		Register.put("BREG", 19);
		Register.put("CREG", 20);
		Register.put("DREG", 21);
		
		HashMap<String, Integer> symbol = new HashMap<>();
		HashMap<String, Integer> literal = new HashMap<>();
		HashMap<String, String> IC = new HashMap<String, String>();
		int lc = 0, sym=0, li=0;
		File f = new File("/home/sid/eclipse-workspace/Assembler/test.txt");//Change the path as per requirements
		File fo = new File("/home/sid/eclipse-workspace/Assembler/output.txt");//Change the path as per requirements
		File fs = new File("/home/sid/eclipse-workspace/Assembler/symbolTab.txt");//Change the path as per requirements
		File fl = new File("/home/sid/eclipse-workspace/Assembler/literalTab.txt");//Change the path as per requirements
		BufferedWriter br = new BufferedWriter(new FileWriter(fo));
		BufferedWriter brS = new BufferedWriter(new FileWriter(fs));
		BufferedWriter brL = new BufferedWriter(new FileWriter(fl));
		Scanner s = new Scanner(f);
		String start = "nan";
		while(s.hasNextLine()) {
			String inst = s.nextLine();
			String[] splitInst = inst.split("    ");
			
			
			for(int i=0;i<splitInst.length;i++) {
				String instElement = splitInst[i];
				if(!instElement.isBlank()) {
					if(MOT.containsKey(instElement)) {
						String val = Integer.toString(MOT.get(instElement));
						IC.put("IS", val);
					}
					else if(Register.containsKey(instElement)) {
						String val = Integer.toString(Register.get(instElement));
						IC.put("Reg", val);
					}
					else if(POT.containsKey(instElement)) {
						switch (instElement){
							case "START":{
								start = instElement;
								lc = Integer.parseInt(splitInst[i+1]);
								String val = Integer.toString(POT.get(instElement));
								IC.put("AD", val);
								String l = Integer.toString(lc);
								IC.put("C", l);
							}
							break;
							
							case "END":{
								String val = Integer.toString(POT.get(instElement));
								IC.put("AD", val);
								for(Map.Entry<String, Integer> me: literal.entrySet()) {
									int loc = me.getValue();
									String lkey = me.getKey();
									if(loc==0) {
										literal.replace(lkey, lc);
										lc++;
									}
								}
							}
							break;
							
							case "ORIGIN":{
								String val = Integer.toString(POT.get(instElement));
								IC.put("AAD", val);
								lc = Integer.parseInt(splitInst[i+1]);
							}
							break;
							
							case "LTORG":{
								String val = Integer.toString(POT.get(instElement));
								IC.put("AAD", val);
								for(Map.Entry<String, Integer> lt: literal.entrySet()) {
									int loc = lt.getValue();
									String lkey = lt.getKey();
									if(loc==0) {
										literal.replace(lkey, lc);
										lc++;
									}
								}
							}
							break;
						}
					}
					else if(DL.containsKey(instElement)) {
						switch(instElement) {
							case "DC":{
								String val = Integer.toString(DL.get(instElement));
								IC.put("DL", val);
								String st = splitInst[i-1];
								for(Map.Entry<String, Integer> sy: symbol.entrySet()) {
										String ks = sy.getKey();
										if(ks.equals(st)) {
											symbol.replace(ks, lc);
										}
								}
							}
							break;
							
							case "DS":{
								String val = Integer.toString(DL.get(instElement));
								IC.put("DL", val);
								String st2 = splitInst[i-1];
								for(Map.Entry<String, Integer> sy: symbol.entrySet()) {
										String ks = sy.getKey();
										if(ks.equals(st2)) {
											symbol.replace(ks, lc);
										}
								}
							}
							break;
						}
					}
					else {
						boolean b = instElement.matches(symb);
						boolean c = instElement.matches(liter);
						if(b) {
							int pos = inst.indexOf(instElement);
							if(pos==0) {
								symbol.put(instElement, lc);
								String val = Integer.toString(symbol.get(instElement));
								String symbCnt = Integer.toString(sym);
								IC.put("S"+symbCnt, val);
							}
							else {
								symbol.put(instElement, 0);
								String val = Integer.toString(symbol.get(instElement));
								String symbCnt = Integer.toString(sym);
								IC.put("S"+symbCnt, val);
							}
							sym++;
						}
						else if(c) {
							literal.put(instElement, 0);
							String val = Integer.toString(literal.get(instElement));
							String litCnt = Integer.toString(li);
							IC.put("L"+litCnt, val);
							li++;
						}
					}
				}
			}
			if(!start.equals("START")) {
				lc++;
			}
			start = "nan";
			for(Map.Entry<String, String> entry : IC.entrySet()) {
				br.write("  ("+entry.getKey()+" "+entry.getValue()+")  ");
			}
			br.newLine();
			IC.clear();
		}
		
		for(Map.Entry<String, Integer> sent : symbol.entrySet()) {
			brS.write(" "+sent.getKey()+"    "+sent.getValue());
			brS.newLine();
		}
		
		for(Map.Entry<String, Integer> lent : literal.entrySet()) {
			brL.write(" "+lent.getKey()+"    "+lent.getValue());
			brL.newLine();
		}
		
		br.close();
		brS.close();
		brL.close();
		s.close();
	}
}


class PassTwo{
	void FunTwo() throws FileNotFoundException{
		File f = new File("/home/sid/eclipse-workspace/Assembler/output.txt");
		Scanner s = new Scanner(f);
		while(s.hasNextLine()) {
			String str = s.nextLine();
			String[] strSplit = str.split("()");
			ArrayList<String> strArray = new ArrayList<>();
			for(String strAr : strSplit) {
				strArray.add(strAr);
			}
			
			for(int i=0;i<strArray.size();i++) {
				System.out.print(strArray.get(i));
			}
		}
	}
}
