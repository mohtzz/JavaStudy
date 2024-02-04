import java.util.ArrayList;
import java.util.Collections;

public class City {
    String name;
    ArrayList<Road> roads = new ArrayList<>();

    public City(String name){
        this.name = name;
    }
    public City(String name, Road...roads){
        this.name = name;
        for(int i = 0; i < roads.length; i++){
            this.roads.add(roads[i]);
        }
    }
    @Override
    public String toString() {
        return name + " \n " + roads;
    }
}
