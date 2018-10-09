package lab1.C;

import java.util.Objects;

public class RationalNumber{
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) throws ArithmeticException{
        if(denominator == 0) throw new ArithmeticException("division by zero");
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private int gcd(int a , int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

    public void simplify() {
        int g = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= g;
        denominator /= g;
        if(denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public RationalNumber multiply(RationalNumber other) {
        RationalNumber number = new RationalNumber(numerator, denominator);
        number.numerator *= other.numerator;
        number.denominator *= other.denominator;
        number.simplify();
        return number;
    }

    public RationalNumber add(RationalNumber other) {
        RationalNumber number = new RationalNumber(numerator, denominator);
        number.numerator = numerator * other.denominator + other.numerator * denominator;
        number.denominator *= other.denominator;
        number.simplify();
        return number;
    }

    public RationalNumber subtract(RationalNumber other) {
        RationalNumber number = new RationalNumber(numerator, denominator);
        return number.add(new RationalNumber(-other.numerator, other.denominator));
    }

    public RationalNumber divide(RationalNumber other) throws ArithmeticException {
        if(other.numerator == 0) throw new ArithmeticException("division by zero");
        RationalNumber number = new RationalNumber(numerator, denominator);
        return number.multiply(new RationalNumber(other.denominator, other.numerator));
    }

    public RationalNumber pow(int n) {
        return new RationalNumber((int)Math.pow(numerator, n), (int)Math.pow(denominator, n));
    }

    public double toDouble() {
        return 1.0 * numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + (denominator != 1 ? "/" + denominator : "");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RationalNumber that = (RationalNumber) o;
        this.simplify();
        that.simplify();
        return numerator == that.numerator &&
                denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}