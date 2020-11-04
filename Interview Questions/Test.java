package javaBasics;

class StringFilter{
	public static void main(String args[]) {
		String str = "A %##$ String (*&";
		
		System.out.println("String before filteration: "+str);
		String filter = str.replaceAll("^[a-zA-Z0-9]", "");
		System.out.println("String after filteration: "+filter);
	}
}