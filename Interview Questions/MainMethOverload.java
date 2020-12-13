package javaBasics;

class A {
	public static void main(String[] args) {
		System.out.println("A-method called");
		B.main(args);
	}
}

class B {
	public static void main(String[] args) {
		System.out.println("B-method called");
		A.main(args);
	}
}