package wareHouseMiniProject;

class Product {
    private static int idCounter = 1;  // Static counter for unique product IDs
    private String productID;
    private String productName;
    private String manufacturer;
    private String unit;
    private int quantity;

    public Product(String productName, String manufacturer, String unit, int quantity) {
        this.productID = "P" + idCounter++;  // Generate unique product ID
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.unit = unit;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProductID() { return productID; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Manufacturer: %s, Unit: %s, Quantity: %d",
                productID, productName, manufacturer, unit, quantity);
    }
}
