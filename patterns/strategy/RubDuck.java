package OOP.patterns.strategy;

import OOP.patterns.strategy.fly.NonFlyable;
import OOP.patterns.strategy.quak.Squick;

/**
 * Created by ��� on 15.03.2016.
 */
public class RubDuck extends Duck {

    public RubDuck(){
        quackBehaviour = new Squick();
        flyBehaviour = new NonFlyable();
    }

    @Override
    public void display() {
        System.out.println("rubber duck");
    }

}
