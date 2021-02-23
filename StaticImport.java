package javaBasics;

import static java.lang.System.out;

class StaticImpClass {
	public static void main(String[] args) {
		out.println("Using static imports to avoid long print statements");
	}
}

/**
*	Overloaded Constructor call
*/

class OverConst {
	Integer test;
	String stest;
	OverConst() {
		out.println("Inside the default constructor");
	}
	
	OverConst(Integer test, String stest) {
		this();
		this.test = test;
		this.stest = stest;
	}
	
	public static void main(String[] args) {
		OverConst ovr = new OverConst(121, "Test String");
		out.println(ovr.test+" "+ovr.stest);
	}
}

class NonMainClass {
	public void getString() {
		OverConst ovr = new OverConst(121, "From another class");
		out.println(ovr.test+" "+ovr.stest);
	}
}