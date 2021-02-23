import java.util.*;

class Search extends Thread{
	public void run(){
		
	}
}

class Add extends Thread{
	
	private int[] array;
	
	void Sum(int[] arr){
		this.array = arr;
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
			System.out.println("Sum is: "+sum);
		}
	}
	
	public void run(){
		
	}
}

class Main{
	public static void main(String args[]){
		
		int arr[] = {12, 34, 45, 56, 78, 91, 102};
		String ch = "y";
		Scanner sc = new Scanner(System.in);
		System.out.println("A multi-threaded program");
		int c = 0;
		
		do{
			System.out.println("1) Add and multiply all elements of an array simultaneously");
			System.out.println("2) Search and multiply all elements simultaneously");
			System.out.print("Enter option: ");
			c = sc.nextInt();
			
			switch(c){
				case 1:{
					Add ob = new Add();
					ob.Sum()
				}
				break;
				
				case 2:{
					
				}
				break;
				
				default:System.out.println("Enter a valud option");
			}
			System.out.println("Do you want to continue?(y/n): ");
			ch = sc.nextLine();
		}while(ch.equals("y"));
	}
}