import java.util.*;

public class sol{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int probs = sc.nextInt();
		int knows[][] = new int[probs][3];
		int tosolve = 0;
		for(int i=0;i<probs;i++){
			for(int j=0;j<3;j++){
				knows[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0;i<probs;i++){
			int sum = 0;
			for(int j=0;j<3;j++){
				sum = sum+knows[i][j];
			}
			if(sum>=2){
				tosolve++;
			}
		}
		System.out.println(tosolve);
	}
}