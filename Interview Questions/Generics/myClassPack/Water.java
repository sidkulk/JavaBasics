package myClassPack;

public class Water {
    private double volume;
    private double density;

    Water(double volume, double density) {
        this.density = density;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return ("Volume(ml): " + this.volume + " density: " + this.density);
    }
}
