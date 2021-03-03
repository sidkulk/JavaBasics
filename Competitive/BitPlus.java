import java.util.*;


public class BitPlus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int n = sc.nextInt();
		sc.nextLine();
		
		String s = "";
		char plus = '+';
		for(int i=0;i<n;i++){
			s = sc.nextLine();
			switch(s.charAt(1)){
				case '+':{
					x++;
				}
				break;
				
				case '-':{
					x--;
				}
				break;
			}
		}
		
		System.out.println(x);
		sc.close();
	}
}