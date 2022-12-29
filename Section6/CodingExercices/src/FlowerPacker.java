public class FlowerPacker {
    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountKg = bigCount * 5;
        int smallCountKg = smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (bigCountKg + smallCountKg < goal) {
            return false;
        } else if (goal % 5 > smallCount) {
            return false;
        } else {
            return true;
        }
    }
}
