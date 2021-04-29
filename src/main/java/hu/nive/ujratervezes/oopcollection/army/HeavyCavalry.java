package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{

    private boolean isFirstRound = true;

    public HeavyCavalry () {
        super(150, 20, true);
    }

    public boolean getIsFirstRound() {
        return isFirstRound;
    }

    public void setIsFirstRound(boolean firstRound) {
        isFirstRound = firstRound;
    }

    public int doDamageFirstRound() {
        return doDamage() * 3;
    }


    @Override
    public int getHitPoints() {
        if (getIsFirstRound()) {
            doDamageFirstRound();
            setIsFirstRound(false);
        }
        return doDamage();
    }
}

/*
Heavy Cavalry
A nehézlovas életereje 150 pont, sebzése 20.
Páncélozott.

A lovasság a csatát rohammal indítja,
így minden lovas első támadása háromszoros sebzést okoz,
az utána következők egyszereset.
 */