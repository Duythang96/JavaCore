package Entity;

import Constant.ItemType;

import java.util.Scanner;

public class Item implements Inputtable{
    public static int autoID= 10000;
    protected int itemID;
    protected String itemName;
    protected String itemType;
    protected String itemPrice;
    protected int itemQuantity;

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemID='" + itemID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                ", itemQuantity=" + itemQuantity +
                '}';
    }
    @Override
    public void inputInfor(){
        this.itemID = autoID;
        autoID++;
        System.out.println("Nhap ten hang hoa: ");
        this.itemName = new Scanner(System.in).nextLine();
        System.out.println("Moi chon nhom hang: ");
        System.out.println("1. Dien tu ");
        System.out.println("2. Dien lanh ");
        System.out.println("3. May tinh ");
        System.out.println("4. Thiet bi van phong");
        int itemTypeSelec;
        do {
            itemTypeSelec = new Scanner(System.in).nextInt();
            if (itemTypeSelec>0 && itemTypeSelec<=4){
                break;
            }
            System.out.println("Nhom hang khong hop le, Moi chon lai");
        }while (true);
        switch (itemTypeSelec){
            case 1:
                this.itemType = ItemType.DT.value;
                break;
            case 2:
                this.itemType = ItemType.DL.value;
                break;
            case 3:
                this.itemType = ItemType.MT.value;
                break;
            case 4:
                this.itemType = ItemType.TBVP.value;
                break;
        }
        System.out.println("Nhap gia ban: ");
        this.itemPrice = new Scanner(System.in).nextLine();
        System.out.println("Nhap so luong hang hoa: ");
        this.itemQuantity = new Scanner(System.in).nextInt();
    }
}
