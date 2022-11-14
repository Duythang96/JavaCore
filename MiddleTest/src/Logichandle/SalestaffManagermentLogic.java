package Logichandle;

import Entity.Item;
import Entity.Salestaff;
import Entity.SalestaffDetail;
import Entity.Salestaffmanagerment;
import Main.Mainrun;

import java.util.Scanner;

public class SalestaffManagermentLogic {
    public static void saleStaffManagerment() {
        System.out.println("lap bang danh sach ban hang cho bao nhieu nhan vien");
        int saleStaffNum = new Scanner(System.in).nextInt();
        for (int i = 0; i <saleStaffNum ; i++) {
            System.out.println("Nhap thong tin cho nhan vien thu "+(i+1));
            System.out.println("Nhap ma nhan vien: ");
            Salestaff salesStaff = null;
            int staffID;
            do {
                staffID = new Scanner(System.in).nextInt();
                salesStaff = SalestaffLogic.findSaleStaffID(staffID);
                if (salesStaff !=null){
                    break;
                }
                System.out.println("khong tim thay ma nhan vien nay, moi nhap lai");
            }while (true);
            System.out.println("Nhap so luong mặt hàng nhan vien "+ (i+1)+" đã bán: ");
            int itemsNo;
            do {
                itemsNo = new Scanner(System.in).nextInt();
                if (itemsNo>0 && itemsNo<=5){
                    break;
                }
                System.out.println("Nhan vien khong ban qua 5 mat hang");
            }while (true);
            SalestaffDetail[] salestaffDetails = new SalestaffDetail[itemsNo];
            int count = 0;
            for (int j = 0; j < itemsNo; j++) {
                System.out.println("Nhap thong tin mat hang thu "+(j+1)+" ma nhan vien "+ salesStaff.getName()+ "da ban");
                System.out.println("Nhap id cua mat hang thu "+ (j+1)+":");
                Item items = null;
                int itemID;
                do {
                    itemID = new Scanner(System.in).nextInt();
                    items = ItemLogic.findItemID(itemID);
                    if (items!=null){
                        break;
                    }
                    System.out.println("Khong tim thay ma san pham nay");
                }while (true);
                System.out.println("Nhap so luong san pham da ban dc o mat hang thu "+(j+1));
                int quantity = new Scanner(System.in).nextInt();
                salestaffDetails[count] = new SalestaffDetail(items,quantity);
                count++;
            }
            Salestaffmanagerment saleDetailManagerment = new Salestaffmanagerment(salesStaff,salestaffDetails);
            saveSalestaffDetailManagerment(saleDetailManagerment);

        }
    }

    private static void saveSalestaffDetailManagerment(Salestaffmanagerment saleDetailManagerment) {
        for (int i = 0; i < Mainrun.saleDetailManagerments.length; i++) {
            if (Mainrun.saleDetailManagerments[i]==null){
                Mainrun.saleDetailManagerments[i]=saleDetailManagerment;
                break;
            }
        }
    }

    public static void showSalestaffDetailManagerment(){
        for (int i = 0; i < Mainrun.saleDetailManagerments.length; i++) {
            if (Mainrun.saleDetailManagerments[i]!=null){
                System.out.println(Mainrun.saleDetailManagerments[i]);
            }
        }
    }
}
