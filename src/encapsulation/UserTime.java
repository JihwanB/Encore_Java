package encapsulation;

public class UserTime {
    private int hour;

    public void setHour(int hour) {
        if (hour < 0 || hour > 24)
            System.out.println("시간 확인 요망");
        else
            this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

}
