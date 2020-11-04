package AddNumNoLoopClassFile;

import java.util.*;

class AddNum {
	static int sum = 0;
	static int num = 0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		int Sum = SumMeth(arr[num], arr.length);
		
		System.out.println("Sum of the array elements: "+sum);
	}
	
	public static int SumMeth(int arrElem, int size) {
		num++;
		if(num == arr.length)
			return
		else {
			sum = sum + SumMeth(arr[num], size);
			
		}
	}
}