package student2.repository;

import static student2.repository.JDBCUtil.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student2.dto.StudentDTO;

public class StudentDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public StudentDAO(Connection con) {
        this.con = con;
    }

    // insert
    public int insert(StudentDTO sDTO) {
        int result = 0;
        try {
            String sql = "INSERT INTO student VALUES(?,?,?,?)";
            // String sql = "INSERT INTO student(student_id, name, height, dept_id)
            // VALUES(?,?,?,?)"; 전체 컬럼 사용하므로 컬럼명 생략 가능
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, sDTO.getStudentId());
            pstmt.setString(2, sDTO.getName());
            pstmt.setDouble(3, sDTO.getHeight());
            pstmt.setString(4, sDTO.getDeptId());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // delete : studentId
    public int delete(String studentId) {
        int result = 0;
        try {
            String sql = "DELETE FROM student WHERE student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // update : height 수정
    public int update(StudentDTO sDTO) {
        int result = 0;
        try {
            String sql = "UPDATE student SET height = ? WHERE student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, sDTO.getHeight());
            pstmt.setString(2, sDTO.getStudentId());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // 학생전체조회(dept_id)
    public List<StudentDTO> getList(String deptId) {
        List<StudentDTO> list = new ArrayList<>();
        try {
            String sql = "select * from student where dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                StudentDTO sDto = new StudentDTO();
                sDto.setStudentId(rs.getString("student_id"));
                sDto.setName(rs.getString("name"));
                sDto.setHeight(rs.getDouble("height"));
                sDto.setDeptId(rs.getString("dept_id"));
                list.add(sDto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }

    // 학생조회(1명 = studentId로)
    public StudentDTO getRow(String studentId) {
        StudentDTO sDto = null;
        try {
            String sql = "select * from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                sDto = new StudentDTO();
                sDto.setStudentId(rs.getString("student_id"));
                sDto.setName(rs.getString("name"));
                sDto.setHeight(rs.getDouble("height"));
                sDto.setDeptId(rs.getString("dept_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return sDto;
    }
}
