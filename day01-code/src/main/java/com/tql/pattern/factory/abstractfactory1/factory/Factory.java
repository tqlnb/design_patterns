package com.tql.pattern.factory.abstractfactory1.factory;


import com.tql.pattern.factory.abstractfactory1.armor.Armor;
import com.tql.pattern.factory.abstractfactory1.weapon.Weapon;

/*
* 抽象工厂
* */
public interface Factory {
    Armor getArmor();
    Weapon getWeapon();
}
