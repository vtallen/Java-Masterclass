public class Main {
    public static void main(String[] args) {
        displayHighScorePosition("VvoltageA", 1);

        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(1000));
        System.out.println(calculateHighScorePosition(500));
        System.out.println(calculateHighScorePosition(100));
        System.out.println(calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String playerName, int scoreListPos) {
        System.out.println(playerName + " managed to get into position " + scoreListPos + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 100 && score < 500) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 1000) {
            return 3;
        }

        return 4;
    }
}