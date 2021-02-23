import java.util.Scanner;

class Add implements Runnable{
	int arr[];
	Thread t;
	Add(int[] arr){
		this.arr = arr;
		t = new Thread(this, "addition thread");
		t.start();
	}
	
	public void run(){
		try{
			int sum = 0;
			System.out.println("Thread: "+t.getName());
			for(int i=0;i<this.arr.length;i++){
				sum = sum+this.arr[i];
				System.out.println("Calculated sum: "+sum);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(t.getName()+" has been interrupted");
		}
	}
}

class Multiply implements Runnable{
	int arr[];
	Thread t;
	Multiply(int[] arr){
		this.arr = arr;
		t = new Thread(this, "multiplication thread");
		t.start();
	}
	
	public void run(){
		try{
			int prod = 1;
			System.out.println("\n\t\t\tThread: "+t.getName());
			for(int i=0;i<this.arr.length;i++){
				prod = prod * this.arr[i];
				System.out.println("\n\t\t\tProduct of the elements: "+prod);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(t.getName()+" has been interrupted");
		}
	}
}

class Main{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter elements of array: ");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Inputted array: ");
		for(int i=0;i<size;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("Java Multi-threaded program");
		System.out.println("\nPerforming addition and multiplication simultaneously");
		new Multiply(arr);
		Thread.sleep(10);
		new Add(arr);
		
		
		sc.close();
	}
}