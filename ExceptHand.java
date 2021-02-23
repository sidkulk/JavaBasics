class Test{
	static int div(int a, int b){
		return a/b;
	}
	
	public static void main(String args[]){
		try{
			int a = args.length;
			int b = 42;
			b = div(a, b);
		}catch(ArithmeticException e){
			System.out.println("Exception: "+e);
		}
	}
}


class TestExcept{
	public static void getExcept(){
		try{
			throw new NullPointerException("Exception test");
		}catch(NullPointerException e){
			System.out.println("Exception caught: "+e);
		}
	}
	
	public static void main(String args[]){
		try{
			getExcept();
		}catch(NullPointerException e){
			System.out.println("Caught inside main: "+e);
		}
	}
}

class TestTwoExcept{
	public static void nestedTry(){
		try{
			try{
				throw new NullPointerException("called within the nested try");
			}catch(ArithmeticException e){
				System.out.println("Caught in inener catch: "+e);
			}
		}catch(ArithmeticException e){
			System.out.println("Caught exception in outer catch: "+e);
		}catch(NullPointerException e){
			System.out.println("Caught exception in outer catch: "+e);
		}
	}
	
	public static void main(String args[]){
		nestedTry();
	}
}

class TestUserExcept{
	public static int div(int a, int b)throws DivByZero{
		int res;
		System.out.println("Division method called");
		if(b==0){
			throw new DivByZero(b);
		}
		else{
			res = a/b;
		}
		return res;
	}
	
	public static void main(String args[]){
		int a = 10, b=0;
		try{
			int res = div(a, b);
			System.out.println("Division of "+a+" and "+b+" is: "+res);
		}catch(DivByZero e){
			System.out.println("Exception caught: "+e);
		}
	}
}

class DivByZero extends Exception{
	private int divisor;
	DivByZero(int a){
		divisor = a;
	}
	
	public String toString(){
		return "Divide by zero attempt caught!";
	}
}