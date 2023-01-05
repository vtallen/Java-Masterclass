public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer vincent = new EnhancedPlayer("Vincent", 200, "Sword");
        System.out.println("Initial health is " + vincent.healthRemaining());
    }
}