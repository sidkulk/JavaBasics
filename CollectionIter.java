import java.util.*;


class Coll{
	public static void main(String args[])throws Exception{
		
		Scanner sc = new Scanner(System.in);
		List<Student> stud = new LinkedList<Student>();
		String ch = "y";
		/*
		stud.add(new Student(101, "Sid", "Kulk"));
		stud.add(new Student(102, "avin", "uti"));
		stud.add(new Student(103, "jack", "tak"));
		stud.add(new Student(104, "Tim", "Dou"));
		
		System.out.println("Student ID\tFname\tLname");
		for(Student s:stud){
			System.out.println("  "+s.getId()+"\t\t"+s.getFname()+"\t"+s.getLname());
		}
		*/
		do{
			System.out.println("Student Database Options: ");
			System.out.println("1) Add Student Record");
			System.out.println("2) Search Student Record");
			System.out.println("3) Remove Student Record");
			System.out.println("4) Edit Student Record");
			int c = sc.nextInt();
			
			switch(c){
				case 1:{
					System.out.print("Enter Student ID: ");
					int id = sc.nextInt();
					System.out.println();
					
					System.out.print("Enter Student First Name: ");
					String fname = sc.nextLine();
					System.out.println();
					
					System.out.print("Enter Student Last Name: ");
					String lname = sc.nextLine();
					System.out.println();
				}
				break;
				
				case 2:{
					
				}
				break;
				
				case 3:{
					
				}
				break;
				
				case 4:{
					
				}
				break;
				
				case 5:{
					System.exit(0);
				}
				break;
				
				default:{
					
				}
			}
			
			System.out.println("Do you want to continue?(y/n): ");
			ch = sc.nextLine();
		}while(ch.equals("y"));
		
	}
}


/*
* STUDENT POJO
*/

class Student{
	private int Id;
	private String fname;
	private String lname;
	
	Student(int id, String fname, String lname){
		Id = id;
		this.fname = fname;
		this.lname = lname;
	}
	
	void setId(int id){
		this.Id = id;
	}
	
	void setFname(String fname){
		this.fname = fname;
	}
	
	void setLname(String lname){
		this.lname = lname;
	}
	
	int getId(){
		return Id;
	}
	
	String getFname(){
		return fname;
	}
	
	String getLname(){
		return lname;
	}
}