package Car;
public class Truck extends Car {
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice * 0.8;
        }
    }
}