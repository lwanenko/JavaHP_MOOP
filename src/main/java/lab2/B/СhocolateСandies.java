package lab2.B;

public class СhocolateСandies extends Candy {

    private final double  massFractionOfChocolate;

    public СhocolateСandies(String name, double weight, double calories, double priceFor1kg, double massFractionOfChocolate) {
        super(name, weight, calories, priceFor1kg);
        this.massFractionOfChocolate = massFractionOfChocolate;
    }

    public double getСhocolateWeight(){
        return getWeight() * massFractionOfChocolate;
    }

    @Override
    public String toString() {
        return  name +
                ", weight " + getWeight() +
                ", calories" + getCalories() +
                ", price " + getPrice()+
                ", chocolate weight " + getСhocolateWeight();
    }
}
