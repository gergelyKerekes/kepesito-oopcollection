package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Army {

    private List<MilitaryUnit> unitlist = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        unitlist.add(militaryUnit);
    }

    public void damageAll(int damage) {
        Iterator<MilitaryUnit> it = unitlist.iterator();

        for (MilitaryUnit unit: unitlist) {
            unit.setHealth(unit.getHealth() - 25);
            if (unit.getHealth() < 25) {
                unitlist.remove(unit);
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