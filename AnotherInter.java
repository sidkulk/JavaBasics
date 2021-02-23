interface inter{
	void show();
}


abstract class Incomp implements inter{
	void get(){
		System.out.println("This is from incomplete class");
	}
}


class Complete extends Incomp{
	public static void main(String ...args){
		Complete c = new Complete();
		c.get();
		c.show();
	}
	
	
	public void show(){
		System.out.println("Complete class implemented the interface");
	}
}

/*
Interview Question:
Why is the Incomp class declared as abstract? Justify your answer.

What will be the output of the above program? Will it execute or not? If not then justify.
*/

interface if1{
	void getFlingoNumber();
	
	interface NestedInterf{
		void nestedInterf();
	}
}