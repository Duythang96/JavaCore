package Entity;

import java.util.Arrays;

public class Salestaffmanagerment {
   private Salestaff salesStaff;
   private SalestaffDetail[] saleDetails;
   //private int totalItems;

    public Salestaffmanagerment(Salestaff salesStaff, SalestaffDetail[] saleDetails) {
        this.salesStaff = salesStaff;
        this.saleDetails = saleDetails;
    }

    public Salestaff getSalesStaff() {
        return salesStaff;
    }

    public void setSalesStaff(Salestaff salesStaff) {
        this.salesStaff = salesStaff;
    }

    public SalestaffDetail[] getSaleDetails() {
        return saleDetails;
    }

    public void setSaleDetails(SalestaffDetail[] saleDetails) {
        this.saleDetails = saleDetails;
    }

    @Override
    public String toString() {
        return "SaleDetailManagerment{" +
                "salesStaff=" + salesStaff +
                ", saleDetails=" + Arrays.toString(saleDetails) +
                '}';
    }
}
