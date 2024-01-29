package classStudy.InterfaceStudy;

// 인터페이스는 상수 + 추상메서드로 이루어진 설계
// 인터페이스에 정의된 추상메서드는 상속 관계에서 하위 클래스에 메서드 구현의 강제성을 부여
// 이것을 overriding 이라고 함
public interface TV {
    // 구현부를 갖지 않는 메서드: 추상메서드

    public void powerOn();
    public void volumeUp();
    public void channelUp();
}
