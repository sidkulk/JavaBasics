package javaBasics;

// A generic interface example...
// this is a simple generic interface as shown below
public interface GenericInterface<T extends Number> {
    public T getSum(T a, T b);
    public T getDiff(T a, T b);   
}

/*
 * The class which is implementing a generic interface
 * must also be a Generic class.
 * */
class MyClass<T extends Number> implements GenericInterface<T extends Number> {
    @Override
    public T getSum(T a, T b) {
        return a + b;
    }

    @Override
    public T getDiff(T a, T b) {
        return a - b;
    }
}

class Operation<T extends Number> {
    private T a, b;

    Operation(T a, T b) {
        this.a = a;
        this.b = b;
    }

    Operation() {

    }

    public void setA(T a) {
        this.a = a;
    }

    public void setB(T b) {
        this.b = b;
    }
}
