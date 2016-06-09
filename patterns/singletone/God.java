package OOP.patterns.singletone;

/**
 * Created by JuliaBezrukova on 03.06.2016.
 */
public interface God {

    void create();

    void heal();

    String getName();

    default void resurect() {
        System.out.println("Resurected");
    }
}
