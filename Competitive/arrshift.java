import java.util.*;


class Main{
	public static void main(String args[]){
		int size;
		Oper op = new Oper();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter left shift factor: ");
		int lshift = sc.nextInt();
		int[] res = new int[size];
		res = op.leftShift(arr, lshift, size);
		System.out.println("Array after shifting once: ");
		for(int i=0;i<size;i++){
			System.out.print(res[i]+" ");
		}
	}
}

class Oper{
	int[] leftShift(int[] arr, int lshift, int size){
		int temp = 0;
		for(int j=0;j<lshift;j++){
			temp = arr[0];
			for(int i=0;i<arr.length-1;i++){
				arr[i] = arr[i+1];
			}
		}
		arr[size-1] = temp;
		return arr;
	}
}
