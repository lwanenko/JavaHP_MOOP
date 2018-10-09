package lab2;

import lab2.A.Car;
import lab2.A.Motor;
import lab2.A.Wheel;

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

    }
}
