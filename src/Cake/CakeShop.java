package Cake;
import java.util.Scanner;

public class CakeShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cake[] cakes = new Cake[1];

        // input data for cake objects and store them into the array
        for (int i = 0; i < cakes.length; i++) {
            System.out.println("1.Order Cake");
            System.out.println("2.Ready Made Cake");
            System.out.print("Choose a number:");
            int type = input.nextInt();

            System.out.print("Enter cake name: ");
            String name = input.next();

            System.out.print("Enter cake rate: ");
            double rate = input.nextDouble();

            if (type == 1) {
                System.out.print("Enter cake weight (kg): ");
                double weight = input.nextDouble();
                cakes[i] = new OrderCake(name, rate, weight);
            } else if (type == 2) {
                System.out.print("Enter cake quantity: ");
                int quantity = input.nextInt();
                cakes[i] = new ReadyMadeCake(name, rate, quantity);
            }
        }

        // display the total price for all types of cakes
        double totalPrice = 0.0;
        for (Cake cake : cakes) {
            totalPrice += cake.calcPrice();
        }
        System.out.println("Total price for all cakes: " + totalPrice);

        double readyMadeTotalPrice = 0.0;
        int readyMadeQuantity = 0;
        for (Cake cake : cakes) {
            if (cake instanceof ReadyMadeCake) {
                readyMadeTotalPrice += cake.calcPrice();
                readyMadeQuantity += ((ReadyMadeCake) cake).quantity;
            }
        }
        System.out.println("Total price for ready made cakes: " + readyMadeTotalPrice);
        System.out.println("Quantity sold for ready made cakes: " + readyMadeQuantity);

        // display the information for the cake that has been sold for the highest price
        Cake maxPriceCake = cakes[0];
        for (Cake cake : cakes) {
            if (cake.calcPrice() > maxPriceCake.calcPrice()) {
                maxPriceCake = cake;
            }
        }
        System.out.println("Cake.Cake sold for the highest price: " + maxPriceCake);
    }
}