import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square(new Point(5, 3), 23);
        Polyline p1 = sq.buildSquare();
        System.out.println(p1);
        System.out.println(p1.getLength());
        p1.dots.set(p1.dots.size() - 1, new Point(15, 25));
        System.out.println(p1);
        System.out.println(p1.getLength());
    }
}