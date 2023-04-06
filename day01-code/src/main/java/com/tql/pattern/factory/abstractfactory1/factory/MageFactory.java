package com.tql.pattern.factory.abstractfactory1.factory;

import com.tql.pattern.factory.abstractfactory1.armor.Armor;
import com.tql.pattern.factory.abstractfactory1.armor.Robe;
import com.tql.pattern.factory.abstractfactory1.weapon.Staff;
import com.tql.pattern.factory.abstractfactory1.weapon.Weapon;

/*
* 法师工厂
* */
public class MageFactory implements Factory {
    @Override
    public Armor getArmor() {
        return new Robe();
    }

    @Override
    public Weapon getWeapon() {
        return new Staff();
    }
}
