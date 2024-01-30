package _SRP_Study;

public class Employee {
    public String name;
    public String position;

    // 인자를 받는 생성자를  - Special Constructor,
    // 인자를 받지 않는 생성자를   - Default Constructor
    // 생성자가 인자의 개수, 타입을 달리해서 여러개 정의 될 수 있다 - overloading
    public Employee() {

    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // 회계팀 - 급여 계산하는 기준이 변경 (초과근무시간)
    // calculateExtraHour() 수정이 필요해짐
    // 회계팀 요청에 따라서 수정을 하는데 파급효과를 생각해보면?
    public void calculateExtraHour() {

    }

    public void saveDatabase() {

    }

    public void calculatePay() {
        calculateExtraHour();
    }

    public void reportHours() {
        calculateExtraHour();
    }
}
