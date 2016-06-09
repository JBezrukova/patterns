package OOP.patterns.singletone;

/**
 * Created by JuliaBezrukova on 03.06.2016.
 */
public class TheGod implements God {

    private static class Holder{
        static final TheGod instance = new TheGod();

    }
    public static TheGod getInstance(){
        return Holder.instance;
    }
/*
    private static TheGod instance;

    public static TheGod getInstance() {
        if (instance == null) {
            synchronized (TheGod.class) {
                if (instance == null) {
                    instance = new TheGod();
                }
            }
        }
        return instance;
    }
*/
    private TheGod() {
        System.out.println("God always been here!");
    }

    public static void prophet() {
        System.out.println("Jesus");
    }

    @Override
    public void create() {
        System.out.println("All the world in 7 days");
    }

    @Override
    public void heal() {
        System.out.println("Stand up and go!");
    }

    @Override
    public String getName() {
        return "The God";
    }
/*
    public static void clear() {
        instance = null;
    }*/
}
