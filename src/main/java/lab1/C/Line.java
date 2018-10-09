package lab1.C;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Line{
    private RationalNumber k;
    private RationalNumber b;

    public Line(RationalNumber k, RationalNumber b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line line){

        RationalNumber x = line.b.subtract(this.b).divide(this.k.subtract(line.k));
        RationalNumber y = b.add(k.multiply(x));
        return new Point(x,y);
    }

    public Point intersectionOX(){
        return intersection(new Line(
                new RationalNumber(0,1),
                new RationalNumber(0,1)
        ));
    }

    public Point intersectionOY(){
        return new Point(new RationalNumber(0,1),b);
    }

    public boolean parallelCheck(Line line){
         return line.k.equals(this.k) && !line.b.equals(b);
    }

    public Set<Line> parallelLines(Set<Line> lines){
        Set<Line> result = new HashSet<Line>();
        for(Line line: lines){
            if(this.parallelCheck(line))
                result.add(line);
        }
        return result;
    }

    @Override
    public String toString() {
        return "y = " + k +"x + " + b;
    }
}
