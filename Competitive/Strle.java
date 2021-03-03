class StrLe{
	public static void main(String args[]){
		int[] p = {10, 20, 30, 50, 70};
		int j = 0;
		p[0] = p[4]/7;
		p[3] = p[0]+p[2];
		p[4] = p[0]+p[1]+p[3];
		for(j=0;j<p.length;j++){
			System.out.print(" "+p[j]);
		}
	}
}
/*
s = 1
p = 2
h = 3
e = 4
r = 5
*/

class NumTwo{
	public static void main(String args[])throws Exception{
		int n=0, b=0;
		for(n=0;n<=6;n++){
			n = n+2;
			if(n==5){
				System.out.println("Hello world!");
				break;
			}
		}
		System.out.println(n);
	}
}
/**
output:
---------------
Hello world
5

*/