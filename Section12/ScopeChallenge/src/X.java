public class X {
    int x;
    public int printTable(int x) {
        if (x == -1) {
            return -1;
        }

        this.x = x;

        for (x = 1; x <= 12; x++) {
            System.out.printf("%d x %d = %d\n", this.x, x, this.x * x);
        }

        return 0;
    }
}

