package compCricket;

import java.util.Scanner;

public class cricket {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		int[][] testMatrix = new int[testCases][3];
		
		for(int i=0;i<testCases;i++) {
			for(int j=0;j<3;j++) {
				testMatrix[i][j] = sc.nextInt();
			}
		}
		
		int[] sol = getSol(testMatrix);
	}
	
	public static int[] getSol(int[][] arr) {
		return arr;
	}
}