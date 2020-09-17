/**
*	Demonstration of Multilevel inheritance
*
*/

class A{
	private double a, b, c;
	A(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Parameterized constructor called in super class");
	}
	
	A(){
		System.out.println("Default constructor called in super class");
	}
	
	void getData(){
		System.out.println("value of a, b and c is: "+a+" "+b+" "+c+" "+" respectively");
	}
}

class B extends A{
	double d;
	B(double a, double b, double c, double d){
		super(a, b, c);	//calls the parameterized constructor of the immediate parent class i.e A(a, b, c){};
		this.d = d;
		System.out.println("Parameterized constructor called in subclass");
	}
	
	B(){
		super();	//calls the default constructor of the immediate parent class i.e A(){};
		System.out.println("Default constructor called in subclass");
	}
	
	void getData(){
		//System.out.println("value of a, b, c and d is: "+a+" "+b+" "+c+" "+d+" respectively");
		System.out.println("value of d is: "+d);
	}
}

class Main{
	public static void main(String args[])throws Exception{
		B obj1 = new B(10, 34.45, 56.2, 78.2);
		B obj2 = new B();
	}
}