public class Square {
    Point upperLeft;
    private int lengthOfSide;
    public Square(Point upperLeft, int lengthOfSide){
        if(lengthOfSide < 0) throw new IllegalArgumentException("length of side must be positive");
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

    public int getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(int lengthOfSide) {
        if(lengthOfSide < 0) throw new IllegalArgumentException("length of side must be positive");
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + upperLeft + " со стороной " + lengthOfSide;
    }
}
