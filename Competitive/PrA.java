import java.util.*;

interface Oper{
	double div(double a, double b);
}

class App implements Oper{
	App(){
		System.out.println("App started...");
	}
	
	public double div(double a, double b){
		double res = 0;
		try{
			res = (a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return res;
	}
}

class ExcDemo{
	public static void main(String args[]){
		App app = new App();
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A's value: ");
		a = sc.nextDouble();
		System.out.print("\nEnter B's value: ");
		b = sc.nextDouble();
		double res = app.div(a, b);
		System.out.println("Division is: "+res);
	}
}