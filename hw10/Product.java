package javaCoreHW.hw10;

import java.time.LocalDateTime;

abstract class Product {
    private final LocalDateTime productionDateTime;
    private final int expirationDays;

    public Product(LocalDateTime productionDateTime, int expirationDays) {
        this.productionDateTime = productionDateTime;
        this.expirationDays = expirationDays;
    }

    public LocalDateTime getProductionDateTime() {
        return productionDateTime;
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    public abstract String getProductType();
}

/*Реалізувати ієрархію товарів:
 - продуктові (продукти харчування)
 - не продуктові (всі інші)
 з полями:
 - дата та час виробництва
 - термін придатності або гарантійний термін
Описати клас ProductFactory (фабрику товарів), який буде створювати і повертати інстанси продуктів.
Реалізувати, використовуючи знання про статичні поля і методи, підрахунок і виведення кількості товарів які були
виготовлені на фабриці, а також загальну кількість кожного товару.
(В класі Main сгенерувати довільну кількість товарів через конструктор та через фабрику. Вивести результати на екран)
Приклад виводу:
Фабрика виготовила хх продуктових товарів
Фабрика виготовила yy непродуктових товарів
Загалом створено хх продуктових товарів
Загалом створено yy непродуктових товарів */