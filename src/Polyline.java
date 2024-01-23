import java.util.ArrayList;

public class Polyline {

    ArrayList<Point> dots;

    public Polyline(ArrayList<Point> dots){
        this.dots = dots;
    }

    @Override
    public String toString() {
        return "Line " + dots;
    }
}
