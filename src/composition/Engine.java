package composition;

public class Engine {
    public String engineType;

    // 생성자 - Constructor : 객체 생성시 호출되는 like method
    // 생성자의 이름은 클래스의 이름과 동일하고 반환타입이 존재하지 않는다.

    /**
     *
     * @param engineType = test
     */
    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public void enginePrt() {
        System.out.println("엔진입니다.");
    }
}
