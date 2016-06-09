package OOP.patterns.strategy.quak;

/**
 * Created by ��� on 15.03.2016.
 */
public class Squick implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squick!!");
    }
}
