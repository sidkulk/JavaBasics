package javaBasics.fileIO;

import java.io.*;
import java.util.Scanner;
/**
	Java File IO concepts. Java File IO is based on the UNIX/LINUX based files system
	everything in UNIX is treated as File (even the directories)

*/
class FileHandleProg {
	public static void main(String args[]) throws Exception {
		/**
			A snippet to create a NEW FILE
		*/
		File f = new File("test.txt");
		System.out.println(f.exists());	//on first run the output is FALSE
		f.createNewFile();	//creates a file in the pwd.
		System.out.println(f.exists());	//Gives the value TRUE on any run
		
		/**
			A snippet to create a NEW DIRECTORY
		*/
		File dir = new File("TestDir");	//1st Constructor Type. points file or Dir in pwd
		System.out.println("Directory created?: "+dir.exists());	//on first run the output is FALSE
		dir.mkdir();	//creates a directory in pwd.
		System.out.println("Directory created?: "+dir.exists());	//Gives the value TRUE on any run
		
		
		
		
		f = new File(dir, "test.txt");	//2nd Constructor type. This File constructor accepts 2 args: 1) the DIR reference and 2) File reference
		f.createNewFile();	//Creates file "test.txt" inside the directory "TestDir"
		System.out.println(f.exists());
		
		
		
		
		f = new File("D:\\Study\\Languages\\java\\codes\\TestDir", "testTwo.txt");	//3rd Constructor type. points a file or Dir at specified location in files system
		f.createNewFile();
		System.out.println(f.exists());
		
		System.out.println("Contents inside the "+dir+" are: ");
		String[] listOfFiles = dir.list();
		for(String iter : listOfFiles) {
			System.out.print(iter+" ");
		}
	}
}


class FileOperations {
	public static void main(String[] args) {
		int fcount = 0, dcount = 0;
		try{
			File f = new File("D:\\Study\\Languages\\java\\codes");
			String[] listOfFiles = f.list();
			System.out.println("-----------------------------\n");
			for(String iter : listOfFiles) {
				File f1 = new File(f, iter);
				if(f1.isFile()){
					System.out.println(iter);
					++fcount;
				}
				
				if(f1.isDirectory()){
					System.out.println(iter);
					++dcount;
				}
			}
			System.out.println("-----------------------------\n");
			System.out.println("Total "+fcount+" number of files and "+dcount+" number of directories");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


class FileWriterClass {
	/**
		TO OVERWRITE DATA IN A FILE, WE USE 2 CONSTRUCTORS:
		1) FileWriter fw = new FileWriter(String fname);
		
		2) FileWriter fw = new FileWriter(File f);
		
		--------------------------------------------------------
		TO APPEND DATA IN A FILE,  WE USE 2 CONSTRUCTORS:
		1) FileWriter fw = new FileWriter(String fname, boolean append);
		
		2) FileWriter fe = new FileWriter(File f, boolean append);
		
		--------------------------------------------------------
		If the specified file is not present then these constructors will create that file and write
		data into it.
	*/
	
	/**
		FileWriter class methods:
		1) FileWriter.write(int ch); //writes to file when given an integer value which is converted to char(Unicode value)
		
		2) FileWriter.write(char ch); //simply writes a single character passed into the parameter.
		
		3) FileWriter.write(char[] charr); //writrs an array of characters to the file.
		
		4) FileWriter.write(String str); //writes a String to the file.
		
		5) FileWriter.flush(); //flushes remaining characters in the writer stream to the file.
		
		6) FileWriter.close(); //closes the writer stream to release files system resources. Also common to FileReader class.
	*/
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		FileWriter fr = new FileWriter("test.txt", true);
		System.out.println("Enter any string to write to the file: ");
		
		String data = sc.nextLine();
		
		fr.write(data);
		fr.flush();
		fr.close();
	}
}