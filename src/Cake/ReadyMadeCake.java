package Cake;
public class ReadyMadeCake extends Cake {
    int quantity;

    public ReadyMadeCake(String n, double r, int q) {
        super(n, r);
        quantity = q;
    }

    public double calcPrice() {
        return rate * quantity;
    }
}