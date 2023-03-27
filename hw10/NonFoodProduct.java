package javaCoreHW.hw10;

import java.time.LocalDateTime;

class NonFoodProduct extends Product {
    public NonFoodProduct(LocalDateTime productionDateTime, int expirationDays) {
        super(productionDateTime, expirationDays);
    }

    @Override
    public String getProductType() {
        return "Non-Food";
    }
}
