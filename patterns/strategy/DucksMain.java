package OOP.patterns.strategy;

/**
 * Created by ��� on 15.03.2016.
 */
public class DucksMain {
    public static void main(String[] args) {
        Duck duck = new RubDuck();

        duck.display();
        duck.quack();
        duck.flying();

    }
}
