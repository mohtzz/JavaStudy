public class Cat {
    String name;

    public Cat(String name){
        this.name = name;
    }

    public void meow(){
        System.out.println(name + ": мяу!");
    }
    public void meow(int n){
        System.out.print(name + ": " + "мяу");
        for(int i = 1; i < n; i++){
            System.out.print("-мяу");
        }
        System.out.print("!");
    }
    @Override
    public String toString() {
        return "кот: " + name;
    }
}
