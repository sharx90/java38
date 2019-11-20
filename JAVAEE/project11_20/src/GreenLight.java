public class GreenLight implements Runnable{
    private int green = 8;

    @Override
    public void run() {
        while (green > 0) {
            System.out.println("绿灯--第" + green + "下");
            green--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
