package OOP.patterns.strategy;

import OOP.patterns.strategy.fly.Flyable;
import OOP.patterns.strategy.quak.Quack;


/**
 * Created by ��� on 15.03.2016.
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new Flyable();
    }
    @Override
    public void display(){
        System.out.println("mullard duck");
    }

}
