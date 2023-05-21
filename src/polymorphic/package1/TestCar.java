package polymorphic.package1;

public class TestCar {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.makeCar("Bmw");
        Car car2 = carFactory.makeCar("Bench");
        System.out.println(car1);
        System.out.println(car2);
    }
}
