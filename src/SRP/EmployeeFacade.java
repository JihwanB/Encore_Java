package SRP;

public class EmployeeFacade {
    public String name;
    public String position;

    public EmployeeFacade() {

    }

    public EmployeeFacade(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // 급여를 계산 (회계팀)
    public void calculatePay() {
        new PayCalculator().calculateExtraHour();
    }

    // 인사팀
    public void reportHours(){
        new HourReporter().calculateExtraHour();
    }

    public void EmployeeSaver(){
        new EmployeeSaver().saveDatabase();
    }
}
