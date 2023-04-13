package Seminar_4;

import Shield.BigShield;
import Weapons.Bow;

// Лучник
public class Archer extends Warrior {

    public Archer(String name, int healthPoint, Bow bow, BigShield bigShield) {
        super(name, healthPoint, bow, bigShield);
    }

    @Override
    public String toString() {
        return "Seminar_4.Archer " + super.toString();
    }

    public int shotRange(){
        return ((Bow) getWeapon()).getRange();
    }

}
