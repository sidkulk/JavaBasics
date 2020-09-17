/**
*	Accessing implementations through interface reference
*
*/

interface Callback{
	void getValue(int a);
}

class Client implements Callback{
	public void getValue(int p){
		System.out.println("Callback called with: "+p); //implemented method. The method should be made PUBLIC
	}
}

class AnotherClient implements Callback{
	public void getValue(int p){	//another class implemented method
		System.out.println("Called from AnotherCLient class");
		System.out.println("Called with a value of: "+p);
	}
}

class Testinterf extends Incomp{
	public static void main(String args[]){
		Callback c = new Client();//reference variable of interface assigned to class Client
		c.getValue(10);	//method implementation of client class is called at runtime
		c = new AnotherClient();	//reference now assigned to Anotherclass 
		c.getValue(20);	//mehtod implementation of that class called at runtime after method resolution
		
		Testinterf tf = new Testinterf();
		double area = tf.SurfaceArea(20.45, 56.23);
		System.out.println("Surface area: "+String.format("%.2f", area));
	}
	
	//If a class inherits an abstract class that implements an interface incompletely then, the method in the 
	//interface should be impemented by the inhereting class. The method should be declared as public.
	public double SurfaceArea(double a, double b){
		return (a*b);	
	}
}


interface IfOne {
	double SurfaceArea(double a, double b);
}

//if a class does not implement the interface then that class needs to be declared as an abstract class
abstract class Incomp implements IfOne{
	void getStringData(){
		System.out.println("This class does not implement the interface.");
	}
}