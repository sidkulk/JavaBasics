import java.util.*;
/**
*	Student Bean
**/
class Student{
	private int ID;
	private String fname;
	private String lname;
	private float sgpa;
	
	Student(){
		System.out.println("Student object created!");
	}
	
	Student(int id, String fname, String lname, float gpa){
		this.ID = id;
		this.fname = fname;
		this.lname = lname;
		this.sgpa = gpa;
	}
	
	void setId(int id){
		ID = id;
	}
	
	void setFname(String fname){
		this.fname = fname;
	}
	
	void setLname(String lname){
		this.lname = lname;
	}
	
	void setSgpa(float sgpa){
		this.sgpa = sgpa;
	}
	
	int getId(){
		return ID;
	}
	
	String getFname(){
		return fname;
	}
	
	String getLname(){
		return lname;
	}
	
	float getGpa(){
		return sgpa;
	}
}

public class StudentDatabase{
	public static void main(String args[])throws Exception{
		
		Scanner sc = new Scanner(System.in);
		List <Student> s = new LinkedList<Student>();

		String ch = "y";

		do{
			System.out.println("Student database");
			System.out.println("1) CREATE student record");
			System.out.println("2) DELETE student record");
			System.out.println("3) UPDATE student record");
			System.out.println("4) SEARCH student record");
			System.out.println("5) Exit");
			System.out.print("Entre query option number: ");

			int option = sc.nextInt();

			switch(option){
				case 1:{
					System.out.println("/------------------------/");
					System.out.print("Enter Roll No.: ");
					int roll = sc.nextInt();
					sc.nextLine();
				
					System.out.print("\nEnter First Name: ");
					String fname = sc.nextLine();
				
				
					System.out.print("\nEnte Last Name: ");
					String lname = sc.nextLine();
				
				
					System.out.print("\nEnter Avg GPA: ");
					float gpa = sc.nextFloat();
					s.add(new Student(roll, fname, lname, gpa));			
				}
				break;

				case 2:{
					System.out.println("Enter student's Roll no: ");
					int roll = sc.nextInt();

				}
				break;

				case 3:{

				}
				break;

				case 4:{

				}
				break;

				default: System.out.println("Enter a correct option!");

			}
			System.out.println("Do you want to continue?(y/n)");
			ch = sc.nextLine();
		}while(ch.equals("y"));
		/**	To add an object in LinkedList: 
		*	s1.add(new Student(101, "Siddharth", "Kulkarni", 9.4f));
		*/
		/*System.out.println("Enter the strength of the class: ");
		int stnght = sc.nextInt();*/
		/*
		for(int i=0;i<stnght;i++){
			System.out.println("/------------------------/");
			System.out.print("Roll No.: ");
			int roll = sc.nextInt();
			sc.nextLine();
			
			System.out.print("\nFirst Name: ");
			String fname = sc.nextLine();
			
			
			System.out.print("\nLast Name: ");
			String lname = sc.nextLine();
			
			
			System.out.print("\nAvg GPA: ");
			float gpa = sc.nextFloat();
			s1.add(new Student(roll, fname, lname, gpa));
		}
		*/
		
		/*for(Student std : s1){
			System.out.println(std+"\n");
		}*/
	}
}