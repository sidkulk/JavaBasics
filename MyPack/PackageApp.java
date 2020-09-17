package MyPack;
import java.util.*;


abstract class A{
	double dim1, dim2, dim3;
	A(double x, double y, double z){
		dim1 = x;
		dim2 = y;
		dim3 = z;
	}
	
	abstract double Area();
	abstract double Volume();
}

class Box extends A{
	Box(double x, double y, double z){
		super(x, y, z);
		System.out.println("Working fine!");
	}
	
	double Area(){
		return dim1*dim2;
	}
	
	double Volume(){
		return dim1*dim2*dim3;
	}
}

class Sphere extends A{
	Sphere(double x, double y, double z){
		super(x, y, z);
		System.out.println("Working fine!");
	}
	
	double Area(){
		return (3.141*dim1*dim1);
	}
	
	double Volume(){
		return ((4/3)*3.141*dim2*dim2);
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Box b = new Box(10, 30, 20);
		Sphere s = new Sphere(30, 40, 50);
	}
}
