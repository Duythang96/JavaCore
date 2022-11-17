package Logic;

import Main.MainRun;

public class Finditembyprice {
    public static void findItemByPrice() {
        for (int i = 0; i < MainRun.listItems.size(); i++) {
            if (MainRun.listItems.get(i)!=null && MainRun.listItems.get(i).getPrice()<50000){
                System.out.println("Sản phẩm có giá dưới 50k là: "+MainRun.listItems.get(i).getIteamName());
            }
            else if (MainRun.listItems.get(i)!=null && MainRun.listItems.get(i).getPrice()>=50000 &&MainRun.listItems.get(i).getPrice()<100000){
                System.out.println("Sản phẩm có giá từ 50k đến 100k là: "+MainRun.listItems.get(i).getIteamName());
            }
            else if (MainRun.listItems.get(i)!=null && MainRun.listItems.get(i).getPrice()>=100000){
                System.out.println("Sản phẩm có giá từ 100k là: "+MainRun.listItems.get(i).getIteamName());
            }
        }
    }
}
