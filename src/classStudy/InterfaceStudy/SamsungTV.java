package classStudy.InterfaceStudy;
/*
 * class - class 상속은 extends
 * class - interface 구현은 implements
 */
public class SamsungTV implements TV {
    @Override
    public void powerOn() {
        System.out.println("STV powerOn");
    }

    @Override
    public void volumeUp() {
        System.out.println("STV volumeUp");
    }

    @Override
    public void channelUp() {
        System.out.println("STV channelUp");
    }
}
