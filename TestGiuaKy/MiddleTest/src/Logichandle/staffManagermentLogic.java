package Logichandle;

import Entity.Item;
import Entity.Salestaff;
import Entity.SalestaffDetail;
import Entity.Salestaffmanagerment;
import Main.Mainrun;

public class staffManagermentLogic {
    public static void sortByWriterName() {
        for (int i = 0; i < Mainrun.saleDetailManagerments.length - 1; i++) {
            Salestaffmanagerment saleStaff1 = Mainrun.saleDetailManagerments[i];
            if (saleStaff1 == null) {
                continue;
            }
            for (int j = i + 1; j < Mainrun.saleDetailManagerments.length; j++) {
                Salestaffmanagerment saleStaff2 = Mainrun.saleDetailManagerments[j];
                if (saleStaff2 == null) {
                    continue;
                }
                if (saleStaff2.getSalesStaff().getName().compareTo(saleStaff1.getSalesStaff().getName()) > 0) {
                    Salestaffmanagerment temp = saleStaff1;
                    saleStaff1 = saleStaff2;
                    saleStaff2 = temp;
                }
            }
        }
    }

    public static void sortByItem(){
        String[] item = new String[100];
        for (int i = 0; i < Mainrun.salestaffs.length; i++) {
            Salestaff staffs = Mainrun.salestaffs[i];
            if (staffs ==null){
                continue;
            }
            else{
                for (int j = 0; j < Mainrun.saleDetailManagerments.length; j++) {



                }
            }


        }
    }
}
