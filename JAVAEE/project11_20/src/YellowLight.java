public class YellowLight implements Runnable{
    private int yellow = 3;

    @Override
    public void run() {
        while (yellow > 0) {
            System.out.println("黄灯--第" + yellow + "下");
            yellow--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
