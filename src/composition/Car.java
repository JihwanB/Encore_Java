package composition;

public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.printf("%s 으로 드라이브\n", engine.engineType);
    }

    public void breaks() {
        System.out.printf("%s 으로 브레이크\n", engine.engineType);
    }
}
