public class Pistol {
    private int ammo;
    final int maxAmmo;

    public Pistol(int ammo, int maxAmmo){
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }
    public Pistol(int maxAmmo){
        this.maxAmmo = maxAmmo;
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
    public void reload(int bulletsToReload){
        if(bulletsToReload < 0) throw new IllegalArgumentException("bulletsToReload must be more than 0");
        if(ammo + bulletsToReload > maxAmmo){
            int differenceAmmo = maxAmmo - ammo;
            ammo = maxAmmo;
            System.out.println(bulletsToReload - differenceAmmo);
        }
        else ammo += bulletsToReload;
    }
    public int discharge(){
        int dischargeAmmo = ammo;
        ammo = 0;
        return dischargeAmmo;
    }
    public boolean isCharged(){
        return ammo > 0;
    }
    public int getAmmo(){
        return ammo;
    }
    public int getMaxAmmo(){
        return maxAmmo;
    }
    @Override
    public String toString() {
        return ammo + " remaining";
    }
}
