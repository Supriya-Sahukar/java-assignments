package Program_2;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product product1 = new Product("P1", "Product 1", 10.99, 5);
        Product product2 = new Product("P2", "Product 2", 19.99, 3);

        shop.addProduct(product1);
        shop.addProduct(product2);

        shop.displayProducts();

        System.out.println("Updating Product 1 details...");
        shop.updateProductDetails("P1", "Updated Product 1", 15.99, 10);

        Product updatedProduct1 = shop.getProductInfo("P1");
        System.out.println("Updated Product 1 details - Name: " + updatedProduct1.getName() + ", Price: " + updatedProduct1.getPrice() + ", Quantity: " + updatedProduct1.getQuantity());
    }
}
