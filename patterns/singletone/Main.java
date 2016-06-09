package OOP.patterns.singletone;

/**
 * Created by JuliaBezrukova on 03.06.2016.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        TheGod god1;
        TheGod god2;
        int i = 0;
        do {

            GodExtractor godExtractor1 = new GodExtractor();
            GodExtractor godExtractor2 = new GodExtractor();

            Thread thread1 = new Thread(godExtractor1);
            Thread thread2 = new Thread(godExtractor2);

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();
            god1 = godExtractor1.theGod;
            god2 = godExtractor2.theGod;
            i++;
           // TheGod.clear();
        } while (god1 == god2);

        System.out.println("Attempts: "+i);
    }

    private static void lazyExample() throws InterruptedException {
        System.out.println("many time...");
        TheGod.prophet();

        Thread.sleep(3000);
        God theGod1 = TheGod.getInstance();
        God theGod2 = TheGod.getInstance();
    }

    private static void commonRelifionQuestions() {
        God theGod = TheGod.getInstance();
        Believer.god = theGod;
        Believer ivan = new Believer();
        ivan.name = "Ivan";

        Believer petro = new Believer();
        petro.name = "Petro";

        System.out.println(ivan);
        System.out.println(petro);
    }
}
