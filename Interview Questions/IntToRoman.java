package myClass;
/*
* Program to convert Integer to Roman numeral..
*/
import static java.lang.System.out;
import java.util.Scanner;

class IntToRoman {
	public static void main(String[] args) {
		IntToRoman i2r = new IntToRoman();
		Scanner sc = new Scanner(System.in);
		out.println("Enter an integer to convert to roman: ");
		int num = sc.nextInt();
		
		out.println("Roman equivalent of "+num+" is: "+intToRoman(num));
	}
	
	/**
	*	intToRoman(int num) is a method that takes 
	*	an Integer argument 'num' and returns it's Roman equivalent
	*
	*	Accepts: 1 integer args
	*	Returns: Roman string equivalent of integer args
	*/
	public static String intToRoman(int num) {
		String thousand[] = {"", "M", "MM", "MMM"};
		String hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String units[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		return thousand[num/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + units[(num%10)];
	}
}

/**
	
*/