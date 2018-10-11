package lab2.B;

public class SugarCandy extends Candy {

    public final String form;

    public SugarCandy(String name, double weight, double calories, double priceFor1kg, String form) {
        super(name, weight, calories, priceFor1kg);
        this.form = form;
    }

    @Override
    public String toString() {
        return  name +
                ", weight " + getWeight() +
                ", calories" + getCalories() +
                ", price " + getPrice()+
                ", form " + form;
    }
}
