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
        System.out.println("Nh???p t??n t??i kho???n:");
        this.userName = userNameInput(scanner, Main.users);
        //
        System.out.println("Nh???p m???t kh???u:");
        this.userPass = scanner.nextLine();
        //
        super.inputInfor(scanner);
        //
        //Nh???p ch???c v??? nh??n vi??n
        pisitionInput(scanner);
        //
        System.out.println("M???i nh???p ng??y k?? h???p ?????ng nh??n vi??n (dd/MM/yyyy): ");
        this.contractDate = contractDateInput(scanner);
        // Nh???p gi???i t??nh
        this.sex = sexInput(scanner);
        //
        System.out.println("M???i nh???p ?????a ch??? nh??n vi??n: ");
        this.address = scanner.nextLine();
        //
        System.out.println("M???i nh???p email nh??n vi??n: ");
        this.email = emailInput(scanner,Main.users);

        System.out.println("Nh???p l????ng c?? b???n cho nh??n vi??n: ");
        this.salary = Integer.parseInt(scanner.nextLine());
    }

    private String emailInput(Scanner scanner, ArrayList<Staff> users) {
        String emailRegex = "^[A-Za-z][\\w(-_.,;)\\.]{2,30}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        //?????a ch??? email ph???i b???t ?????u b???ng 1 k?? t??? ch???
        //t???p h???p c???a c??c k?? t??? a-z, 0-9 v?? c?? th??? c?? c??c k?? t??? ?????c bi???t
        //t??n mi???n c???a email c?? th??? l?? t??n mi???n c???p 1 or t??n mi???n c???p 2
        // duythang_96@mail.co.jp
        String email;
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher;
        do {
            boolean temp = true;
            boolean temp2 = false;
            email = scanner.nextLine();
            matcher = pattern.matcher(email);
            //kt co du lieu chua, ch??a c?? nh??n vi??n th?? break
            if (matcher.find()==true){
                temp2=true;
            }
            if (users.size()==0&&temp2==true){
                break;
            }
            //kt co tr??ng email ko
            for (Staff userPassCheck: users){
                if (userPassCheck.getEmail().equals(email)){
                    temp = false;
                }
            }
            if (temp==false){
                System.out.println("Email ???? t???n t???i! M???i nh???p l???i email: ");
            }
            if (temp==true&&temp2==false){
                System.out.println("Email sai ?????nh d???ng! M???i nh???p l???i email: ");
            }
            if (temp==true&&temp2==true){
                break;
            }
        }while (true);
        return email;
    }

    private void pisitionInput(Scanner scanner) {
            System.out.println("M???i ch???n ch???c v??? nh??n vi??n: ");
            System.out.println("1. Thu ng??n");
            System.out.println("2. Qu???n l??");
            int positionChoose ;
            do {
                try{
                    positionChoose = Integer.parseInt(scanner.nextLine());
                    if (positionChoose>0 && positionChoose<=2){
                        break;
                    }
                    System.out.println("M???i ch???n l???i ch???c v???!");
                }catch (Exception e){
                    System.out.println("M???i ch???n l???i ch???c v???!");
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
        System.out.println("M???i ch???n gi???i t??nh nh??n vi??n: ");
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
                   System.out.println("M???i ch???n l???i gi???i t??nh!");
               }
           }catch (Exception e){
               System.out.println("M???i ch???n l???i gi???i t??nh!");
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
                System.out.println("B???n nh???p sai ?????nh d???ng! M???i nh???p l???i theo ?????nh d???ng (??/MM/yyyy)");
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
                System.out.println("T??i kho???n ???? t???n t???i!");
            }
            if (temp==true){
                break;
            }
        }while (true);
        return userName;
    }
}
