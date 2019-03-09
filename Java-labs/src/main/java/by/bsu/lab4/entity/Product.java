package by.bsu.lab4.entity;


import org.apache.log4j.Logger;

public class Product {

    private final static Logger logger = Logger.getLogger(Product.class);

    private int id;
    private String name;
    private int upc;
    private String manufacture;
    private double price;
    private int shelfLife;
    private int quantity;

    public Product(int id, String name, int upc, String manufacture, double price, int shelfLife, int quantity) {
        this.id = id;
        this.name = name;
        this.upc = upc;
        this.manufacture = manufacture;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
        logger.info("A new product has been created: " +
                "id-" + id + ", Name-" + name + ", UPC-" + upc + ", Manufacture-" + manufacture + ", Price-" + price +
                ", Shelf life-" + shelfLife + ", Quantity-" +quantity);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public int getUpc() {
        return upc;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", upc=" + upc +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                ", shelfLife=" + shelfLife +
                ", quantity=" + quantity +
                '}';
    }
}
