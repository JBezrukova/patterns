package OOP.patterns.strategy.fly;

/**
 * Created by ��� on 15.03.2016.
 */
public class NonFlyable implements FlyBehaviour {
    @Override
    public void flying() {
        System.out.println("I can not fly");
    }
}
