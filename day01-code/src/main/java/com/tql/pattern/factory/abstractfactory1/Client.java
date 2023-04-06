package com.tql.pattern.factory.abstractfactory1;

import com.tql.pattern.factory.abstractfactory1.armor.Armor;
import com.tql.pattern.factory.abstractfactory1.factory.Factory;
import com.tql.pattern.factory.abstractfactory1.factory.KnightFactory;
import com.tql.pattern.factory.abstractfactory1.factory.MageFactory;
import com.tql.pattern.factory.abstractfactory1.weapon.Weapon;


/*
* 测试类
* */
public class Client {
    public static void main(String[] args) {
        Factory actor = new MageFactory();
        Armor armor = actor.getArmor();
        Weapon weapon = actor.getWeapon();

        System.out.println("武器是"+weapon.getName());
        System.out.println("防具是"+armor.getName());
    }

}
