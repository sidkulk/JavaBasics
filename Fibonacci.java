/**
	Program to print fibonacci series...
*/

class Fib{
	public static void main(String args[]){
		int a=1, b=1, k=0;
		System.out.print(a+" "+b);
		while(k<100){
			k = a+b;
			System.out.print(" "+k);
			a = b;
			b = k;
		}
	}
}