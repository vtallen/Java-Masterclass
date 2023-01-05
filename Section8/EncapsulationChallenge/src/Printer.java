public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel <= 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }

        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }
    public int addToner(int tonerAmount) {
        if ((this.tonerLevel + tonerAmount) > 100 || (this.tonerLevel + tonerAmount) < 0) {
            return -1;
        }

        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int numPages) {
        if (this.duplex) {
            pagesPrinted += (numPages / 2) + numPages % 2;
            System.out.println("This is a duplex printer");
        } else {
            pagesPrinted += numPages;
        }

        this.tonerLevel -= numPages * 0.50;

        return this.pagesPrinted;
    }
}
