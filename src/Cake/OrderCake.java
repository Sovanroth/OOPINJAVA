package Cake;
class OrderCake extends Cake {
    private final double weight;

    public OrderCake(String n, double r, double w) {
        super(n, r);
        weight = w;
    }

    public double calcPrice() {
        return rate * weight;
    }
}