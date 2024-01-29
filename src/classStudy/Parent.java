package classStudy;

/*
 * 접근지정자 : public, protected, private, package
 * [<접근지정자>] class <class_name>
 *
 *      변수
 *      [<접근지정자>] <변수타입> <변수명> ;
 *
 *      메서드
 *      [<접근지정자>] <반환타입> <메서드명> ([Paremeters...]) {
 *          <business_logic> ;
 *      }
 */
public class Parent {
    public String name;
    public int age;

    public void say() {
        System.out.println(name + age);
    }
}
