package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    private final List<MilitaryUnit> unitlist = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        this.unitlist.add(militaryUnit);
    }

    public void damageAll(int damage) {
        Iterator<MilitaryUnit> it = unitlist.iterator();

        while (it.hasNext()) {
            MilitaryUnit unit = it.next();
            unit.setHealth(unit.getHealth() - damage);
            if (unit.getHealth() < 25) {
                it.remove();
            }
        }
    }

    public int getArmyDamage() {
        int sum = 0;
        for (MilitaryUnit unit : unitlist) {
            sum += unit.getDamage();
        }
        return sum;
    }

    public int getArmySize() {
        return unitlist.size();
    }
}
