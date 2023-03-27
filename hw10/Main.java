package javaCoreHW.hw10;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Creating products through factory
        Product foodProduct1 = ProductFactory.createFoodProduct(LocalDateTime.now().minusDays(4), 10);
        Product nonFoodProduct1 = ProductFactory.createNonFoodProduct(LocalDateTime.now().minusDays(10), 180);
        Product nonFoodProduct2 = ProductFactory.createNonFoodProduct(LocalDateTime.now().minusDays(20), 365);

        // Printing factory statistics
        System.out.println("Factory produced " + ProductFactory.getFoodProductCount() + " food products");
        System.out.println("Factory produced " + ProductFactory.getNonFoodProductCount() + " non-food products");
        System.out.println("Total products created: " + ProductFactory.getTotalProductCount());
    }
}
