package hay.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda1","Hon Da 1");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda2","Hon da 2");
        System.out.println(Car.numberOfCars);
    }
}
