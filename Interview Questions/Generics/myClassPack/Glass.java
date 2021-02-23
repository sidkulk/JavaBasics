package myClassPack;

public class Glass<T> {
    private T liquid;

    Glass(T liquid) {
        this.liquid = liquid;
    }

    public T getLiquid(){
        return this.liquid;
    }
}