public class House {
    final int floorCount;

    public House(int floorCount){
        if(floorCount < 0) throw new IllegalArgumentException("floorCount must be positive");
        this.floorCount = floorCount;
    }

    @Override
    public String toString() {
        if(floorCount % 10 == 1 && floorCount != 11) return "Дом с " + floorCount + " этажом";
        else return "Дом с " + floorCount + " этажами";
    }
}
