package lab2.A;

import java.util.Objects;

public class Motor {

    public String id;
    private double fuelForWork;

    public Motor(String id, double fuelForWork) {
        this.id = id;
        this.fuelForWork = fuelForWork;
    }

    public double work(){
        return fuelForWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return Objects.equals(id, motor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
