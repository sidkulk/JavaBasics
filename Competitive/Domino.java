import java.util.Scanner;

public class Domino{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int area = M*N;
		int dominNum = area/2;
		System.out.println(dominNum);
		
		sc.close();
	}
}