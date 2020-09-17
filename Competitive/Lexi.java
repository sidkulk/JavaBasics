import java.util.*;

public class Lexi{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String g1 = sc.nextLine();
		g1 = g1.toLowerCase();
		String g2 = sc.nextLine();
		g2 = g2.toLowerCase();
		int cmp = g1.compareTo(g2);
		if(cmp < 0)
			cmp = -1;
		else if(cmp > 0)
			cmp = 1;
		System.out.println(cmp);
	}
}