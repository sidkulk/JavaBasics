import static java.lang.System.out;
import java.util.ArrayList;

/*
 * we can add any type of Type Parameter <> by using the notation <?>
 *
 * for Eg: 
 * */
/*
class ArrayListClass<T> {
	public static void main(String[] args) {
		ArrayList<?> strAl = new ArrayList<>();
		ArrayListClass obj = new ArrayListClass();

		obj.add(strAl, "Hello");
		obj.add(strAl, 12.45);
	}

	public void add(ArrayList<?> arrList, T element) {
		arrList.add(element);
	}
}

the above code is incorect because we cannot use<?> for declaration purpose. A generic class needs to know 
the type of parameter passed at compile time. This is best suitable for Read-Only operations.
*/

abstract class Calculator<T extends Number> {
	abstract void add(T a, T b);
	abstract void sub(T a, T b);
	abstract void mul(T a, T b);
	abstract void div(T a, T b);
}
