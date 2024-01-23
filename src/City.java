import java.util.ArrayList;

public class City {
    String name;
    ArrayList<Road> roads;

    public City(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " /n " + roads;
    }
}
