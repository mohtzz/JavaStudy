public class Road {
    City city;
    int price;

    public Road(City city, int price){
        this.city = city;
        this.price = price;
    }

    @Override
    public String toString() {
        return city.name + ": " + price;
    }
}
