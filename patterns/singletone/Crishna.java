package OOP.patterns.singletone;

/**
 * Created by JuliaBezrukova on 03.06.2016.
 */
public class Crishna implements God {
    @Override
    public void create() {
        System.out.println("Create the world!!!!!!!");
    }

    @Override
    public void heal() {
        System.out.println("Think better");
    }

    @Override
    public String getName() {
        return "Crishna";
    }
}
