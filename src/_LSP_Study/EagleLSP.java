package _LSP_Study;

public class EagleLSP extends AnimalLSP{

    // 메서드의 이름만 동일하지, 오버라이딩 조건을 만족하지 못함
    public String speak(boolean flying) {
        return "독수리는 현재 쉬고있습니다";
    }
}
