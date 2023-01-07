public class MealOrder {

    private Item side = new Item();
    private Item drink;
    private Burger burger;

    public void addToppings(String topping1Name, String topping2Name, String topping3Name) {

        Item topping1 = new Item(topping1Name, "Topping", this.burger.getExtraPrice(), "NA");
        Item topping2 = new Item(topping2Name, "Topping", this.burger.getExtraPrice(), "NA");
        Item topping3 = new Item(topping3Name, "Topping", this.burger.getExtraPrice(), "NA");

        this.burger.addToppings(topping1, topping2, topping3);
    }

    public void setDrinkSize(String size) {
        this.drink = new Item()
    }

    public void printItemizedList() {

    }

    public void printTotal() {

    }
}
