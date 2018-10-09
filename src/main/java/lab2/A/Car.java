package lab2.A;


import java.util.Arrays;
import java.util.Objects;

public class Car {
    private String id;
    //пальне
    private double fuel = 0;
    private final String brand;
    private Motor motor;
    private Wheel[] wheels;

    public Car(String id, double fuel, String brand, Motor motor, Wheel[] wheels) {
        this.id = id;
        this.fuel = fuel;
        this.brand = brand;
        this.motor = motor;
        this.wheels = wheels;
    }

    public void ride(){
        if(wheels.length != 4 || motor == null)
            throw new RuntimeException();
        for(Wheel wheel:wheels)
            if(wheel == null)
                throw new RuntimeException();
        fuel -= motor.work();
        if(fuel < 0){
            fuel = 0;
            throw new RuntimeException();
        }
    }

    public void changeWheel(Wheel wheel, int pos){
        wheels[pos] = wheel;
    }

    //заправлятися
    public void fill(double fuel){
        if(fuel<0)
            throw new RuntimeException();
        this.fuel += fuel;

    }

    public void coutBrand(){
        System.out.println(brand);
    }

    @Override
    public String toString() {
        return brand + " " + this.id + " (motor: " + motor.id + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return  Objects.equals(id, car.id) &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(motor, car.motor);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, fuel, brand, motor);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }
}
