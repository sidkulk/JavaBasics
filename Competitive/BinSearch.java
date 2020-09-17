import java.util.*;

class Binsrch{
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter elements in the array: ");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered Array: ");
		for(int i=0;i<size;i++){
			System.out.print(" "+arr[i]+" ");
		}
		
		System.out.println("\nEnter the data to be searched: ");
		int data = sc.nextInt();
		
		int suc = 0;
		Srch s = new Srch();
		suc = s.search(arr, data);
		if(suc <= 0)
			System.out.println(suc+" Search assessment terminated!");
		else
			System.out.println("Search assessment success!");
		
		sc.close();
	}
}


//Binary search algo
class Srch{
	Srch(){
		System.out.println("Search class initiated.");
	}
	
	public int search(int[] arr, int data){
		int size = arr.length;
		int left = 0;
		int right = size-1;
		int status = -1;
		int mid = 0;
		
		Sort srt = new Sort();
		arr = srt.sortArr(arr);
		
		while(left<=right){
			mid = (left+right)/2;
			if(data > arr[mid]){
				left = mid+1;
			}
			
			else if(data < arr[mid]){
				right = mid-1;
			}
			
			else if(data==arr[mid]){
				status = data;
				System.out.println("Data found! returning to main class");
				break;
			}
			
			else{
				System.out.println("Search failure! returning to main class");
				break;
			}
		}
		return status;
	}
}

//Bubbe sort to ensure that the array is sorted.
class Sort{
	public int[] sortArr(int[] arr){
		int pass = 0;
		for(int i=0;i<arr.length-1;i++){
			int flag = 0;
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					flag = 1;
				}
			}
			if(flag==0){
				System.out.println("Array is sorted after "+pass+" passes, no need of n-1 passes, returning to search assessment");
				break;
			}
			pass++;
		}
		return arr;
	}
}