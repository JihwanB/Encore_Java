package com.encore.mvc;

import com.encore.mvc.domain.DepartmentResponseDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseMain {

    // url, driver, id, password
    public static void main(String[] args) {

        String URL = "jdbc:mariadb://localhost:3306/encore";
        String DRIVER = "org.mariadb.jdbc.Driver";
        String ID = "root";
        String PASSWORD = "9816";
        /* JDBC
         * try{
         * ============================================================= ORM (Mybatis, JPA, etc.)
         * 1. 벤더사에서 제공하는 드라이버 로딩
         * 2. 연결 (url, id, password)
         * 3. 실행구문을 담을 수 있는 그릇이 필요 (Statement, PreparedStatement)
         * 4. 실행(execute) - executeQuery, executeUpdate (insert, update, delete)
         * 5. 실행결과를 반환 받는다.
         * ============================================================= ORM (Mybatis, JPA, etc.)
         * 6. 결과를 객체화 시키고 다건일 경우 자료구조를 이용해서 담는 것
         * 7. 외부리소스(DB 연결)를 담는 것
         * } catch() {
         *
         * { finally {
         *
         * }
         */
        Connection conn = null;
        PreparedStatement pstmt;
        ResultSet rset = null;

        try {
            Class.forName(DRIVER);
            System.out.println("드라이버 로딩 완료!!!");
            conn = DriverManager.getConnection(URL, ID, PASSWORD);
            System.out.println("DB연결 완료 >>> " + conn);

            /* single finder select
            String sql = "select dept_id, dept_name, loc_id from department where dept_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "10");
            rset = pstmt.executeQuery();
            DepartmentResponseDTO response = null;
            while (rset.next()) {
                response = new DepartmentResponseDTO();
                response.setDept_id(rset.getString(1));  // 번호로 테이블에 정의되어 있는 컬럼을 접근 || 컬럼명으로 접근
                response.setDept_name(rset.getString(2));
                response.setLoc_id(rset.getString(3));
            }
            System.out.println("Result >>> " + response);
             */

            String sql = "insert into department values(?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "70");
            pstmt.setString(2, "교육");
            pstmt.setString(3, "A3");
            int result = pstmt.executeUpdate();
            System.out.println("DML Result >>> " + result);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
