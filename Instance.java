package javaBasics;

class TestClass {
	public static void main(String[] myArgs) {
		InstClass ic;
		System.out.print(ic.toString()); //will throw an error: ic is not initialized.
	}
}

class InstClass {
	int tmpVar;
	public InstClass(int tmpVar) {
		this.tmpVar = tmpVar;
	}
}