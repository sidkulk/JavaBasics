package javaBasics;

import java.util.Scanner;

class ToBinary {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int size = 0;
		System.out.print("How many numbers do you want to convert into binary: ");
		size = sc.nextInt();
		
		int[] arrNum = new int[size];
		
		System.out.println("Enter the numbers: ");
		for(int i=0;i<size;i++){
			arrNum[i] = sc.nextInt();
		}
		
		String[] arrBin = toBin(arrNum);
		System.out.println("Their binary conversions: ");
		for(int i=0;i<size;i++){
			System.out.println(arrNum[i]+" --> "+arrBin[i]);
		}
	}
	
	public static String[] toBin(int... a)throws Exception{
		String[] binNums = new String[a.length];
		//System.out.println("Entered the method..");
		for(int i=0;i<a.length;i++){
			int quo = a[i];
			String binNum = "";
			while(true){
				int rem = quo%2;
				quo = quo/2;
				binNum = binNum + Integer.toString(rem);
				//System.out.println("Entered while loop. binNum value: "+binNum+" quo value: "+quo+" rem value: "+rem);
				if(quo==0 || quo==1)
					break;
			}
			binNum = binNum + Integer.toString(quo);
			StringBuffer sb = new StringBuffer(binNum);
			binNum = sb.reverse().toString();
			binNums[i] = binNum;
		}
		return binNums;
	}
}