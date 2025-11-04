package student2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student2.dto.DeptDTO;

// ~~DAO(Data Access Object) : 데이터베이스 관련 작업
public class DeptDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // static 블록
    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 데이터베이스 연결 메소드
    public Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "javadb";
        String password = "12345";

        con = DriverManager.getConnection(url, user, password);
        return con;
    }

    public int insert(DeptDTO dto) {
        int result = 0;
        try {

            con = getConnection();
            String sql = "INSERT INTO department(dept_id, dept_name) VALUES(?,?)";
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setString(1, dto.getDeptId());
            pstmt.setString(2, dto.getDeptName());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return result;
    }

    public int delete() {
        int result = 0;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return result;
    }

    public int update() {
        int result = 0;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return result;
    }

    // 조회 결과가 하나만 나오는경우
    public DeptDTO getRow(String deptName) {
        DeptDTO deptDTO = null;
        try {

            con = getConnection();
            String sql = "select * from department where dept_name = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptName);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String deptId = rs.getString("dept_id");
                deptName = rs.getString("dept_name");
                deptDTO = new DeptDTO(deptId, deptName);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return deptDTO;

    }

    // 조회 결과가 여러개 나오는 경우
    // 전체 학과 조회
    public List<DeptDTO> getRows() {
        List<DeptDTO> list = new ArrayList<>();
        try {

            con = getConnection();
            String sql = "select * from department";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String deptId = rs.getString("dept_id");
                String deptName = rs.getString("dept_name");

                // DeptDTO deptDTO = new DeptDTO(deptId, deptName);
                // list.add(deptDTO);
                list.add(new DeptDTO(deptId, deptName));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
