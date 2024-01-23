public class Line {
    Point startPoint;
    Point endPoint;

    @Override
    public String toString() {
        return startPoint.x + " " + startPoint.y + ";" + endPoint.x + " " + endPoint.y;
    }
}
