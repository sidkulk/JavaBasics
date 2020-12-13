class A{
	public static void main(String args[]){
		A ob = new A();
		ob.fun1(5);
	}
	
	public static void fun1(int n){
		int i = 0;
		if(n>1){
			fun1(n-1);
		}
		for(i=0;i<(n-1);i++){
			System.out.print(" "+"A");
		}
	}		
}