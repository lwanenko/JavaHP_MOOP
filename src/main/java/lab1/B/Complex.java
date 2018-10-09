package lab1.B;

import java.util.ArrayList;

public class Complex {

    private double re;   // the real part
    private double im;   // the imaginary part

    // create a new object with the given real and imaginary parts
    public Complex(double real, double imag) {
        re = real;
        im = imag;
    }

    public void add(Complex complex) {
        this.re = this.re + complex.re;
        this.im = this.im + complex.im;
    }

    @Override
    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }

    public double getRe() {
        return re;
    }
    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }
    public void setIm(double im) {
        this.im = im;
    }

    public static Complex addList(ArrayList<Complex> list){
        Complex sum = new Complex(0 , 0);
        for (Complex element: list) {
            sum.add(element);
        }
        return sum;
    }
}
