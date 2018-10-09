package lab1.C;

public class Point {

    private RationalNumber x;
    private RationalNumber y;

    public Point(RationalNumber x, RationalNumber y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +"," + y +")";
    }

}
