class A{
	public static void main(String args[]){
		int a = 2, b = 3;
		A ob = new A();
		int res = ob.doSomething(a, b);
		System.out.println(res);
	}
	
	public int doSomething(int i, int j){
		if(j==1)
			return 0;
		else
			return (i + doSomething(i, j-1));
	}
}