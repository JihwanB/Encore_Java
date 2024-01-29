package classStudy.InterfaceStudy;

public class LgTV implements TV {
    @Override
    public void powerOn() {
        System.out.println("LTV powerOn");
    }

    @Override
    public void volumeUp() {
        System.out.println("LTV volumeUp");
    }

    @Override
    public void channelUp() {
        System.out.println("LTV channelUp");
    }
}
