package arraysDemoPack;

import java.util.*;
import static java.lang.System.out;

//Sorting an array..
class MainClass {
	public static void main(String[] args) {
		int[] nums = {3, 5, 6, 2, 9, 7};
		
		out.println("Before sorting: ");
		for(Integer iter : nums) {
			out.print(" "+iter);
		}
		out.println();
		Arrays.sort(nums);
		
		out.println("After sorting: ");
		for(Integer iter : nums) {
			out.print(" "+iter);
		}
		out.println();
		
		char[] characters = {'a', 'g', 'w', 'z', 'd', 'Z', 'D'};
		Arrays.sort(characters);	//Characters are sorted as per their Unicode values
		for(Character chariter : characters) {
			out.println(chariter);
		}
		
		out.println();
		
		String[] strArr = {"abs", "zas", "gh", "bcd", "tr"};
		Arrays.sort(strArr);	//Strings are sorted as per their Unicode values
		for(String iter : strArr) {
			out.print(" "+iter);
		}
		out.println();
	}
}


//Searching an element in an array: 
class MainSearchClass {
	public static void main(String[] args) {
		//we use binarySearch() method. the array needs to be sorted first
		int[] numbers = {5, 4, 3, 2, 1, 0, -1};
		Arrays.sort(numbers);
		
		out.println("searching element 4. Found at index: "+Arrays.binarySearch(numbers, 4));
		out.println("searching element 2. Found at index: "+Arrays.binarySearch(numbers, 2));
		out.println("searching element -2. Found at index: "+Arrays.binarySearch(numbers, -2)); //returns -1 bcz: insertion index of -2 will be 0. So -(insertion_index + 1) is returned when element not found
		
		String[] str = {"we", "kl", "gb", "yt", "az"};
		Arrays.sort(str);
		
		out.println("index of string \"we\" is: "+Arrays.binarySearch(str, "we"));
	}
}

