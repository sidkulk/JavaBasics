import java.util.*;

interface Arith1{
	double add(double ...a);
	double sub(double ...a);
}

interface Arith2 extends Arith1{
	double mul(double ...a);
	double div(double a, double b);
}

class Imp implements Arith2{
	double res;
	public double add(double ...a){
		for(int i=0;i<a.length;i++){
			res = res + a[i];
		}
		return res;
	}
	
	public double sub(double ...a){
		for(int i=0;i<a.length;i++){
			res = res + a[i];
		}
		return res;
	}
	
	public double mul(double ...a){
		for(int i=0;i<a.length;i++){
			res = res + a[i];
		}
		return res;
	}
	
	public double div(double a, double b){
		try{
			if(b==0){
				throw new MyException("Divide by zero error");
			}
			else
				return a/b;
		}
		catch(Exception e){
			System.out.println(e);
			return 0;
		}
	}
}

class MyException extends Exception{
	public MyException(String s){
		super(s);
	}
}

class MainClass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Imp ob = new Imp();
		double res;
		System.out.println("Simple calculator");
		System.out.println("How to use: ");
		System.out.println("Type ADD, SUB, MUL or DIV and then press enter");
		System.out.println("Then type the numbers to be operated, leave space between two numbers.");
		
		String oper = sc.nextLine();
		switch(oper){
			case("ADD"):{
				do{
					double num;
					num = 
				}while(sc.hasNextLine())
				res = ob.add();
			}
			break;
			
			case("SUB"):{
				
			}
			break;
			
			case("MUL"):{
				
			}
			break;
			
			case("DIV"):{
				
			}
			break;
			
			case("EXIT"):{
				System.exit(0);
			}
		}
	}
}