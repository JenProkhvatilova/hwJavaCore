package javaCoreHW.hw10;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

class ProductFactory {
    private static int foodProductCount = 0;
    private static int nonFoodProductCount = 0;
    private static int totalProductCount = 0;
    private static Map<String, Integer> productTypeCountMap = new HashMap<>();

    public static Product createFoodProduct(LocalDateTime productionDateTime, int expirationDays) {
        foodProductCount++;
        updateProductTypeCountMap("Food");
        return new FoodProduct(productionDateTime, expirationDays);
    }

    public static Product createNonFoodProduct(LocalDateTime productionDateTime, int expirationDays) {
        nonFoodProductCount++;
        updateProductTypeCountMap("Non-Food");
        return new NonFoodProduct(productionDateTime, expirationDays);
    }

    public static int getFoodProductCount() {
        return foodProductCount;
    }

    public static int getNonFoodProductCount() {
        return nonFoodProductCount;
    }
    public static int getTotalProductCount() {
        totalProductCount = foodProductCount+nonFoodProductCount;

        return totalProductCount;
    }



    public static Map<String, Integer> getProductTypeCountMap() {
        return productTypeCountMap;
    }

    private static void updateProductTypeCountMap(String productType) {
        if (productTypeCountMap.containsKey(productType)) {
            int count = productTypeCountMap.get(productType);
            productTypeCountMap.put(productType, count + 1);
        } else {
            productTypeCountMap.put(productType, 1);
        }
    }
}
