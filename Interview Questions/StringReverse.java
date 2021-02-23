package myClass;

import static java.lang.System.out;

class StringRev {
	public static void main(String[] args) {
		int a = 121;
		String st = "Hello World!";
		out.println(usingManual(Integer.toString(a)));
		out.println(usingStringBuilder(st));
	}
	
	public static String usingStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	public static String usingManual(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}