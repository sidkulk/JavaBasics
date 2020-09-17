/**
*	Demonstration of Inner classes in Java
*
*/

class Outer{
	int a = 10;
	
	static int b = 20;
	
	class Inner{
		void getIntegerValue(){
			Outer o = new Outer();
			System.out.println("the value of the non.sattic variable in the outer class is: "+o.a);
			System.out.println("the value of the static variable in outer class is: "+b);
		}
	}
	
	static class staticInnerClass{
		void getClassData(){
			System.out.println("value of the outer class static variable is: "+b);
			Outer out = new Outer();
			System.out.println("the value of the outer non-static variable is: "+out.a);
		}
	}
	
	static void showInt(){
		System.out.println("value of static variable is: "+10);
	}
}

public class argPass{
	public static void main(String ...args)throws Exception{
		
		/*
			the difference between static and
			non static inner class object creation
		*/
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();	//Object creation of non-static Inner class
		Outer.staticInnerClass in2 = new Outer.staticInnerClass();	//Object creation of static inner class
		
		System.out.println("Non-Static inner Class method called");
		in.getIntegerValue();
		System.out.println();
		System.out.println("Static Inner Class method called");
		in2.getClassData();
	}
}


interface Interf{
	double subDouble(double ..x);
	double addDouble(double ..x);
}

class Test implements Interf{
	
	static double res;
	static double subDouble(double ..x){
		for(int i=0;i<x.length;i++){
			res = res + x[i];
		}
		return res;
	}
}