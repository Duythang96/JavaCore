package handle;

import mainrun.Main;

public class StaffShowMenu {
    public void menuShow(){
        System.out.println("---Danh sach menu---");
        for (int i = 0; i < Main.menus.size(); i++) {
            System.out.println(Main.menus.get(i));
        }
    }
}
