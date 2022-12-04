package coffeshop.entity;

import coffeshop.constants.Constant;

import java.util.Scanner;

public class Table {
    private static int autoID=1;
    private int tableID;
    private String tableType;
    private String tableStatus;

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableID=" + tableID +
                ", tableType='" + tableType + '\'' +
                '}';
    }
    public void tableInput(Scanner scanner){
        this.tableID=autoID;
        autoID++;
        System.out.println("Mời chọn loại bàn:");
        System.out.println("1.Ban 4 chỗ");
        System.out.println("2.Ban 6 chỗ");
        System.out.println("3.Ban 8 chỗ");
        int choose;
        do {
            choose = Integer.parseInt(scanner.nextLine());
            if (choose>0 && choose<=3){
                break;
            }
            System.out.println("Mời chọn lại loại bàn!");
        }while (true);
        switch (choose) {
            case 1:
                this.tableType = Constant.T4.value;
                break;
            case 2:
                this.tableType = Constant.T6.value;
                break;
            case 3:
                this.tableType = Constant.T8.value;
                break;
        }
        System.out.println("Mời chọn trạng thái bàn: ");
        System.out.println("1. Available");
        System.out.println("2. Reserved");
        int choose2;
        do {
            choose2 = Integer.parseInt(scanner.nextLine());
            if (choose2>0 && choose2<=2){
                break;
            }
            System.out.println("Mời chọn lại trạng thái bàn!");
        }while (true);
        switch (choose2) {
            case 1:
                this.tableStatus = Constant.A.value;
                break;
            case 2:
                this.tableStatus = Constant.R.value;
                break;
        }
    }
}
