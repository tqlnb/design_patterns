package com.tql.pattern.factory.abstractfactory1.factory;

import com.tql.pattern.factory.abstractfactory1.armor.Armor;
import com.tql.pattern.factory.abstractfactory1.armor.Chainmail;
import com.tql.pattern.factory.abstractfactory1.weapon.Sword;
import com.tql.pattern.factory.abstractfactory1.weapon.Weapon;

/*
* 骑士工厂
* */
public class KnightFactory implements Factory {
    @Override
    public Armor getArmor() {
        return new Chainmail();
    }

    @Override
    public Weapon getWeapon() {
        return new Sword();
    }
}
