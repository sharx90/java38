import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /**
         * 求一组数的最大值和平均数，这组数的长度由用户决定
         *
         * */
        Scanner input = new Scanner(System.in);
        System.out.println("请问你要输入几位数");
        int count = input.nextInt();
        int a[] = new int[count];
        System.out.println("请输入第1个数");
        a[0] = input.nextInt();
        int max = a[0];
        double sum = a[0];


        for (int i = 1; i < a.length; i++) {
            System.out.println("请输入第" + (i+1) + "个数:");
            int num = input.nextInt();
            a[i] = num;
            if (a[i] > max){
                max = a[i];
            }
            sum += a[i];
        }
        double avg = sum / count;
        System.out.println("平均数为:" + avg + ",最大数为:" + max);
    }
}
