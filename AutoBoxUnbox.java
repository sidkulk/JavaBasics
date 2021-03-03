package javaBasics;


/**
*
*	DEMONSTRATION OF JAVA'S AUTO-BOXING AND AUTO-UNBOXING FEATURE
*
*	WRAPPING UP OF JAVA'S PRIMITIVE TYPR INTO IT'S CORROSPONDING WRAPPER OBJECT
*	IS CALLED BOXING.
*
*	UNWRAPPING AND RETURNING THE VALUE IN A WRAPPER TO A PRIMITIVE TYPE IS CALLED
*	UNBOXING.
*/
class BoxDemo {
	public static void main(String args[])throws Exception {
		Integer iOb = new Integer(100); //Boxing
		Integer iOab = 130; //autoboxing
	
		Integer iOb2 = new Integer("120"); //Boxing string that contains numeric value
		System.out.println("String to numeric conversion: "+iOb2);
	
		
	
	
		int i = iOb.intValue();
		int j = iOab; //auto-unboxing
		System.out.println("i = "+i+" j = "+j); //unboxing
	}
}