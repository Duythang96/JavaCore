package handle;

import constants.Constant;
import entity.Staff;
import mainrun.Main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AdminStaffManagerFunction {
    public void staffManagerment(Scanner scanner, ArrayList<Staff> users){
        do {
            System.out.println("---Quản lý nhân viên---");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Tính lương cho nhân viên");
            System.out.println("5. Quay trở lại");
            System.out.println("Mời chọn chức năng: ");
            int functionNum = 5;
            int functionChoose = chooseFunction(scanner, functionNum);
            switch (functionChoose){
                case 1:
                    showListStaff(scanner,users);
                    break;
                case 2:
                    addStaff(scanner,users);
                    break;
                case 3:
                    deleteStaff(scanner,users);
                    break;
                case 4:
                    salaryManagerment(scanner,users);
                    break;
                case 5:
                    return;
            }
        }while (true);
    }

    private void salaryManagerment(Scanner scanner,ArrayList<Staff> users) {
        System.out.println("---Tính lương cho nhân viên---");
        System.out.println("Bạn muốn tính lương cho nhân viên có mã ID nào: ");
        Date now = new Date();
        // tính số ngày từ ngày ký hợp đồng đến hiện tại
        int staffID;
        do {
            staffID = Integer.parseInt(scanner.nextLine());
            boolean temp = true;
            for (Staff staffs:users){
                if (staffs.getId()==staffID){
                    long signingTime = staffs.getcontractDate().getTime(); //ngày ký hđ
                    long dateNow = now.getTime();  // ngày hiện tại
                    long temp1 = Math.abs(dateNow-signingTime);
                    long dayTotal = temp1/(24*60*60*1000);  // chuyển ms sang ngày

                    if (dayTotal>0&&dayTotal<365){
                        // làm dưới 1 năm: lương cơ bản
                        int salarys = staffs.getSalary();
                        int salaryPerDay = salarys/22; //lương tính theo ngày
                        System.out.println("Mời nhập số ngày nghỉ trong tháng: ");
                        int dayOff = Integer.parseInt(scanner.nextLine());
                        int total = salarys-(dayOff*salaryPerDay); // lương = lương - ngày nghỉ
                        System.out.println("Lương của nhân viên "+staffs.getUserName()+": "+total);
                    }
                    if (dayTotal>365&&dayTotal<=730){
                        // làm trên 1 năm: lương + 20%
                        int salarys = staffs.getSalary();
                        int salaryPerDay = salarys/22; //lương tính theo ngày
                        salarys= salarys+(int)((float)salarys*0.2f);
                        System.out.println("Mời nhập số ngày nghỉ trong tháng: ");
                        int dayOff = Integer.parseInt(scanner.nextLine());
                        int total = salarys-(dayOff*salaryPerDay); // lương = lương*hệ số - ngày nghỉ
                        System.out.println("Lương của nhân viên "+staffs.getUserName()+": "+total);
                    }
                    if (dayTotal<730) {
                        // làm trên 3 năm: lương + 50%
                        int salarys = staffs.getSalary();
                        int salaryPerDay = salarys / 22; //lương tính theo ngày
                        salarys = salarys + (int) ((float) salarys * 0.5f);
                        System.out.println("Mời nhập số ngày nghỉ trong tháng: ");
                        int dayOff = Integer.parseInt(scanner.nextLine());
                        int total = salarys - (dayOff * salaryPerDay); // lương = lương*hệ số - ngày nghỉ
                        System.out.println("Lương của nhân viên " + staffs.getUserName() + ": " + total);
                    }
                }
            }
            if (temp==true){
                System.out.println("Không tìm thấy ID này!");
            }
        }while (true);
    }

    private void deleteStaff(Scanner scanner,ArrayList<Staff> users) {
        System.out.println("---Xóa nhân viên---");
        System.out.println("Mời nhập ID nhân viên muốn xóa: ");
        int staffID;
        do {
           try{
               staffID = Integer.parseInt(scanner.nextLine());
               boolean temp = true;
               for (int i = 0; i < users.size(); i++) {
                   if (users.get(i).getId()==staffID){
                       users.remove(users.get(i));
                       temp = false;
                   }
               }
               if (temp==false){
                   System.out.println("Xóa nhân viên thành công!");
                   return;
               }
               if (temp==true){
                   System.out.println("Không tìm thấy ID này!");
                   return;
               }
           }catch (Exception e){
               System.out.println("Lỗi");
               return;
           }
        }while (true);
    }

    private void addStaff(Scanner scanner,ArrayList<Staff> users) {
        System.out.println("---Thêm nhân viên---");
        do {
            Staff staff = new Staff();
            staff.inputInfor(scanner);
            users.add(staff);
            for (int i = 0; i <users.size() ; i++) {
                System.out.println(users.get(i));
            }
            System.out.println("Thêm nhân viên thành công!");
            System.out.println("Bạn muốn thêm nhân viên nữa không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int functionNum = 2;
            int functionChoice = chooseFunction(scanner,functionNum);
            switch (functionChoice){
                case 1:
                    break;
                case 2:
                    return;
            }
        }while (true);
    }

    //hiển thị danh sách nhân viên
    private void showListStaff(Scanner scanner,ArrayList<Staff> users) {
        System.out.println("Mời chọn loại hiển thị:");
        System.out.println("1. Hiển thị danh sách nhân viên theo chức vụ");
        System.out.println("2. Hiển thị danh sách tất cả nhân viên");
        System.out.println("3. Quay lại ");
        System.out.println("Mời chọn chức năng: ");
        int functionNum = 3;
        int functionChoice = chooseFunction(scanner,functionNum);
        switch (functionChoice){
            case 1:
                showStaffByPosition(scanner,users);
                break;
            case 2:
                for (int i = 0; i < users.size(); i++) {
                    System.out.println(users.get(i));
                }
                break;
        }
    }

    private void showStaffByPosition(Scanner scanner,ArrayList<Staff> users) {
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
