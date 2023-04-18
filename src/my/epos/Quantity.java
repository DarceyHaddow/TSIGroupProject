package my.epos;

public class Quantity {
    private int Quantity;

    public Quantity(int quantity) {
        Quantity = quantity;
    }

    // quantityInfo takes an integer parameter to allow for the class to be
    // used to create labelled buttons later on in the creation process
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
