package ISP;

// 인터페이스의 구성 요소는 상수 + 추상메서드
// 추상클래스와 마찬가지로 객체생성이 불가
// 또한 추상메서드에 abstract 예약어 생략 가능
public interface ISmartPhone {
    public void call(String number);
    public void message(String number, String txt);
    public void wirelessCharge();
    public void ar();
    public void biometrics();
}
