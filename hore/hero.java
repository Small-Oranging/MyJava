package hero_class;

import java.util.SimpleTimeZone;
import java.util.SplittableRandom;

public abstract class hero {
    String name;
    int blood;
    int commonAttack;
    int defense;
    int skill1;
    int skill2;
    public void commonAttack(hero player){
        System.out.println(name+"普攻造成"+commonAttack+"伤害");
    }
    public void skillOne(hero player){
        System.out.println(name+"一技能造成"+skill1+"伤害");
    }
    public void skillTwo(hero player){
        System.out.println(name+"二技能造成"+skill2+"伤害");
    }
}
