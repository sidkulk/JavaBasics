import java.util.*;


class maxNum{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int z=0, y=0, x=0;
	}
	
	public static <E extends Comparable<E>> E max(E a, E b, E c){
		E m = a;
		if(b.compareTo(a) > 0)
			m = b;
		if(c.compareTo(m) > 0)
			m = c;
		return m;
	}
}