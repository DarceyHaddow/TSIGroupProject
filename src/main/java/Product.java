import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    private double price;
    private String productName;

    public Product(double price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    public String productInfo(double price, String productName) {
        NumberFormat ukFormat = NumberFormat.getCurrencyInstance(Locale.UK);
        String formattedString = ukFormat.format(price);
        return(productName +  ": " + formattedString);
    }

}
