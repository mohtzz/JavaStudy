public class Square {
    Point upperLeft;
    int lengthOfSide;
    public Square(Point upperLeft, int lengthOfSide){
        this.upperLeft = upperLeft;
        this.lengthOfSide = lengthOfSide;
    }
    public Square(int x, int y, int lengthOfSide){
        this.upperLeft = new Point(x, y);
        this.lengthOfSide = lengthOfSide;
    }
    public Polyline buildSquare(){
        return new Polyline(this.upperLeft,
                new Point(this.upperLeft.x,
                        this.upperLeft.y + lengthOfSide),
                new Point(this.upperLeft.x - lengthOfSide,
                        this.upperLeft.y + lengthOfSide),
                new Point(this.upperLeft.x - lengthOfSide, this.upperLeft.y));
    }
    @Override
    public String toString() {
        return "Квадрат в точке " + upperLeft + " со стороной " + lengthOfSide;
    }
}
