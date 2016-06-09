package OOP.patterns.singletone;

/**
 * Created by JuliaBezrukova on 03.06.2016.
 */
public class GodExtractor implements Runnable {

    TheGod theGod;
    @Override
    public void run() {
        theGod = TheGod.getInstance();
    }
}
