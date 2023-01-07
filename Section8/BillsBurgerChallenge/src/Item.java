public class Item {

    private String name;
    private String type;
    private double price;
    private String size;

    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        System.out.println("This is a base item, it has no addons");
        return price;
    }

    public void printItem() {
        System.out.printf("%s - %s - Size: %s = %d", type, name, size, price);
    }
}
