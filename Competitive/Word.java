import java.util.*;

public class Word{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] sword = new String[num+1];
		for(int i=0;i<num+1;i++){
			sword[i] = sc.nextLine();
		}
		
		for(int i=0;i<num+1;i++){
			if(sword[i].length() >10){
				int len = sword[i].length()-2;
				String finalstr = sword[i].charAt(0)+Integer.toString(len)+sword[i].charAt(sword[i].length()-1);
				System.out.println(finalstr);
			}	
			else
				System.out.println(sword[i]);
		}
	}
}