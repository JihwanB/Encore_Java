package LSP;

// 추상클래스 - 구현부를 갖지 않는 추상메서드를 하나라도 포함한다면
// 객체 생성이 불가
public class AnimalLSP {

    // 구현부가 없는 메서드 - 추상메서드
    public void speak() {
        System.out.println("넌 누구냐?");
    }
}
