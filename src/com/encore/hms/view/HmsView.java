package com.encore.hms.view;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.service.HmsService;
import com.encore.hms.util.HmsType;

import java.util.Scanner;

public class HmsView {

    public static Scanner sc = new Scanner(System.in);

    // HmsView 는 HmsService 와 의존성 주입(Dependency Injection) 관계가 형성
    // 즉 HmsView 는 HmsService 의 객체 생성을 통한 접근을 필요로 하는 것
    private HmsService service;

    public HmsView() {
        service = new HmsService(10);
    }

    public void mainMenu() {
        while (true) {
            System.out.println(">>> HMS Ver1.0 <<<");
            System.out.println("1. 전체출력");
            System.out.println("2. 이름으로 검색");
            System.out.println("3. 이름으로 찾아서 수정");
            System.out.println("4. 이름으로 찾아서 삭제");
            System.out.println("5. 생성");
            System.out.println("99. 종료");
            System.out.print("Input Number : ");
            try {
                int number = sc.nextInt();
                switch (number) {
                    case 1:
                        perPrint();
                        break;
                    case 2:
                        search();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        remove();
                        break;
                    case 5:
                        subMenu();
                        break;
                    case 99:
                        System.out.println("프로그램을 종료하고 데이터는 보관되지 않습니다.");
                        System.exit(0);
                    default:
                        System.out.println("메뉴에 정의된 숫자만 입력해 주세요.\n");
                } // switch end block
            } catch (Exception e) {
                System.out.println("숫자만 입력하세요.\n");
                sc.nextLine();
            }
        } // while end block
    } // main menu end block

    public void perPrint() {
        System.out.println();
        System.out.println(">>> 전체출력 <<<");

        Person[] perArr = service.getArr();
        if (service.getIdx() == 0) {
            System.out.println();
            System.out.println(">>> 데이터가 존재하지 않습니다 <<<");
            System.out.println();
        } else {
//            for (int i = 0; i < perArr.length; i++) {
//                Person per = perArr[i];
//                if (per == null) {
//                    break;
//                }
//                System.out.println(per.personInfo() + "\n");
//            }
//
            for (Person per : perArr) {
                if (per == null) {
                    break;
                }
                System.out.println(per.personInfo());
            }
            System.out.println();
        }
    }

    // Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서
    // 존재할 경우 해당 객체의 정보를 출력하고
    // 존재하지 않을 경우 '정보가 존재하지 않습니다' 라는 메시지를 출력
    // HmsView - HmsService(searchPerson(String name)
    public void search() {
        System.out.println();
        System.out.println(">>> Search <<<");

        sc.nextLine();
        System.out.print("찾고자 하는 이름을 입력하세요 : ");
        String name = sc.nextLine();

        Person person = service.searchPerson(name);
        if (person == null) {
            System.out.println("정보가 존재하지 않습니다" + "\n");
        } else {
            System.out.println(person.personInfo() + "\n");
        }
    }


    // Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서
    // 존재할 경우 해당 객체의 학생이라면 학번, 강사라면 과목, 직원이라면 부서를 수정하고
    // '정보를 수정하였습니다' 라는 메시지 출력
    // HmsView - HmsService(updatePerson(String name)
    public void update() {
        System.out.println();
        System.out.println(">>> Update <<<");

        sc.nextLine();
        System.out.print("변경하고자 하는 이름을 입력하세요 : ");
        String name = sc.next();

        Person obj = service.updatePerson(name);
        if (obj != null) {
            if (obj instanceof StudentDTO) {
                System.out.print("수정할 학번을 입력하세요 : ");
                String stuId = sc.next();
                ((StudentDTO) obj).setStuId(stuId);
            } else if (obj instanceof TeacherDTO) {
                System.out.print("변경할 과목을 입력하세요 : ");
                String subId = sc.next();
                ((TeacherDTO) obj).setSubject(subId);
            } else if (obj instanceof EmployeeDTO) {
                System.out.print("변경할 부서를 입력하세요 : ");
                String deptId = sc.next();
                ((EmployeeDTO) obj).setDept(deptId);
            }
            System.out.println("정보를 수정하였습니다\n");
        } else {
            System.out.println("정보가 존재하지 않습니다" + "\n");
        }

    }

    // Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서
    // 존재할 경우 해당 객체를 배열에서 삭제하고
    // '객체를 삭제하였습니다' 라는 메시지 출력
    // 그리고 전체출력을 했을 때 정상적으로 출력되면 OK
    // HmsView - HmsService(removePerson(String name)
    public void remove() {
        System.out.println();
        System.out.println(">>> Remove <<<");

        sc.nextLine();
        System.out.print("삭제하고자 하는 이름을 입력하세요 : ");
        String name = sc.next();

        Person person = service.searchPerson(name);
        if (person == null) {
            System.out.println("정보가 존재하지 않습니다" + "\n");
        } else {
            boolean flag = service.removePerson(name);
            if (flag) {
                System.out.println("객체를 삭제하였습니다\n");
            }
        }
    }

    public void subMenu() {
        while (true) {
            System.out.println();
            System.out.println(">>> 객체 생성을 위한 Sub Menu <<<");
            System.out.println("1. 학생");
            System.out.println("2. 강사");
            System.out.println("3. 직원");
            System.out.println("99. 상위메뉴 이동");
            System.out.print("Input Number : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    makePerson(num);
                    break;
                case 2:
                    makePerson(num);
                    break;
                case 3:
                    makePerson(num);
                    break;
                case 99:
                    System.out.println("상위 메뉴로 이동합니다." + "\n");
                    return;
            } // switch end block
        } // while end block
    }

    public void makePerson(int num) {
        System.out.println();
        System.out.println(">>> 객체 생성 출력 <<<");

        // Scanner 이용해서 name, age, address, comm
        // HmsService - makePerson() 연결
        sc.nextLine();
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("주소 : ");
        String address = sc.nextLine();

        String comm = null;
        HmsType type = HmsType.STU;
        switch (num) {
            case 1:
                System.out.print("학번을 입력해주세요 : ");
                comm = sc.nextLine();
                type = HmsType.STU;
                break;
            case 2:
                System.out.print("과목을 입력해주세요 : ");
                comm = sc.nextLine();
                type = HmsType.TEA;
                break;
            case 3:
                System.out.print("부서를 입력해주세요 : ");
                comm = sc.nextLine();
                type = HmsType.EMP;
                break;
        }

        String msg = service.makePerson(type, name, age, address, comm);
        System.out.println(msg);
    }

}
