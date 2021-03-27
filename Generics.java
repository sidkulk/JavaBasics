
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
		
		//ArrayList<Object> objList = new ArrayList<String>(); //invalid! Compiletime error imminent
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
	
	So in a generic class after jdk 1.5 A typical ArrayList class will be like this: 
	
	class ArrayList<T> {
		void add(T obj) {
			//add code
			//method definition
		}
		
		T get() {
			//get method
			//definition
			
			return T;
		}
	}
	
	here the T parameter is replaced with a Class passed as generic argument like String, Integer, Long..etc
	No primitive types are allowed in Generic type parameter
*/


//eg: 

class Student {
	private int id;
	private int PRN;
	private String fname;
	private String lname;
	private String email;
	private String phno;
	private String addr;
	
	Student(int id, int PRN, String fname, String lname, String email, String phno, String addr) {
		this.id = id;
		this.PRN = PRN;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phno = phno;
		this.addr = addr;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "id: "+this.id+" , Fname: "+this.fname+" , Lname: "+this.lname;
	}
}

class School {
	static HashMap<Integer, Student> hmap;
	
	static {
		hmap = new HashMap<>();
	}
	
	public static void add(Student student) {
		int id = student.getId();
		hmap.put(id, student);
	}
	
	public static Student getObjectById(int Id) {
		Student student = hmap.get(Id);
		return student; 
	}
}

class Person<T> {
	T obj;
	
	Person(T obj) {
		this.obj = obj;
	}
	
	public void showPerson() {
		out.println(this.obj);
	}
	
	public T getPerson() {
		return obj;
	}
}

class Operations {
	public static void main(String[] args) {
		School.add(new Student(101, 10001, "Siddharth", "Kulkarni", "kulksud@gmail.com", "9975114507", "Pimpri, Pune"));
		
		out.println(School.getObjectById(101));
		
		Person person = new Person(new Student(102, 10002, "Sid", "Kulk", "sid@gmail.com", "8875114507", "Pimpri, Pune"));
		out.println(person.getPerson());
	}
}

/**
	===============================
			BOUNDED TYPES
	===============================
*/


/*
	class Test<T> {
		//here T is type parameter.
		
		public void m1(T a, T b) {
			sop(a*b);
			sop(a+b);
			sop(a/b);
		}
		
		//the arithmetic opers are valid for Number class. But in 
		case of String and other user defined types like Student class, 
		such operations are meaningless.
		So in this case we apply Bounded Type parameter. This allows 
		only selected type of parameters to be passed.
	}
	
	syntax for bounded type: 
	class Test<T extends x> {
		//class body
	}
	
	here x can be either class or interface. If x is a class then, 
	as a type parameter either x type or it's child classes. If x is an
	interface then as a type parameter we can pass either x type or it's 
	implementation classes
*/

/*
class MathArithmatic<T extends Number> {
	private T a, b;
	public T add(T a, T b) {
		this.a = a;
		this.b = b;
		return this.a + this.b;
	}
	
	public T sub(T a, T b) {
		this.a = a;
		this.b = b;
		return this.a - this.b;
	}
	
	public T mul(T a, T b) {
		this.a = a;
		this.b = b;
		return this.a * this.b;
	}
}
*/

/*
	if we want to pass more than one type of class or interface 
	in type parameter then we can do that using the '&' symbol.
	
	class Test<T extends Number & Runnable & Comparable & ... > {
		//class body
	}
	
	Important Note: 
	class Test<T extends Runnable & Comparable> //is valid bcz class can implement more than 
												one interface.
	
	class Test<T extends Number & Runnable & Comparable> //is valid
	
	class Test<T extends Runnable & Number> // is INVALID because we have to take 
												class first and then interface. Here Runnable is 
												an interface and Number is a class. (same applies during inheritance)
												
	class Test<T extends Number & Thread> //is INVALID because we cannot extend 2 classes at the same time.
										    multiple inheritance is not allowed in java. class A extends B, C is not valid
										    
										    Video timestamp: 36:33
*/
/**
	Note: Some basic conclusions: 
	1) We can define bounded types only by using extends keyword and we can't use implements and super keywords but
		we can replace implements with extends keyword.
	2) We can use any letter instead of <T>. We can take <A>, <Siddharth>, <{any valid Java identifier}>
*/

/*
		========================
		Multiple Type Parameters
		========================
*/

class HashMapClass<K, V> {
	private K key;
	private V value;
	private HashMapClass[] harray;
	
	HashMapClass(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Key "+this.key+" Value: "+this.value;
	}
}

/*
	The above class has multiple type parameters. We separate them using comma "," within the angular brackets
*/

/*
	==========================================
	Generic Methods and Wildcard Character <?>
	==========================================
	
	
	let's say you have an arraylist: 
	ArrayList<String> slist = new ArrayList<>();
	
	you have an m1() method and you pass slist as method argument.
	m1(slist). The possible method definition of m1() is: 
	
	public static void m1(ArrayList<String> slist) {
		//method body
	} 
	
	now suppose you have an ArrayList of Integer class. You cannot pass that 
	as method argument in the m1() method because m1() accepts String type ArrayList<>();
*/

class WildCardChar {
    public static void main(String[] args) {
        ArrayList<?> arrList = new ArrayList<String>(); //Valid
        ArrayList<?> arrList2 = new ArrayList<Integer>();   //valid
        ArrayList<? extends Number> arrList3 = new ArrayList<Integer>(); //valid
       // ArrayList<? extends Number> arrList4 = new ArrayList<String>(); //Invalid bcz String is not a subclass of Number. Compiletime Error thrown: Incompatible type found
       ArrayList<? super String> arrList5 = new ArrayList<Object>();
      // ArrayList<?> arrList3 = new ArrayList<? extends Number>(); bcz we can use <?> only during declaration but not at definition side. Throws Compile time error: Unexpected type found
      
    //	ArrayList<?> arrList6 = new ArrayList<?>(); //Invalid. Same reason as above
    }
}



