package student2;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;

public class DeptMain {
    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        DeptDAO dao = new DeptDAO();
        ConsoleInfo info = new ConsoleInfo();

        while (run) {
            System.out.println(
                    "==========================================================================================");
            System.out.print("1. 학과정보 | ");
            System.out.print("2. 학과수정 | ");
            System.out.print("3. 학과삭제 | ");
            System.out.print("4. 학과조회 | ");
            System.out.print("5. 전체학과조회 | ");
            System.out.println("6. 프로그램 종료");
            System.out.println(
                    "==========================================================================================");
            System.out.print("선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    String deptName = info.getDeptName(sc);
                    DeptDTO dto = dao.getRow(deptName);
                    info.print(dto);
                    break;
                case 5:
                    List<DeptDTO> list = dao.getRows();
                    info.printAll(list);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
        }

    }
}
