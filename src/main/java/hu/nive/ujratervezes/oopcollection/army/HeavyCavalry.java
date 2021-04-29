package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean isFirstRound = true;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    public boolean getIsFirstRound() {
        return isFirstRound;
    }

    public void setIsFirstRound(boolean firstRound) {
        isFirstRound = firstRound;
    }

    @Override
    public int getHitPoints() {
        if (getIsFirstRound()) {
            setIsFirstRound(false);
            return doDamage() * 3;
        }
        return doDamage();
    }
}