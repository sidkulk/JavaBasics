package javaPract;

import java.util.*;

class StringDup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"Java", "ruby", "Python", "java", "python", "cobol", "BASIC"};
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i].toLowerCase();
		}
		String dup = "";
		Set<String> arrset = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(arrset.add(arr[i]) == false) {
				dup  = dup + arr[i] + " ";
			}
		}
		
		System.out.println("Duplicate entries: "+dup);
	}
}