public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Setters

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Methods
    public double distance() {
        return Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point point) {
        return Math.sqrt((point.getX() - this.x) * (point.getX() - this.x) + (point.getY() - this.y) * (point.getY() - this.y));
    }

}
