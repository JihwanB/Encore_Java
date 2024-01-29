package composition;

public class CarMain {
    public static void main(String[] args) {
        Car digelcar = new Car(new Engine("디젤"));
        Car electroCar = new Car(new Engine("전기"));

        digelcar.drive();
        digelcar.breaks();

        electroCar.drive();
        electroCar.breaks();
    }
}
