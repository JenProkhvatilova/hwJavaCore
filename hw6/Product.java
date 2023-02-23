package javaCoreHW.hw6;
public class Product {
    private final String productName;
    private int productArticleNumber;
    private float productPrice;
    private String productDescription;
    private boolean productPresence;

    public Product(String productName, int productArticleNumber,
                   float productPrice, String productDescription, boolean productPresence) {
        this.productName = productName;
        this.productArticleNumber = productArticleNumber;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productPresence = productPresence;
    }

    public Product(String productName, int productArticleNumber) {
        this.productName = productName;
        this.productArticleNumber = productArticleNumber;
    }

    public Product(String productName, int productArticleNumber,
                   String productDescription) {
        this.productName = productName;
        this.productArticleNumber = productArticleNumber;
        this.productDescription = productDescription;
    }

    public Product(String productName, int productArticleNumber,
                   float productPrice, boolean productPresence) {
        this.productName = productName;
        this.productArticleNumber = productArticleNumber;
        this.productPrice = productPrice;
        this.productPresence = productPresence;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductPresence(boolean productPresence) {
        this.productPresence = productPresence;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductArticleNumber() {
        return productArticleNumber;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public boolean getProductPresence() {
        return productPresence;
    }

    public static void main(String[] args) {
    }
}

/*
1. Описати клас Product
 Поля:
 - Назва товару
 - артикул (код товару)
 - ціна
 - опис товару
 - наявність (є чи немає)

4. Описати клас кредит. (Самостійно визначаєте поля і методи)
 */