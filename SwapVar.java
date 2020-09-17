package javaBasics;

class ExtraVar{
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		
		System.out.println("A : "+a+" and B: "+b);
		
		System.out.println("After swapping: ");
		
		/**
				Using an extra variable: 
		*/
		int tmp = a; //tmp = 10
		a = b;	//a = 20
		b = tmp;	//b = 10
		
		System.out.println("A : "+a+" B: "+b);
	}
}

class NoExtraVar {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("A : "+a+" B: "+b);
		System.out.println("After swapping without extra variable: ");
		/*
			Using no tmp variable
		*/
		
		a = a + b;	//a = 30
		b = a - b;	//b = 10
		a = a - b;	//a = 20
		
		System.out.println("A : "+a+" B: "+b);
	}
}

class MulAndDivOper {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("A : "+a+" B: "+b);
		System.out.println("After swapping without extra variable using * and /: ");
		/*
			Using no tmp variable
		*/
		
		a = a * b;	//a = 30
		b = a / b;	//b = 10
		a = a / b;	//a = 20
		
		System.out.println("A : "+a+" B: "+b);
	}
}

class XorOperSwap {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("A : "+a+" B: "+b);
		System.out.println("After swapping without extra variable using ^ operator: ");
		/*
			Using no tmp variable
		*/
		
		a = a ^ b;	//a = 30
		b = a ^ b;	//b = 10
		a = a ^ b;	//a = 20
		
		System.out.println("A : "+a+" B: "+b);
	}
}