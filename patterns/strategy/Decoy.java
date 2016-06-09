package OOP.patterns.strategy;

import OOP.patterns.strategy.fly.Flyable;
import OOP.patterns.strategy.fly.NonFlyable;
import OOP.patterns.strategy.quak.Quack;

/**
 * Created by ��� on 15.03.2016.
 */
public class Decoy extends Duck{

    public Decoy() {
        quackBehaviour = new Quack();
        flyBehaviour = new NonFlyable();
    }

    @Override
    public void display() {
        System.out.println("decoy");
    }


    @Override
    public void swim() {
        System.out.println("can not swim");
    }
}
