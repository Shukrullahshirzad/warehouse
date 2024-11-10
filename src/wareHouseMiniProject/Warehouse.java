package wareHouseMiniProject;

import java.util.ArrayList;
import java.util.List;

class Warehouse {
    private List<Shelf> shelves;

    public Warehouse(int numberOfShelves) {
        shelves = new ArrayList<>();
        for (int i = 0; i < numberOfShelves; i++) {
            shelves.add(new Shelf());
        }
    }

    // Add product to a specific shelf
    public void addProductToShelf(int shelfIndex, Product product) {
        if (shelfIndex >= 0 && shelfIndex < shelves.size()) {
            shelves.get(shelfIndex).addProduct(product);
        } else {
            System.out.println("Shelf index out of range.");
        }
    }

    // Import product quantity to a specific shelf
    public void importProduct(int shelfIndex, String productID, int amount) {
        if (shelfIndex >= 0 && shelfIndex < shelves.size()) {
            shelves.get(shelfIndex).importProduct(productID, amount);
        } else {
            System.out.println("Shelf index out of range.");
        }
    }

    // Export product quantity from a specific shelf
    public void exportProduct(int shelfIndex, String productID, int amount) {
        if (shelfIndex >= 0 && shelfIndex < shelves.size()) {
            shelves.get(shelfIndex).exportProduct(productID, amount);
        } else {
            System.out.println("Shelf index out of range.");
        }
    }

    // Display all products on all shelves
    public void displayWarehouse() {
        for (int i = 0; i < shelves.size(); i++) {
            System.out.println("Shelf " + (i + 1) + ":");
            shelves.get(i).displayProducts();
            System.out.println();
        }
    }
}
