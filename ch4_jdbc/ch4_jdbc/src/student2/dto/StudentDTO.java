package student2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    // 테이블 모양
    private String studentId;
    private String name;
    private double height;
    private String deptId;

    // public StudentDTO(String studentId, Double height) {
    // this.studentId = studentId;
    // this.height = height;
    // }
}
