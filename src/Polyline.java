import java.util.ArrayList;

public class Polyline {
    Point start;
    Point end;
    ArrayList<Point> dots = new ArrayList<>();

    public Polyline(Point...dots){
        for(int i = 0; i < dots.length; i++){
            this.dots.add(dots[i]);
        }
    }

    public Polyline() {}
    public void addPoint(Point p){
        this.dots.add(p);
    }
    public int getLength(){
        int length = 0;
        for(int i = 0; i < this.dots.size() - 1; i++){
            if(this.dots.get(i+1).x - this.dots.get(i).x < 0){
                length = length + ((this.dots.get(i+1).x - this.dots.get(i).x) * -1);
            }
            else if(this.dots.get(i+1).x - this.dots.get(i).x > 0){
                length = length + (this.dots.get(i+1).x - this.dots.get(i).x);
            }
            if(this.dots.get(i+1).y - this.dots.get(i).y < 0){
                length = length + ((this.dots.get(i+1).y - this.dots.get(i).y) * -1);
            }
            else if(this.dots.get(i+1).y - this.dots.get(i).y > 0){
                length = length + (this.dots.get(i+1).y - this.dots.get(i).y);
            }
        }
        return length;
    }

    @Override
    public String toString() {
        return "Line " + dots;
    }
}
