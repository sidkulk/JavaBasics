package javaBasics.hcfLcm;

import java.util.Scanner;
import java.util.*;

class HcfLcmImprov {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter any integer: ");
		int k = sc.nextInt();
		Vector<Integer> HcfArr = Oper.getHcf(arr, k);
		HcfArr.forEach((n) -> System.out.println("("+k+" "+arr+")"+"\t"+n));
	}
}

class Oper {
	public static Vector<Integer> getHcf(int[] arr, int k) {
		Vector<Integer> hcfVect = new Vector<>();
		for(int i=0;i<arr.length;i++){
			int maximum = Math.max(arr[i], k);
			for(int j=1;j<maximum;j++){
				if(arr[i]%j==0 && k%j==0){
					hcfVect.add(j);
				}
			}
		}
		return hcfVect;
	}
}