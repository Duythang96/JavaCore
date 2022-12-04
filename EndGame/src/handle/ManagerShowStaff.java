package handle;

import constants.Constant;
import entity.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerShowStaff {
    public void showStaffByPosition(Scanner scanner, ArrayList<Staff> users) {
        System.out.println("Bạn muốn hiển thị danh sách theo: ");
        System.out.println("1. Quản lý: ");
        System.out.println("2. Thu ngân: ");
        System.out.println("3. Quay lại: ");
        int functionNum = 3;
        int functionChoice = chooseFunction(scanner,functionNum);
        switch (functionChoice){
            case 1:
                boolean temp = true;
                for (Staff staff: users){
                    if (staff.getPosition().equals(Constant.Mg.value)){
                        System.out.println(staff);
                        temp = false;
                    }
                }
                if (temp){
                    System.out.println("Chưa có nhân viên nào ở vị trí này!");
                }
                break;
            case 2:
                boolean temp2 = true;
                for (Staff staff: users){
                    if (staff.getPosition().equals(Constant.C.value)){
                        System.out.println(staff);
                        temp2 = false;
                    }
                }
                if (temp2){
                    System.out.println("Chưa có nhân viên nào ở vị trí này!");
                }
                break;
        }
    }

    // kiểm tra lựa chọn function có đúng ko
    private int chooseFunction(Scanner scanner, int functionNum) {
        int choice;
        do {
            try{
                choice = Integer.parseInt(scanner.nextLine());
                if (choice>0&&choice<=functionNum){
                    return choice;
                }
                System.out.println("Mời chọn lại chức năng!");
            }catch (Exception e){
                System.out.println("Mời chọn lại chức năng!");
            }
        }while (true);

    }
}
