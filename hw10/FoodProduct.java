package javaCoreHW.hw10;

import java.time.LocalDateTime;

class FoodProduct extends Product {
    public FoodProduct(LocalDateTime productionDateTime, int expirationDays) {
        super(productionDateTime, expirationDays);
    }

    @Override
    public String getProductType() {
        return "Food";
    }
}






