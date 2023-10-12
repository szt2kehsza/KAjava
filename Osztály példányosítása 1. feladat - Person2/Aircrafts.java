class Aircraft {
    private String type;
    private int maxAmmo;
    private int baseDamage;
    private int ammo;

    public Aircraft(String type, int maxAmmo, int baseDamage) {
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.ammo = 0;
    }

    public int fight() {
        int damage = ammo * baseDamage;
        ammo = 0;
        return damage;
    }

    public int refillAmmo(int ammoToFill) {
        int remainingAmmo = 0;
        if (ammoToFill > maxAmmo - ammo) {
            remainingAmmo = ammoToFill - (maxAmmo - ammo);
            ammo = maxAmmo;
        } else {
            ammo += ammoToFill;
        }
        return remainingAmmo;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + (ammo * baseDamage);
    }

    public boolean isPriority() {
        return type.equals("F35");
    }
}

public class Aircrafts {
    public static void main(String[] args) {
        Aircraft f16 = new Aircraft("F16", 8, 30);
        Aircraft f35 = new Aircraft("F35", 12, 50);

        System.out.println("F16 Status: " + f16.getStatus());
        System.out.println("F35 Status: " + f35.getStatus());

        int ammoToFill = 300;
        int remainingAmmo = f35.refillAmmo(ammoToFill);
        System.out.println("Remaining Ammo after filling F35: " + remainingAmmo);
        System.out.println("F35 Status after filling: " + f35.getStatus());

        int damage = f35.fight();
        System.out.println("Damage caused by F35: " + damage);
        System.out.println("F35 Status after the fight: " + f35.getStatus());

        System.out.println("Is F35 a priority? " + f35.isPriority());
        System.out.println("Is F16 a priority? " + f16.isPriority());
    }
}