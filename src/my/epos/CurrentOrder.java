package my.epos;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrentOrder {

    public double currentOrderValue;

    public double getCurrentOrder() {
        return currentOrderValue;
    }

    public String outputCurrentOrder(){
        NumberFormat ukFormat = NumberFormat.getCurrencyInstance(Locale.UK);
        String formattedString = ukFormat.format(currentOrderValue);
        return formattedString;
    }

    public double currentOrderValue(double productPriceCost){
        this.currentOrderValue += productPriceCost;
        return currentOrderValue;
    }

    public double initaliseCurrentOrder() {
        this.currentOrderValue = 0.00;
        return currentOrderValue;
    }


}
