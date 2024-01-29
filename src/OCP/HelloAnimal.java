package OCP;

public class HelloAnimal {
    public void hello(AnimalOCP animal) {

        if (animal.type == "멍멍") {
            System.out.println("멍멍");
        } else if (animal.type == "야옹") {
            System.out.println("야옹");
        }
    }
}
