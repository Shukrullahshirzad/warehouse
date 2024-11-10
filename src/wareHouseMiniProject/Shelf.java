package wareHouseMiniProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Shelf {
    private Map<String, Product> products = new HashMap<>();

    // Add or update a product
    public void addProduct(Product product) {
        products.put(product.getProductID(), product);
    }

    // Import (increase quantity) of a product
    public void importProduct(String productID, int amount) {
        Product product = products.get(productID);
        if (product != null) {
            product.setQuantity(product.getQuantity() + amount);
        } else {
            System.out.println("Product not found on this shelf.");
        }
    }

    // Export (decrease quantity) of a product
    public void exportProduct(String productID, int amount) {
        Product product = products.get(productID);
        if (product != null) {
            int newQuantity = Math.max(product.getQuantity() - amount, 0);
            product.setQuantity(newQuantity);
        } else {
            System.out.println("Product not found on this shelf.");
        }
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public Product getProduct(String productID) {
        return products.get(productID);
    }
}

// Warehouse class to manage multiple shelves

