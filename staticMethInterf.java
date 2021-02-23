interface inTerf{
	void normMeth();
	
	static void StaticMeth(int i){
		System.out.println("You have passed "+i+" as an argument");
	}
}

class StaticImpl implements inTerf{
	public void normMeth(){
		System.out.println("This is a normal method override.");
	}
	
	//static methods are not inherited by the implementing class
}

class MainApp{
	public static void main(String args[]){
		inTerf inst = new StaticImpl();
		
		//calling the implemented method through interface's instance variable referring the implementing class
		inst.normMeth();
		
		//static method is directly called my the interface name and the method name with the dot operatior
		inTerf.StaticMeth(10);
	}
}