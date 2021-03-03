import static java.lang.System.out;
import java.util.*;

class FizzBuzz {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				if(i%5 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Fizz");
				}
			} else if(i%5==0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}

class TwoSum {
	static int num1, num2;
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 6, 8, 9};
		effCheckSum(arr, 11);
		out.println("values of arr elements: "+num1+" and "+num2);
	}
	
	//The brute force solution
	public static void checkSum(int[] arr, int sum) {
		int flag = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == sum) {
					out.println("Success!");
					num1 = arr[i];
					num2 = arr[j];
					flag = 1;
					break;
				}
			}
			if(flag == 1) break;
		}
		if(flag == 0) out.println("Failed!");
		return;
	}
	
	//The efficient way: using a data structure called Hashset.
	public static void effCheckSum(int[] arr, int sum) {
		HashSet<Integer> hset = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(hset.contains(sum-arr[i])) {
				out.println("Success!");
				num1 = arr[i];
				num2 = sum-arr[i];
				break;
			} else {
				hset.add(arr[i]);
			}
		}
	}
}

abstract class PreDev<T> {
	public abstract void setValues(T var1, T var2);
	public abstract T getValues(T var1, T var2);	
}


