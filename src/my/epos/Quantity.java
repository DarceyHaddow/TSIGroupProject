package my.epos;

public class Quantity {
    private int Quantity;

    public Quantity(int quantity) {
        Quantity = quantity;
    }


    public String quantityInfo(int quantity) {
        return(String.valueOf(quantity));
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

}
