public class RedLight implements Runnable{
    private int red = 5;

    @Override
    public void run() {
        while (red > 0) {
            System.out.println("红灯--第" + red + "下");
            red--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
