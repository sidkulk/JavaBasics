interface interd{
	void push(int i);
	int pop();
}

class FixedStack implements interd{
	private int[] stck;
	private int tos;
	
	FixedStack(int size){
		stck = new int[size];
		tos = -1;
	}
	
	public void push(int i){
		if(tos==stck.length-1)
			System.out.println("Stack is full");
		else
			stck[++tos] = i;
	}
	
	public int pop(){
		if(tos < 0){
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return stck[tos--];
	}
}

class Main{
	public static void main(String args[]){
		FixedStack fx1 = new FixedStack(5);
		FixedStack fx2 = new FixedStack(8);
		
		for(int i=0;i<5;i++) fx1.push(i);
		
		for(int i=0;i<8;i++) fx2.push(i);
		
		
	}
}