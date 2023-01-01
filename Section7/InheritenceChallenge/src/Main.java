public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Worker worker = new Worker("Vincent", "01/24/2004");

        System.out.println(worker.getAge());
    }
}