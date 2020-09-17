/**
	DEMONSTARTION OF NESTED INTERFACES
*/

class A{
	//interface declared as public 
	public interface interf{
		boolean isNotNegative(int i);
	}
}


//class B implements the interface inside A which is declared as public 
class B implements A.interf{
	public boolean isNotNegative(int i){
		return i<0?false:true;
	}
}

class Main{
	public static void main(String args[]){
		
		//the reference of interface is assigned to object of B because B implements the interface
		A.interf nif = new B();
		if(nif.isNotNegative(-10)){
			System.out.println("This wont execute");
		}
		if(nif.isNotNegative(20)){
			System.out.println("it's a positive integer");
		}
	}
}