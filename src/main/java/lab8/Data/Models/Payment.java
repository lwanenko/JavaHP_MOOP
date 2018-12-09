package lab8.Data.Models;

public class Payment {

    private int id;
    private int idFrom;
    private int idTo;
    private double Value;

    public Payment(int idFrom, int idTo, double value) {
        this.idFrom = idFrom;
        this.idTo = idTo;
        Value = value;
    }

    public int getId() {
        return id;
    }

    public int getIdFrom() {
        return idFrom;
    }

    public int getIdTo() {
        return idTo;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }
}
