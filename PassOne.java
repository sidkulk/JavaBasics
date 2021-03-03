<<<<<<< HEAD
package passOne;
/**
 * This is a java program to demonstrate the working of pass one assembler
 * programmed with LOVE by Siddharth Kulkarni
 * rollNo: tecoc340
 * batch: C3
 */
import java.util.*;
import java.io.*;

class PassOne{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])throws Exception{
		
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
		POT.put("START", 1);
		POT.put("END", 2);
		POT.put("EQU", 3);
		POT.put("ORIGIN", 4);
		POT.put("LTORG", 5);
		
		HashMap<String, Integer> DL = new HashMap<>();
		DL.put("DS", 1);
		DL.put("DC", 2);
		
		HashMap<String, Integer> Register = new HashMap<>();
		Register.put("AREG", 1);
		Register.put("BREG", 2);
		Register.put("CREG", 3);
		Register.put("DREG", 4);
		
		HashMap<String, Integer> symbol = new HashMap<>();
		HashMap<String, Integer> literal = new HashMap<>();
        Set<Map.Entry<String, Integer>> litset = literal.entrySet();
        Set<Map.Entry<String, Integer>> symset = symbol.entrySet();
		int lc = 0;
        String strt = "";
		File f = new File("C:\\Users\\Siddharth\\git\\repository\\PassOne\\Assembler\\src\\passOne\\test.txt");
		Scanner sin = new Scanner(f);
		while(sin.hasNextLine()){
			String instr = sin.nextLine();
			ArrayList<String>splitInst = new ArrayList<>(4);
			String[] instarr = instr.split("\t", 4);
                        for (String instarr1 : instarr) {
                            splitInst.add(instarr1);
                        }
			for(int i=0;i<splitInst.size();i++){
				String str = splitInst.get(i);
				if(!str.isEmpty()) {
					if(POT.containsKey(str)){
                        switch (str){
                            case "START":
                                lc = Integer.parseInt(instarr[i+1]);
                                strt = str;
                            break;
                            case "END":
                                for(Map.Entry<String, Integer> me: litset){
                                    int val = me.getValue();
                                    String key = me.getKey();
                                    if(val==0){
                                        int k = literal.replace(key, lc);
                                    }
                                }
                            break;
                            case "LTORG":
                                strt = str;
                                for(Map.Entry<String, Integer> me: litset){
                                     int v = me.getValue();
                                    String s = me.getKey();
                                    if(v==0){
                                        int k = literal.replace(s, lc);
                                        lc++;
                                    }
                                }
                            break;
                            case "ORIGIN":
                                lc = Integer.parseInt(instarr[i+1]);
                            break;
                        }
					}
                    else if(MOT.containsKey(str)) {
						
					}
					else if(Register.containsKey(str)) {
						
					}
                     else if(DL.containsKey(str)){
                        switch (str){
                            case "DS":
                                {
                                    String s = instarr[i-1];
                                    for(Map.Entry<String, Integer> me:symset){
                                        String k = me.getKey();
                                        if(k.equals(s)){
                                            int k2 = symbol.replace(s, lc);
                                        }
                                    }
                            break;
                        }
                            case "DC":
                            {
                                String s = instarr[i-1];
                                for(Map.Entry<String, Integer> me:symset){
                                    String k = me.getKey();
                                    if(k.equals(s)){
                                        int k2 = symbol.replace(s, lc);
                                    }
                                }
								break;
							}
                        }
                    }
					else {
						boolean b = str.matches(symb);
						boolean c = str.matches(liter);
						if(b){
                            int in = str.indexOf(str);
                            if(in==0)
								symbol.put(str, lc);
                            else
                                symbol.put(str, 0);
						}
						else if(c){
							literal.put(str, 0);
						}
					}
				}
			}
            if(!strt.equals("START")){
                lc++;
            }
            strt = "NAN";
		}
		System.out.println("Symbol\t\tLocation counter");
		for(String i: symbol.keySet()){
			System.out.println(" "+i+"\t\t"+symbol.get(i));
		}
		System.out.println();
		
		System.out.println("literal\t\tLocation counter");
		for(String i: literal.keySet()){
			System.out.println(" "+i+"\t\t"+literal.get(i));
		}
		System.out.println();
        File ft = new File("C:\\Users\\Siddharth\\git\\repository\\PassOne\\Assembler\\src\\passOne\\test.txt");
		Scanner sinq = new Scanner(ft);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Siddharth\\git\\repository\\PassOne\\Assembler\\src\\passOne\\output.txt"))) {
        while(sinq.hasNextLine()){
            String op = "";
            String instr = sinq.nextLine();
            ArrayList<String>splitInst = new ArrayList<>(4);
            String[] instarr = instr.split("\t", 4);
            for (String instarr1 : instarr){
                splitInst.add(instarr1);
            }
            for(int i=0;i<splitInst.size();i++){
                String str = splitInst.get(i);
                if(!str.isEmpty()){
                    String opcode;
                    if(POT.containsKey(str)){
                        switch (str){
                            case "EQU":
                            case "ORIGIN":
                            break;
                            case "START":
                                String ct = instarr[i+1];
                                opcode = Integer.toString(POT.get(str));
                                 op = op +"\t"+ opcode + "\t"+ct;
                            break;
                            case "LTORG":
                                for(Map.Entry<String, Integer> me: litset){
                                    String s = me.getKey();
                                    String intVal = s.replaceAll("[^0-9]", "");
                                    op = op+"\t"+"0"+intVal;
                                }   
							break;
                            default:
                                opcode = Integer.toString(POT.get(str));
                                op = op +"\t"+ opcode;
                            break;
                                }
                            }
                            else if(MOT.containsKey(str)){
                                opcode = Integer.toString(MOT.get(str));
                                op = op +"  "+ opcode;
                            }
                            else if(DL.containsKey(str)){
                                opcode = Integer.toString(DL.get(str));
                                op = op +"\t"+ opcode;
                            }
                            else if(Register.containsKey(str)){
                                opcode = Integer.toString(Register.get(str));
                                op = op +"\t"+ opcode;
                            }
                            else if(symbol.containsKey(str)){
                                int sy = symbol.get(str);
                                String sop = Integer.toString(sy);
                                if(instr.indexOf(str)!=0){
                                    op = op+"\t"+sop;
                                }
                            }
                            else if(literal.containsKey(str)){
                                opcode = Integer.toString(literal.get(str));
                                op = op +"\t"+ opcode;
                            }
                        }
                    }
                    System.out.println("Output of pass one assembler: "+op);
                    writer.write(op);
                    writer.newLine();
                }
            }
	}
}
=======
<<<<<<< HEAD
package passOne;
/**
 * This is a java program to demonstrate the working of pass one assembler
 * programmed with LOVE by Siddharth Kulkarni
 * rollNo: tecoc340
 * batch: C3
 */
import java.util.*;
import java.io.*;

class PassOne{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])throws Exception{
		
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
		POT.put("START", 1);
		POT.put("END", 2);
		POT.put("EQU", 3);
		POT.put("ORIGIN", 4);
		POT.put("LTORG", 5);
		
		HashMap<String, Integer> DL = new HashMap<>();
		DL.put("DS", 1);
		DL.put("DC", 2);
		
		HashMap<String, Integer> Register = new HashMap<>();
		Register.put("AREG", 1);
		Register.put("BREG", 2);
		Register.put("CREG", 3);
		Register.put("DREG", 4);
		
		HashMap<String, Integer> symbol = new HashMap<>();
		HashMap<String, Integer> literal = new HashMap<>();
        Set<Map.Entry<String, Integer>> litset = literal.entrySet();
        Set<Map.Entry<String, Integer>> symset = symbol.entrySet();
		int lc = 0;
        String strt = "";
		File f = new File("C:\\Users\\Siddharth\\git\\repository\\PassOne\\Assembler\\src\\passOne\\test.txt");
		Scanner sin = new Scanner(f);
		while(sin.hasNextLine()){
			String instr = sin.nextLine();
			ArrayList<String>splitInst = new ArrayList<>(4);
			String[] instarr = instr.split("\t", 4);
                        for (String instarr1 : instarr) {
                            splitInst.add(instarr1);
                        }
			for(int i=0;i<splitInst.size();i++){
				String str = splitInst.get(i);
				if(!str.isEmpty()) {
					if(POT.containsKey(str)){
                        switch (str){
                            case "START":
                                lc = Integer.parseInt(instarr[i+1]);
                                strt = str;
                            break;
                            case "END":
                                for(Map.Entry<String, Integer> me: litset){
                                    int val = me.getValue();
                                    String key = me.getKey();
                                    if(val==0){
                                        int k = literal.replace(key, lc);
                                    }
                                }
                            break;
                            case "LTORG":
                                strt = str;
                                for(Map.Entry<String, Integer> me: litset){
                                     int v = me.getValue();
                                    String s = me.getKey();
                                    if(v==0){
                                        int k = literal.replace(s, lc);
                                        lc++;
                                    }
                                }
                            break;
                            case "ORIGIN":
                                lc = Integer.parseInt(instarr[i+1]);
                            break;
                        }
					}
                    else if(MOT.containsKey(str)) {
						
					}
					else if(Register.containsKey(str)) {
						
					}
                     else if(DL.containsKey(str)){
                        switch (str){
                            case "DS":
                                {
                                    String s = instarr[i-1];
                                    for(Map.Entry<String, Integer> me:symset){
                                        String k = me.getKey();
                                        if(k.equals(s)){
                                            int k2 = symbol.replace(s, lc);
                                        }
                                    }
                            break;
                        }
                            case "DC":
                            {
                                String s = instarr[i-1];
                                for(Map.Entry<String, Integer> me:symset){
                                    String k = me.getKey();
                                    if(k.equals(s)){
                                        int k2 = symbol.replace(s, lc);
                                    }
                                }
								break;
							}
                        }
                    }
					else {
						boolean b = str.matches(symb);
						boolean c = str.matches(liter);
						if(b){
                            int in = str.indexOf(str);
                            if(in==0)
								symbol.put(str, lc);
                            else
                                symbol.put(str, 0);
						}
						else if(c){
							literal.put(str, 0);
						}
					}
				}
			}
            if(!strt.equals("START")){
                lc++;
            }
            strt = "NAN";
		}
		System.out.println("Symbol\t\tLocation counter");
		for(String i: symbol.keySet()){
			System.out.println(" "+i+"\t\t"+symbol.get(i));
		}
		System.out.println();
		
		System.out.println("literal\t\tLocation counter");
		for(String i: literal.keySet()){
			System.out.println(" "+i+"\t\t"+literal.get(i));
		}
		System.out.println();
        File ft = new File("C:\\Users\\Siddharth\\git\\repository\\PassOne\\Assembler\\src\\passOne\\test.txt");
		Scanner sinq = new Scanner(ft);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Siddharth\\git\\repository\\PassOne\\Assembler\\src\\passOne\\output.txt"))) {
        while(sinq.hasNextLine()){
            String op = "";
            String instr = sinq.nextLine();
            ArrayList<String>splitInst = new ArrayList<>(4);
            String[] instarr = instr.split("\t", 4);
            for (String instarr1 : instarr){
                splitInst.add(instarr1);
            }
            for(int i=0;i<splitInst.size();i++){
                String str = splitInst.get(i);
                if(!str.isEmpty()){
                    String opcode;
                    if(POT.containsKey(str)){
                        switch (str){
                            case "EQU":
                            case "ORIGIN":
                            break;
                            case "START":
                                String ct = instarr[i+1];
                                opcode = Integer.toString(POT.get(str));
                                 op = op +"\t"+ opcode + "\t"+ct;
                            break;
                            case "LTORG":
                                for(Map.Entry<String, Integer> me: litset){
                                    String s = me.getKey();
                                    String intVal = s.replaceAll("[^0-9]", "");
                                    op = op+"\t"+"0"+intVal;
                                }   
							break;
                            default:
                                opcode = Integer.toString(POT.get(str));
                                op = op +"\t"+ opcode;
                            break;
                                }
                            }
                            else if(MOT.containsKey(str)){
                                opcode = Integer.toString(MOT.get(str));
                                op = op +"  "+ opcode;
                            }
                            else if(DL.containsKey(str)){
                                opcode = Integer.toString(DL.get(str));
                                op = op +"\t"+ opcode;
                            }
                            else if(Register.containsKey(str)){
                                opcode = Integer.toString(Register.get(str));
                                op = op +"\t"+ opcode;
                            }
                            else if(symbol.containsKey(str)){
                                int sy = symbol.get(str);
                                String sop = Integer.toString(sy);
                                if(instr.indexOf(str)!=0){
                                    op = op+"\t"+sop;
                                }
                            }
                            else if(literal.containsKey(str)){
                                opcode = Integer.toString(literal.get(str));
                                op = op +"\t"+ opcode;
                            }
                        }
                    }
                    System.out.println("Output of pass one assembler: "+op);
                    writer.write(op);
                    writer.newLine();
                }
            }
	}
}
=======
//package passOne;
/**
 * This is a java program to demonstrate the working of pass one assembler
 * programmed with LOVE by Siddharth Kulkarni
 * rollNo: tecoc340
 * batch: C3
 */
import java.util.*;
import java.io.*;

class PassOne{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])throws Exception{
		
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
		POT.put("START", 1);
		POT.put("END", 2);
		POT.put("EQU", 3);
		POT.put("ORIGIN", 4);
		POT.put("LTORG", 5);
		
		HashMap<String, Integer> DL = new HashMap<>();
		DL.put("DS", 1);
		DL.put("DC", 2);
		
		HashMap<String, Integer> Register = new HashMap<>();
		Register.put("AREG", 1);
		Register.put("BREG", 2);
		Register.put("CREG", 3);
		Register.put("DREG", 4);
		
		HashMap<String, Integer> symbol = new HashMap<>();
		HashMap<String, Integer> literal = new HashMap<>();
		//HashMap<Integer, Integer> pool = new HashMap<Integer, Integer>();
        Set<Map.Entry<String, Integer>> litset = literal.entrySet();
        Set<Map.Entry<String, Integer>> symset = symbol.entrySet();
		int lc = 0;
        String strt = "";
		File f = new File("C:\\Users\\Siddharth\\git\\repository\\PassOne\\Assembler\\src\\passOne\\test.txt");
		Scanner sin = new Scanner(f);
		while(sin.hasNextLine()){
			String instr = sin.nextLine();
			ArrayList<String>splitInst = new ArrayList<>(4);
			String[] instarr = instr.split("\t", 4);
                        for (String instarr1 : instarr) {
                            splitInst.add(instarr1);
                        }
			for(int i=0;i<splitInst.size();i++){
				String str = splitInst.get(i);
				if(!str.isEmpty()) {
					if(POT.containsKey(str)){
                        switch (str){
                            case "START":
                                lc = Integer.parseInt(instarr[i+1]);
                                strt = str;
                            break;
                            case "END":
                                for(Map.Entry<String, Integer> me: litset){
                                    int val = me.getValue();
                                    String key = me.getKey();
                                    if(val==0){
                                        int k = literal.replace(key, lc);
                                    }
                                }
                            break;
                            case "LTORG":
                                strt = str;
                                for(Map.Entry<String, Integer> me: litset){
                                     int v = me.getValue();
                                    String s = me.getKey();
                                    if(v==0){
                                        int k = literal.replace(s, lc);
                                        lc++;
                                    }
                                }
                            break;
                            case "ORIGIN":
                                lc = Integer.parseInt(instarr[i+1]);
                            break;
                        }
					}
                    else if(MOT.containsKey(str)) {
						//do nothing
					}
					else if(Register.containsKey(str)) {
						//do nothing
					}
                     else if(DL.containsKey(str)){
                        switch (str){
                            case "DS":
                                {
                                    String s = instarr[i-1];
                                    for(Map.Entry<String, Integer> me:symset){
                                        String k = me.getKey();
                                        if(k.equals(s)){
                                            int k2 = symbol.replace(s, lc);
                                        }
                                    }
                            break;
                        }
                            case "DC":
                            {
                                String s = instarr[i-1];
                                for(Map.Entry<String, Integer> me:symset){
                                    String k = me.getKey();
                                    if(k.equals(s)){
                                        int k2 = symbol.replace(s, lc);
                                    }
                                }
								break;
							}
                        }
                    }
					else {
						boolean b = str.matches(symb);
						boolean c = str.matches(liter);
						if(b){
                            int in = str.indexOf(str);
                            if(in==0)
								symbol.put(str, lc);
                            else
                                symbol.put(str, 0);
						}
						else if(c){
							literal.put(str, 0);
						}
					}
				}
			}
            if(!strt.equals("START")){
                lc++;
            }
            strt = "NAN";
		}
		System.out.println("Symbol\t\tLocation counter");
		for(String i: symbol.keySet()){
			System.out.println(" "+i+"\t\t"+symbol.get(i));
		}
		System.out.println();
		
		System.out.println("literal\t\tLocation counter");
		for(String i: literal.keySet()){
			System.out.println(" "+i+"\t\t"+literal.get(i));
		}
		System.out.println();
        File ft = new File("C:\\Users\\Siddharth\\git\\repository\\PassOne\\Assembler\\src\\passOne\\test.txt");
		Scanner sinq = new Scanner(ft);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Siddharth\\git\\repository\\PassOne\\Assembler\\src\\passOne\\output.txt"))) {
        while(sinq.hasNextLine()){
            String op = "";
            String instr = sinq.nextLine();
            ArrayList<String>splitInst = new ArrayList<>(4);
            String[] instarr = instr.split("\t", 4);
            for (String instarr1 : instarr){
                splitInst.add(instarr1);
            }
            for(int i=0;i<splitInst.size();i++){
                String str = splitInst.get(i);
                if(!str.isEmpty()){
                    String opcode;
                    if(POT.containsKey(str)){
                        switch (str){
                            case "EQU":
                            case "ORIGIN":
                            break;
                            case "START":
                                String ct = instarr[i+1];
                                opcode = Integer.toString(POT.get(str));
                                 op = op +"\t"+ opcode + "\t"+ct;
                            break;
                            case "LTORG":
                                for(Map.Entry<String, Integer> me: litset){
                                    String s = me.getKey();
                                    String intVal = s.replaceAll("[^0-9]", "");
                                    op = op+"\t"+"0"+intVal;
                                }   
							break;
                            default:
                                opcode = Integer.toString(POT.get(str));
                                op = op +"\t"+ opcode;
                            break;
                                }
                            }
                            else if(MOT.containsKey(str)){
                                opcode = Integer.toString(MOT.get(str));
                                op = op +"  "+ opcode;
                            }
                            else if(DL.containsKey(str)){
                                opcode = Integer.toString(DL.get(str));
                                op = op +"\t"+ opcode;
                            }
                            else if(Register.containsKey(str)){
                                opcode = Integer.toString(Register.get(str));
                                op = op +"\t"+ opcode;
                            }
                            else if(symbol.containsKey(str)){
                                int sy = symbol.get(str);
                                String sop = Integer.toString(sy);
                                if(instr.indexOf(str)!=0){
                                    op = op+"\t"+sop;
                                }
                            }
                            else if(literal.containsKey(str)){
                                opcode = Integer.toString(literal.get(str));
                                op = op +"\t"+ opcode;
                            }
                        }
                    }
                    System.out.println("Output of pass one assembler: "+op);
                    writer.write(op);
                    writer.newLine();
                }
            }
	}
}
>>>>>>> acfdde7ffde4a06a5b160a50d86f8980fab1934d
>>>>>>> a4a590a54071c139ba587b93d0c42d571b20c322
