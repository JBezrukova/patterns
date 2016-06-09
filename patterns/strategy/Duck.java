package OOP.patterns.strategy;

import OOP.patterns.strategy.fly.FlyBehaviour;
import OOP.patterns.strategy.quak.QuackBehaviour;

/**
 * Created by ��� on 15.03.2016.
 */
public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public void flying(){
        flyBehaviour.flying();
    }

    public void swim(){
        System.out.println("I am swimming");
    }

    public void quack(){
       quackBehaviour.quack();
    }

    public abstract void display();
}
