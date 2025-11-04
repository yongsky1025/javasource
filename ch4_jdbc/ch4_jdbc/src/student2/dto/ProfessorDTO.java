package student2.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;
// import lombok.ToString;
import lombok.EqualsAndHashCode;

//DTO(Data Transfer Object) == ~~VO(Value Objct)

// 생성자
@NoArgsConstructor
@AllArgsConstructor
@Data // getter, setter, ToString 한번에 적용
      // (@EqualsAndHashCode, @RequiredArgsConstructor포함)

// @Getter
// @Setter
// @ToString

public class ProfessorDTO {
    private String profId;
    private String profName;
    private String deptId;

    // // 생성자
    // public ProfessorDTO() {
    // }

    // public ProfessorDTO(String profId, String profName, String deptId) {
    // this.profId = profId;
    // this.profName = profName;
    // this.deptId = deptId;
    // }

    // // getter, setter, toString
    // public String getProfId() {
    // return profId;
    // }

    // public void setProfId(String profId) {
    // this.profId = profId;
    // }

    // public String getProfName() {
    // return profName;
    // }

    // public void setProfName(String profName) {
    // this.profName = profName;
    // }

    // public String getDeptId() {
    // return deptId;
    // }

    // public void setDeptId(String deptId) {
    // this.deptId = deptId;
    // }

    // @Override
    // public String toString() {
    // return "ProfessorDTO [profId=" + profId + ", profName=" + profName + ",
    // deptId=" + deptId + "]";
    // }

}
