package lab2.B;

import org.jetbrains.annotations.NotNull;

public class Candy implements Comparable<Candy>{
    public final String name;
    private double weight;//kg
    public final double caloriesFor1kg;
    public final double priceFor1kg;

    public Candy(String name, double weight, double calories, double priceFor1kg) {
        this.name = name;
        this.weight = weight;
        this.caloriesFor1kg = calories;
        this.priceFor1kg = priceFor1kg;
    }

    public double getCalories() {
        return caloriesFor1kg*weight;
    }

    public double getPrice(){
        return priceFor1kg*weight;
    }

    public void addWeight(double weight){
        this.weight =+ weight;
    }

    public double getWeight(){
        return weight;
    }


    @Override
    public String toString() {
        return  name +
                ", weight " + getWeight() +
                ", calories " + getCalories() +
                ", price " + getPrice();
    }

    @Override
    public int compareTo(@NotNull Candy o) {
        if (this.weight > o.getWeight()) return 1;
        if (this.weight < o.getWeight())return -1;
        return 0;
    }
}
