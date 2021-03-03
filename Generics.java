package javaBasics;

import static java.lang.System.out;
import java.util.*;

/**
*	Here the Gen class is declared as a generic class and 
	the type parameter passed is <T> where T represents any type
*/
class Gen<T> {
	T ob;
	
	void setOb(T ob) {
		this.ob = ob;
	}
	
	T getOb() {
		return this.ob;
	}
	
	String showTypeOfOb() {
		return this.ob.getClass().getName();
	}
}

/**
*	Here the GenDemo class is using the Gen<> class to create 
*	an object which represents a type T.
*/
class GenDemo {
	public static void main(String[] args) {
		//Gen with Integer type represented.
		Gen<Integer> obj = new Gen<>();
		obj.setOb(12);
		System.out.println("Value of ob: "+obj.getOb());
		System.out.println("Type of class that ob represents: "+obj.showTypeOfOb());
		
		//Gen with String represented
		Gen<String> sObj = new Gen<>();
		sObj.setOb("String Gen class");
		System.out.println("sobj represents the data: "+sObj.getOb());
		System.out.println("sobj is of type: "+sObj.showTypeOfOb());
	}
}

/**
*A linkedList program using generics
*/

//Class Node that implements linkedlist methods
class Node<T> {
	T data;
	static Node head, tail;
	Node next;
	
	Node(T data) {
		this.data = data;
		next = null;
	}
	
	Node() {
		
	}
	
	void add(T data) {
		if(head == null) {
			head = new Node(data);
			head.next = null;
			tail = head;
		} else {
			Node curr = new Node(data);
			tail.next = curr;
			tail = curr;
		}
	}
	
	void display() {
		if(head == null) {
			System.out.println("No list created!");
		} else {
			Node tmp = head;
			while(tmp != null) {
				System.out.print(tmp.data+" -> ");
				tmp = tmp.next;
			}
			System.out.print("Null");
		}
	}
}

//class LlClass to demonstrate linkedlist
class LlClass {
	public static void main(String[] args) {
		Node<Object> ll = new Node<>();
		ll.add(12);
		ll.add(45);
		ll.add(12.56);
		ll.add("String");
		ll.display();
	}
}

/**
* Generic class with two type parameters
*/

class TwoType<K, V> {
	K key;
	V value;
	
	
	TwoType() {
		
	}
	
	TwoType(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	K getKey(V value) {
		return this.key;
	}
	
	V getValue(K key) {
		return this.value;
	}
}

class KeyValueClass {
	public static void main(String[] args) {
		String[] str = {"StringOne", "StringTwo"};
		TwoType<Integer, String[]> ttype = new TwoType<>(101, str);
		System.out.println(ttype.getValue(101));
		System.out.println(ttype.getKey(str));
	}
}

/**
	Restricting the type of parameters to be 
	passed in generics by using 'extends'
*/

class AvgClass<T extends Number> {	//only generic types that belong to class Number or Number's subclass are allowed
	T[] num;
	
	AvgClass(T[] nums) {
		num = nums;
	}
	
	double getAvg() {
		double avg = 0.0;
		double sum = 0.0;
		for(int i=0;i<num.length;i++) {
			sum += num[i].doubleValue();
		}
		
		avg = sum / this.num.length;
		return avg;
	}
	
	boolean isAvgEqual(AvgClass<?> avg) {
		if(getAvg() == avg.getAvg()) {
			return true;
		} else return false;
	}
}

class AvgCmpClass {
	public static void main(String[] args) {
		Integer[] intAvg = {1, 5, 7, 3};
		Double[] doubleAvg = {1.0, 3.0, 5.0, 7.0};
		
		AvgClass<Integer> iAvg = new AvgClass<>(intAvg);
		AvgClass<Double> dAvg = new AvgClass<>(doubleAvg);
		
		System.out.println("avg of integer type: "+iAvg.getAvg());
		System.out.println("avg of double type: "+dAvg.getAvg());
		
		System.out.println("Is the average same for both arrays: "+iAvg.isAvgEqual(dAvg));
	}
}

/**	General List collections framework/API overview..

							Collection
								\
								 \
								  \
								   \
								   List-------------
									/\  		   |
								   /  \            |
							ArrayList LinkedList  Vector
													|
													|
												  Stack
												  
						So, in polymorphysm, List<> l = new ArrayList<>();
													  = new LinkedList<>();
													  = new Vector<>();
													  = new Stack<>();
		
		Now, here	List<String> list = new ArrayList<>();
					|		|
					|       |
				Base Type  Parameter Type
	
	Polymorphism concept applicable only for the base type but not for parameter type. So, 
	List<Object> list = new ArrayList<String>(); //will throw a compiletime error(Incompatible types)
	
	Usage of parent reference to hold child object is concept of polymorphism..

*/

class Test {
	public static void main(String[] args) {
	
		Collection<String> coll = new ArrayList<String>(); //valid
		ArrayList<String> arrl = new ArrayList<String>();	//Valid
		List<String> list = new ArrayList<String>(); //still valid
		
		ArrayList<Object> objList = new ArrayList<String>(); //invalid! Compiletime error imminent
	}
}

/**
	Generic classes. Internal functioning:
	Until Java jdk 1.4 version, all generics took Object as <> args. and had to 
	be typecasted for a perticular type retrival. This allowed any Object type class to be passed as parameter type and hence, 
	this was not type-safe. The return type of get method is Object. Hence at the time of retrival we had to perform 
	typecasting.
	Eg: 
	
	class ArrayList {
		void add(Object obj) {
		
			//implementation
			//code here
			
		}
		
		Object get() {
			//implementation code
			//here
			
			return Object;
		}
	}
	
	So in Java JDK 1.5 when the Generics concept was introduced, 
	the type casting problems were solved and type-safety was improved. (video timestamp: 38:48)
*/


