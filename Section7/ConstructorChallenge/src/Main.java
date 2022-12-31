public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customer1 = new Customer("TIM", 69420, "TIM@TIMEMAIL.TIM");

        System.out.println(customer.getName());
        System.out.println(customer1.getName());
    }
}