package com.encore.stream;

import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.sup.Person;

import java.io.*;
import java.util.Scanner;

public class IODemo {

    public IODemo() {

    }

    public String inputStr() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Message : ");

        return br.readLine();
    }

    public int inputInt() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Message : ");

        int data = 0;
        try {
            data = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void first(int flag) throws EncoreException {
        System.out.println(">>> first start <<<");
        try {
            second(flag);
        } finally {
            System.out.println(">>> first end <<<");
        }
    }

    public void second(int flag) throws EncoreException {
        System.out.println(">>> second start <<<");
        try {
            third(flag);
        } finally {
            System.out.println(">>> second end <<<");
        }
    }

    public void third(int flag) throws EncoreException {
        System.out.println(">>> third start <<<");
        try {
            if (flag == 0) {
                throw new EncoreException("사용자 정의 예외 발생");
            }
        } finally {
            System.out.println(">>> third end <<<");
        }
    }

    // 파일 출력 기능
    public boolean outputFile() {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String msg = sc.nextLine();

        // console 에서 입력한 데이터를 파일로 저장
        File file = new File("src/com/encore/stream/test.txt");
        FileWriter writer;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter(file);
            bw = new BufferedWriter(writer);
            bw.write(msg);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return flag;
    }

    // 객체가 가지고 있는 정보를 파일에 저장
    public boolean outputObjFile() {
        boolean flag = false;

        Person[] perAry = new Person[10];
        int idx = 0;
        perAry[idx++] = new StudentDTO("임정섭", 20, "서울", "1982");
        perAry[idx++] = new StudentDTO("임정섭", 20, "서울", "1982");
        perAry[idx++] = new StudentDTO("임정섭", 20, "서울", "1982");

        // console 에서 입력한 데이터를 파일로 저장
        File file = new File("src/com/encore/stream/test.txt");
        FileWriter writer;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter(file);
            bw = new BufferedWriter(writer);
            for (Person person : perAry) {
                if (person != null)
                    bw.write(person.getName() + ":" + person.getAge() + ":" + person.getAddress()
                            + ":" + ((StudentDTO) person).getStuId() + "\n");
            }
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return flag;
    }

    public void outputSerializable() {
        // String msg = "직렬화된 객체에서 바이너리 형태로 저장이 가능";

        //StudentDTO stu = new StudentDTO("임정섭", 20, "서울", "1982");

        Person[] perAry = new Person[10];
        int idx = 0;
        perAry[idx++] = new StudentDTO("임정섭", 20, "서울", "1982");
        perAry[idx++] = new StudentDTO("임정섭", 20, "서울", "1982");
        perAry[idx++] = new StudentDTO("임정섭", 20, "서울", "1982");

        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("src/com/encore/stream/test.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(perAry);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void inputSerializable() {
        // String msg = null;
        FileInputStream fis;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("src/com/encore/stream/test.txt");
            ois = new ObjectInputStream(fis);

            // msg = (String)(ois.readObject());

            // StudentDTO stu = (StudentDTO) (ois.readObject());
            // System.out.println(stu.personInfo());

            Person[] perAry = (Person[])(ois.readObject());
            for (Person person : perAry) {
                if (person != null) {
                    System.out.println(person.personInfo());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
