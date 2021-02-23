class Main{
	public static void main(String[] args){
		Main ob = new Main();
		int res = ob.fun(1);
	}
	
	public int fun(int c){
		System.out.print(" "+c);
		if(c<3){
			c = c + 2;
			fun(fun(c));
		}
		return c;
	}
}

