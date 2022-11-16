package sample.Model;

public class ProductSearchModel {
    Integer productID;
    String brand, modelNumber;
    Integer modelYear;
    String productName, description;

    public ProductSearchModel(Integer productID, String brand, String modelNumber, Integer modelYear, String productName, String description) {
        this.productID = productID;
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.modelYear = modelYear;
        this.productName = productName;
        this.description = description;
    }


    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
