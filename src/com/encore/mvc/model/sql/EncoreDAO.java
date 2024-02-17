package com.encore.mvc.model.sql;

import com.encore.mvc.domain.DepartmentResponseDTO;
import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Persistence 영역에서의 DB 작업만 해야함
public class EncoreDAO {

    public static final String URL = "jdbc:mariadb://localhost:3306/encore";
    public static final String DRIVER = "org.mariadb.jdbc.Driver";
    public static final String ID = "root";
    public static final String PASSWORD = "9816";

    public EncoreDAO() {
        try {
            Class.forName(DRIVER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int insertRow(PostRequestDTO params) {

        System.out.println(">>> DAO insertRow <<<");
        System.out.println(">>> params : " + params);

        Connection conn = null;
        PreparedStatement pstmt;
        int flag = 0;
        String query = "insert into post_tbl(title, content, writer) values(?,?,?)";

        try {

            conn = DriverManager.getConnection(URL, ID, PASSWORD);
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, params.getTitle());
            pstmt.setString(2, params.getContent());
            pstmt.setString(3, params.getWriter());
            flag = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return flag;
    }

    public int insertRow(Map<String, String> params) {
        System.out.println(">>> DAO insertRow <<<");
        System.out.println(">>> params : " + params);

        Connection conn = null;
        PreparedStatement pstmt;
        int flag = 0;
        String query = "insert into post_tbl(title, content, writer) values(?,?,?)";

        try {

            conn = DriverManager.getConnection(URL, ID, PASSWORD);
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, params.get("title"));
            pstmt.setString(2, params.get("content"));
            pstmt.setString(3, params.get("writer"));
            flag = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return flag;
    }

    // PostResponseDTO - idx, title, content, writer
    // list.add()
    public List<PostResponseDTO> selectRow() {
        System.out.println(">>> DAO selectRow <<<");
        String query = "select idx, title, content, writer from post_tbl";

        Connection conn = null;
        PreparedStatement pstmt;
        ResultSet rSet;
        List<PostResponseDTO> response = null;

        try {

            conn = DriverManager.getConnection(URL, ID, PASSWORD);
            pstmt = conn.prepareStatement(query);
            rSet = pstmt.executeQuery();

            response = new ArrayList<>();
            while (rSet.next()) {
                PostResponseDTO dto = new PostResponseDTO(
                        rSet.getInt(1),
                        rSet.getString(2),
                        rSet.getString(3),
                        rSet.getString(4)
                );
                response.add(dto);
            }
            System.out.println("Result >>> " + response);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return response;
    }

}
