package LSP;

public class CatLSP extends AnimalLSP {

    // 오버라이딩이란? 상속관계에서 부모의 메서드를 자식이 재정의하는 것
    // 조건 1) 접근지정자는 부모보다 크거나 같아야 한다.
    // 조건 2) 반환타입은 일치
    // 조건 3) 메서드의 인자 개수 및 타입 또한 일치
    @Override
    public void speak() {
        System.out.println("야옹");
    }
}
