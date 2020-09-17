class A{
	int a, b;
	A(int i, int j){
		a = i;
		b = j;
	}
	
	void show(){
		System.out.println("From Class A, a and b: "+a+" "+b);
	}
}

class B extends A{
	int k;
	B(int i, int j, int k){
		super(i, j);
		this.k = k;
	}
	
	void show(){
		System.out.println("From Class B, k is: "+k);
		super.show();
	}
}

class Main{
	public static void main(String args[])throws Exception{
		B ob = new B(10, 20, 30);
		ob.show();
		
	}
}

/*
DYNAMIC METHOD DISPACH DEMONSTARTION: 	

*/

class Base{
	void callMe(){
		System.out.println("Inside Base Class.");
	}
}

class Deriv1 extends Base{
	void callMe(){
		System.out.println("Inside Derived 1 Class.");
	}
}

class Deriv2 extends Base{
	void callMe(){
		System.out.println("Inside Derived 2 Class.");
	}
}

class MainTwo{
	Base bs = new Base();
	Deriv1 dv1 = new Deriv1();
	Deriv2 dv2 = new Deriv2();
	
	bs.callMe();
	dv1.callMe();
	dv2.callMe();
}