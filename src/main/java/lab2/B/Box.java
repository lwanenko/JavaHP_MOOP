package lab2.B;

import java.util.*;

public class Box {
    private ArrayList<Candy> candies = new ArrayList<Candy>();

    public Box(ArrayList<Candy> candies) {
        this.candies = candies;
    }

    //в порядку зростання
    public ArrayList<Candy> sortCandysByWeigth(){
        Collections.sort(candies);
        return candies;
    }


    public Candy getCandyFromCaloriesRange(double fromCalories, double toCalories){
        for(Candy candy: candies){
            if (candy.getCalories() >= fromCalories &&
                    candy.getCalories()<= toCalories)
                return candy;
        }
        throw new RuntimeException();
    }


    @Override
    public String toString() {
        String result = "Box: " + "\n";
        for(Candy candy: candies){
            result += candy.toString()+ "\n";
        }
        return result;
    }
}
