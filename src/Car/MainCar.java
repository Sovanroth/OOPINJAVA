package Car;
public class MainCar {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(110, 50000, "red", 25);
        Ford ford = new Ford(100, 55000, "blue", 2020, 5000);
        Ford ford1 = new Ford(120, 55000, "blue", 2020, 5000);
        Car car = new Car(80, 15000, "white");
        System.out.println("Car.Sedan sale price: " + sedan.getSalePrice() +"$");
        System.out.println("Car.Ford sale price: " + ford.getSalePrice() +"$");
        System.out.println("Ford1 sale price: " + ford1.getSalePrice() +"$");
        System.out.println("Car.Car sale price: " + car.getSalePrice() +"$");
    }
}
