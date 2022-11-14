package Constant;

public enum ItemType {
    DT ("Dien tu"),
    DL ("Dien lanh"),
    MT ("May tinh"),
    TBVP ("Thiet bi van phong");

    public String value;

    ItemType(String value){
        this.value = value;
    }
}
