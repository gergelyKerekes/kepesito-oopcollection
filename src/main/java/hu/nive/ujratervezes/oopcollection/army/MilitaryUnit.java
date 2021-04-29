package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int health;
    private final int damage;
    private final boolean isArmoured;

    protected MilitaryUnit(int health, int damage, boolean isArmoured) {
        this.health = health;
        this.damage = damage;
        this.isArmoured = isArmoured;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isArmoured() {
        return isArmoured;
    }

    public int getHitPoints() {
        return getHealth();
    }

    public int doDamage() {
        return this.damage;
    }

    public void sufferDamage(int damage) {
        if (this.isArmoured) {
            this.health -= (damage / 2);
        }
        this.health -= damage;
    }
}
