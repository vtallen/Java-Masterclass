public class Main {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("a", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("b", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("c", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("d", highScorePosition);

        highScorePosition = calculateHighScorePosition(-1000);
        displayHighScorePosition("e", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int scoreListPos) {
        System.out.println(playerName + " managed to get into position " + scoreListPos + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 100 && score < 500) {
            position = 3;
        } else if (score >= 500 && score < 1000) {
            position = 2;
        } else if (score >= 1000) {
            position = 1;
        }

        return position;
    }
}