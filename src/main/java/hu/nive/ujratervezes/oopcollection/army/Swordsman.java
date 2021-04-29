package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean isFirstRound = true;

    public Swordsman(boolean isShielded) {
        super(100, 10, isShielded);
    }

    public boolean isFirstRound() {
        return isFirstRound;
    }

    public void setFirstRound(boolean firstRound) {
        isFirstRound = firstRound;
    }

    @Override
    public void sufferDamage(int damage) {
        if (isFirstRound()) {
            setFirstRound(false);
        } else {
            if (isArmoured()) {
                setHealth(getHealth() - (damage / 2));
            } else {
                setHealth(getHealth() - damage);
            }
        }
    }

}