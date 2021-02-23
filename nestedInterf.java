/**
NESTED INTERFACE CASES
*/

//CASE 1: INTERFACE WITHIN AN INTERFACE
interface if1{
	void meth1();
	interface if2{
		void meth2();
	}
}

class A implements if1, if1.if2{
	public void meth1(){
		System.out.println("Inside meth 1");
	}
	
	public void meth2(){
		System.out.println("Inside meth 2");
	}
}


//---------------------MAIN CLASS---------------------
class Main{
	public static void main(String args[]){
		A ob = new A();
		ob.meth1();
		ob.meth2();
		
		Base b = new Base();
		b.meth1();
		b.meth2();
		
		Impl nb = new Impl();
		nb.meth();
		nb.nestMeth();
		
		Oper op = new Exper();
		double res;
		
		res = op.add(10, 20.56);
		System.out.println("Addition is: "+res);
		
		res = op.sub(45.45, 34.67);
		System.out.println("Subtraction is: "+res);
		
		res = op.mul(45.45, 34.67);
		System.out.println("product is: "+res);
		
		res = op.div(45.45, 34.67);
		System.out.println("Division is: "+res);
	}
}
//----------------------------------------------------


//CASE 2 INTERFACE WITHIN AN ABSTRACT CLASS
abstract class Interclass{
	abstract void meth1();
	interface if3{
		void meth2();
	}
}

class Base extends Interclass implements Interclass.if3{
	public void meth1(){
		System.out.println("inside meth 1");
	}
	
	public void meth2(){
		System.out.println("Nested interface implemented");
	}
}
//**************************************************************


//CASE 3: INTERFACE WITHIN A NORMAL CLASS
class NextBase{
	void meth(){
		System.out.println("Native method");
	}
	
	interface nestinter{
		void nestMeth();
	}
}

class Impl extends NextBase implements NextBase.nestinter{
	public void nestMeth(){
		System.out.println("Inside the nested interface in class NextBase");
	}
}
//**************************************************************

class Exper extends Operimplement{
	
}