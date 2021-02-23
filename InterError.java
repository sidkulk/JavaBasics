interface Alpha{
	default void meth(){
		System.out.println("Inside Alpha");
	}
}

interface Beta{
	default void meth(){
		System.out.println("Inside Beta");
	}
}

class InterErr implements Alpha, Beta{
	void OwnMeth(){
		System.out.println("Class specific method");
	}
	 //after overriding the methods, error wont occure in the program.
	public void meth(){
		System.out.println("Methods of Alpha and Beta are overridden");
	}
}

class MainClass{
	public static void main(String ...args){
		/**
			the below code will result in an error because both the interfaces
			have same default method signature and hence, would result in an
			ambiguity/conflict.
		
		
		InterErr ob = new InterErr();
		ob.meth();
		
		To resiove such a situation, the class implementing the interfaces must override the methods.
		*/
		InterErr ob = new InterErr();
		ob.meth();
		
	}
}