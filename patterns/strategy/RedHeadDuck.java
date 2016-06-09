package OOP.patterns.strategy;

import OOP.patterns.strategy.fly.Flyable;
import OOP.patterns.strategy.quak.Quack;

/**
 * Created by ��� on 15.03.2016.
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new Flyable();
    }
    @Override
    public void display(){
        System.out.println("redhead duck");
    }
}
