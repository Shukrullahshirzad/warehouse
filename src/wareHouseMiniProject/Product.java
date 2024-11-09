package wareHouseMiniProject;

public class Product {
    private int productID;
    private String productName;
    private String manufacturer;
    private String unit;



    public Product(int productID, String productName, String manufacturer, String unit) {
        this.productID = productID;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.unit = unit;
    }
    // getter methods for the product
    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    // Setter methods for the product

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
