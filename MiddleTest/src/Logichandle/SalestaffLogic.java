package Logichandle;

import Entity.Salestaff;
import Main.Mainrun;

import java.util.Scanner;
public class SalestaffLogic {

    public static Salestaff findSaleStaffID(int staffID){
        Salestaff salestaff = null;
        for (int j = 0; j < Mainrun.salestaffs.length; j++) {
            if (Mainrun.salestaffs[j]!=null && Mainrun.salestaffs[j].getId() == staffID) {
                salestaff = Mainrun.salestaffs[j];
                break;
            }
        }
        return salestaff;
    }
    public static void addNewStaff() {
        System.out.println("Ban muon nhap bao nhieu nhan vien: ");
        int staffNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < staffNum; i++) {
            Salestaff salestaff = new Salestaff();
            salestaff.inputInfor();;
            saveStaff(salestaff);
        }
    }

    public static void saveStaff(Salestaff salestaff) {
        if (salestaff == null){
            return;
        }
        for (int i = 0; i < Mainrun.salestaffs.length; i++) {
            if(Mainrun.salestaffs[i]==null){
                Mainrun.salestaffs[i] = salestaff;
                break;
            }
        }
    }
    public static void showNewStaff() {
        for (int i = 0; i < Mainrun.salestaffs.length; i++) {
            if (Mainrun.salestaffs[i]!=null){
                System.out.println(Mainrun.salestaffs[i]);
            }
        }
    }
}
