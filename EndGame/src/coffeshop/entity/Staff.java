package coffeshop.entity;

import coffeshop.constants.Constant;
import coffeshop.mainrun.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Staff extends Person {
    private static int autoID = 10000;
    private String userName;
    private String userPass;
    private int id;
    private String address;
    private Date contractDate;
    private String sex;
    private String email;
    private String position;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getcontractDate() {
        return contractDate;
    }

    public void setcontractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", contractDate=" + contractDate +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void inputInfor(Scanner scanner){
        this.id=autoID;
        autoID++;
        System.out.println("Nhập tên tài khoản:");
        this.userName = userNameInput(scanner, Main.users);
        //
        System.out.println("Nhập mật khẩu:");
        this.userPass = scanner.nextLine();
        //
        super.inputInfor(scanner);
        //
        //Nhập chức vụ nhân viên
        pisitionInput(scanner);
        //
        System.out.println("Mời nhập ngày ký hợp đồng nhân viên (dd/MM/yyyy): ");
        this.contractDate = contractDateInput(scanner);
        // Nhập giới tính
        this.sex = sexInput(scanner);
        //
        System.out.println("Mời nhập địa chỉ nhân viên: ");
        this.address = scanner.nextLine();
        //
        System.out.println("Mời nhập email nhân viên: ");
        this.email = emailInput(scanner,Main.users);

        System.out.println("Nhập lương cơ bản cho nhân viên: ");
        this.salary = Integer.parseInt(scanner.nextLine());
    }

    private String emailInput(Scanner scanner, ArrayList<Staff> users) {
        String emailRegex = "^[A-Za-z][\\w(-_.,;)\\.]{2,30}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        //địa chỉ email phải bắt đầu bằng 1 ký tự chữ
        //tập hợp của các ký tự a-z, 0-9 và có thể có các ký tự đặc biệt
        //tên miền của email có thể là tên miền cấp 1 or tên miền cấp 2
        // duythang_96@mail.co.jp
        String email;
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher;
        do {
            boolean temp = true;
            boolean temp2 = false;
            email = scanner.nextLine();
            matcher = pattern.matcher(email);
            //kt co du lieu chua, chưa có nhân viên thì break
            if (matcher.find()==true){
                temp2=true;
            }
            if (users.size()==0&&temp2==true){
                break;
            }
            //kt co trùng email ko
            for (Staff userPassCheck: users){
                if (userPassCheck.getEmail().equals(email)){
                    temp = false;
                }
            }
            if (temp==false){
                System.out.println("Email đã tồn tại! Mời nhập lại email: ");
            }
            if (temp==true&&temp2==false){
                System.out.println("Email sai định dạng! Mời nhập lại email: ");
            }
            if (temp==true&&temp2==true){
                break;
            }
        }while (true);
        return email;
    }

    private void pisitionInput(Scanner scanner) {
            System.out.println("Mời chọn chức vụ nhân viên: ");
            System.out.println("1. Thu ngân");
            System.out.println("2. Quản lý");
            int positionChoose ;
            do {
                try{
                    positionChoose = Integer.parseInt(scanner.nextLine());
                    if (positionChoose>0 && positionChoose<=2){
                        break;
                    }
                    System.out.println("Mời chọn lại chức vụ!");
                }catch (Exception e){
                    System.out.println("Mời chọn lại chức vụ!");
                }
            }while (true);
            switch (positionChoose) {
                case 1:
                    this.position = Constant.C.value;
                    break;
                case 2:
                    this.position = Constant.Mg.value;
                    break;
            }
    }

    private String sexInput(Scanner scanner) {
        System.out.println("Mời chọn giới tính nhân viên: ");
        System.out.println("1. Male");
        System.out.println("2. FeMale");
        int choose;
        do {
           try{
               choose = Integer.parseInt(scanner.nextLine());
               if (choose>0 && choose<=2){
                   break;
               }
               else {
                   System.out.println("Mời chọn lại giới tính!");
               }
           }catch (Exception e){
               System.out.println("Mời chọn lại giới tính!");
           }
        }while (true);
        if (choose==1){
            return Constant.M.value;
        }
        else {
            return Constant.F.value;
        }
    }

    private Date contractDateInput(Scanner scanner) {
        String date;
        do {
            date = scanner.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                return simpleDateFormat.parse(date);
            } catch (ParseException e) {
                System.out.println("Bạn nhập sai định dạng! Mời nhập lại theo định dạng (đ/MM/yyyy)");
            }
        }while (true);
    }


    private String userNameInput(Scanner scanner, ArrayList<Staff> user) {
        String userName;
        do {
            boolean temp = true;
            userName=  scanner.nextLine();
            if (user.size()==0){
                break;
            }
            for (Staff userCheck: user){
                if (userCheck.getUserName().compareTo(userName)==0){
                    temp = false;
                    break;
                }
            }
            if (temp==false){
                System.out.println("Tài khoản đã tồn tại!");
            }
            if (temp==true){
                break;
            }
        }while (true);
        return userName;
    }
}
