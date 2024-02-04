public class Pistol {
    int ammo;

    public Pistol(int ammo){
        this.ammo = ammo;
    }
    public Pistol(){
        this.ammo = 5;
    }
    public void shoot(){
        if(ammo == 0){
            System.out.println("Клац!");
        }
        if(ammo > 0){
            System.out.println("Бах!");
            ammo -= 1;
        }
    }
    @Override
    public String toString() {
        return ammo + " remaining";
    }
}
