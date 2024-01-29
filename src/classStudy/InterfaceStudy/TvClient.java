package classStudy.InterfaceStudy;

public class TvClient {
    public static void main(String[] args) {
        // SamsungTV tv = new SamsungTV();
        // LgTV tv = new LgTV();

        // 다형성 (객체 타입의 다형성)
        TV tv = new SamsungTV();
        tv = new LgTV();
        tv.powerOn();
        tv.volumeUp();
        tv.channelUp();
    }
}
