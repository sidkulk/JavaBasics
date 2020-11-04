package javaBasics;

import java.util.*;
import java.util.Map.*;
/**
*
*	JAVA PROGRAM TO PRINT DUPLICATE ELEMNTS IN AN ARRAY:
*/

//Approach 1: NESTED FOR LOOP; WORST APPROACH
class DuplicateElem {
	public static void main(String args[]) {
		String[] arr = {"java", "Ruby", "Python", "Javascript", "Go", "COBOL", "ruby", "Java"};
		
		String dup = Duplicate(arr);
		System.out.println("Duplicate string: "+dup);
	}
	
	public static String Duplicate(String[] arr){
		String dup = "";
		
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i].toLowerCase();
		}
		
		for(int i=0;i<arr.length-1;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[j].equals(arr[i])){
					dup = dup + arr[j] + " ";
				}
			}
		}
		return dup.trim();
	}
}


//Approach 2: USING HASH-SET

//HASH-SET stores unique values
class DupliMethTwo {
	public static void main(String args[]) {
		String[] arr = {"java", "Ruby", "Python", "Javascript", "Go", "COBOL", "ruby", "Java"};
		
		String dup = Duplicate(arr);
		System.out.println("Duplicate string: "+dup);
	}
	
	public static String Duplicate(String[] arr){
		Set<String> store = new HashSet<>();
		String dup = "";
		
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i].toLowerCase();
		}
		
		for(String elem : arr){
			//the .add() method returns 'true' if that element is not present
			//in the HashSet, returns 'false' otherwise
			if(store.add(elem)==false) {
				dup = dup + elem + " ";  
			}
		}
		
		return dup.trim();
	}
}


//Approach 3: USING HASHMAP
class DupMethThree {
	public static void main(String args[]) {
		String[] arr = {"java", "Ruby", "Python", "Javascript", "Go", "COBOL", "ruby", "Java"};
		
		String dup = Duplicate(arr);
		System.out.println("Duplicate string: "+dup);
	}
	
	public static String Duplicate(String[] arr) {
		String dup = "";
		//Map<Key, Value> here key is the elements from array and value is an 
		//integer value to the key.
		Map<String, Integer> store = new HashMap<>();

		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i].toLowerCase();
		}
		
		for(String elem : arr){
			Integer count = store.get(elem);
			if(count == null){
				store.put(elem, 1);
			}
			else{
				store.put(elem, ++count);
			}
		}
		//the entrySet() returns a Set of key, value pair of type Entry<key, value>
		//that is Set<Entry<key, value>>
		Set<Entry<String, Integer>> entrySet = store.entrySet();
		
		//.getValue() returns the Integer part and .getKey returns the String key
		for(Entry<String, Integer> entry : entrySet){
			if(entry.getValue() > 1){
				dup = dup + entry.getKey() + " ";
			}
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println("---------------------");
		
		return dup.trim();
	}
}