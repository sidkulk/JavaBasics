package Hcflcm;

import java.util.*;

class HcfLcm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, min, gcd=0, lcm;
		System.out.print("Enter 2 integers to find their HCF and LCM: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		min = Math.min(a, b);
		
		for(int i=1;i<=min;i++){
			if(a%i==0 && b%i==0){
				gcd = i;
			}
		}
		lcm = (a * b)/gcd;
		
		System.out.println("HCF of "+a+" and "+b+" is "+gcd);
		System.out.println("LCM of "+a+" and "+b+" is "+lcm);
		sc.close();
	}
}