package Logic;

import Main.MainRun;

public class Findquantitysmallthan5 {
    public static void findQuantitySmallThan5() {
        System.out.println("Sản phảm có số lượng ít hơn 5: ");
        boolean temp = false;
        for (int i = 0; i < MainRun.listItems.size(); i++) {
            if (MainRun.listItems.get(i)!=null && MainRun.listItems.get(i).getAmount()<5){
                System.out.println(MainRun.listItems.get(i).getIteamName());
                temp = true;
            }
        }
        if (temp==false){
            System.out.println("Không có sản phẩm nào số lượng ít hơn 5");
        }
    }
}
