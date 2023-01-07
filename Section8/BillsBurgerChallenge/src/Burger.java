public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    private double extraPrice = 0.25;


    public Burger(String name, String type, double price, String size) {
        super(name, type, price, size);
    }

    public double getExtraPrice() {
        return this.extraPrice;
    }
    public void addToppings(Item extra1, Item extra2, Item extra3) {
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

}
