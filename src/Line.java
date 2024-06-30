public class Line {
    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint){
        this.startPoint = new Point(startPoint.x, startPoint.y);
        this.endPoint = new Point(endPoint.x, endPoint.y);
    }
    public Line(int x1, int y1, int x2, int y2){
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }
    public int getLength(){
        return (this.endPoint.x - this.startPoint.x) + (this.endPoint.y - this.startPoint.y);
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return startPoint.x + " " + startPoint.y + "; " + endPoint.x + " " + endPoint.y;
    }
}
