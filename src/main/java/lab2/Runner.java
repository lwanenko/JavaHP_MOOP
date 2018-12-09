package lab2;

import lab2.A.Car;
import lab2.A.Motor;
import lab2.A.Wheel;
import lab2.B.Box;
import lab2.B.Candy;
import lab2.B.SugarCandy;

import java.util.ArrayList;

public class Runner {

    public static void main(String[ ] args) {
        System.out.println("MOOP Lab 2 Viacheslav Ivamemko BI-1 Var 2");
        partA();
        partB();
    }

    public static void partA(){
        System.out.println("A:");
        Wheel[] wheels = {
                new Wheel(15),
                new Wheel(15),
                new Wheel(15),
                new Wheel(15)
        };
        Motor motor = new Motor("1234567890", 1);
        Car car = new Car("Fiesta2018.1234567",12,"Ford", motor, wheels);
        car.ride();
        car.coutBrand();
        System.out.println(car);
    }

    public static void partB(){
        System.out.println("B:");
        ArrayList<Candy> candies = new ArrayList<Candy>();
        candies.add(new Candy("Mars", 0.1, 1000, 200));
        candies.add(new Candy("Lion", 0.09, 1200, 220));

        candies.add(new SugarCandy("Півник ", 0.1, 1200, 220, "Півник"));
        Box box = new Box(candies);
        box.sortCandysByWeigth();
        System.out.println(box);
    }
}
