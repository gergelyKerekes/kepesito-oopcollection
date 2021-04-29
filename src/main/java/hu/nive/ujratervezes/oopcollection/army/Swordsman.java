package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{

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
    public int getHitPoints() {
        if (isFirstRound()) {
            setFirstRound(false);
            return 0;
        }
        return doDamage();
    }
}

/*
Swordsman
A kardforgató életereje 100 pont, sebzése 10.
Vagy van páncélja vagy nincs.

Minden kardforgatónak van pajzsa, amivel kivédi az első őt ért csapást.
A pajzs az első kapott sebzés 100%-át felfogja, majd összetörik, tovább nem használható.
 */
