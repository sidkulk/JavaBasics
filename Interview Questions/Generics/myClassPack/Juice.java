package myClassPack;

public class Juice {
    private double volume;
    private double density;

    Juice(double volume, double density) {
        this.volume = volume;
        this.density = density;
    }

    @Override
    public String toString() {
        return ("Volume(ml): " + this.volume + " Density: " + this.density);
    }
}
