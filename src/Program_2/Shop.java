package Program_2;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private Map<String, Product> products=new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getCode(), product);
    }

    public void updateProductDetails(String code, String name, double price, int quantity) {
        if (products.containsKey(code)) {
            Product product = products.get(code);
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
        }
    }

    public Product getProductInfo(String code) {
        return products.get(code);
    }

    public void displayProducts() {
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            String code = entry.getKey();
            Product product = entry.getValue();
            System.out.println("Code: " + code + ", Name: " + product.getName() + ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
        }
    }
}
