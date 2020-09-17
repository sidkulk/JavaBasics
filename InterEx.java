public interface Oper{
	double add(double a, double b);
	double sub(double a, double b);
	double div(double a, double b);
	double mul(double a, double b);
}

class Operimplement implements Oper{
	public double add(double a, double b){
		return(a+b);
	}
	
	public double sub(double a, double b){
		return(a-b);
	}
	
	public double mul(double a, double b){
		return(a*b);
	}
	
	public double div(double a, double b){
		return(a/b);
	}
}

class MainApp{
	public static void main(String args[]){
		double res;
		Oper op = new Operimplement();
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