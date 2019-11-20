public class LightRun {
    public static void main(String[] args) {
        RedLight red = new RedLight();
        YellowLight yellow = new YellowLight();
        GreenLight green = new GreenLight();

        Thread thread1 = new Thread(red);
        Thread thread2 = new Thread(yellow);
        Thread thread3 = new Thread(green);

        thread1.start();
        thread2.start();
        thread3.start();

    }

}


