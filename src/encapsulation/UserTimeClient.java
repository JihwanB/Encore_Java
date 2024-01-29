package encapsulation;

public class UserTimeClient {
    public static void main(String[] args) {
        UserTime ut = new UserTime();

        // 캡슐화 구현으로 에러 발생
        // ut.hour = -1000;
        // System.out.println(ut.hour);

        ut.setHour(13);
        int returnValue = ut.getHour();
        System.out.println(returnValue);
    }
}
