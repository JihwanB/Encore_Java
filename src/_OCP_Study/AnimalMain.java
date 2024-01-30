package _OCP_Study;

public class AnimalMain {
    public static void main(String[] args) {
        AnimalOCP dog = new AnimalOCP("멍멍");
        AnimalOCP cat = new AnimalOCP("야옹");

        // main()에서 HelloAnimal 클래스에 정의된 hello() 메서드를 호출하고 싶다면?
        HelloAnimal animal = new HelloAnimal();
        animal.hello(dog);
        animal.hello(cat);
    }
}
