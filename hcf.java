import java.util.*;

class hcf{
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two integers: ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int hcf = 0;
		for(int i=1; i <= s1 && i <= n2;++i){
			if(s1%i==0 && s2%i==0){
				hcf = i;
			}
		}
		System.out.println("HCF of "+s1+" and "+s2+" is "+hcf);
	}
}
