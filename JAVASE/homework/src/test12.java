//先询问用户需要输入多少个数，之后请用户循环输入这些数，求之中的最大数，和这些数的平均值.
import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请问你输入几个数？");
        int i = input.nextInt();
        int[] a = new int[i];//数组
        double sum = 0;
        int max = a[0];

        for (int j = 0; j < i; j++) {
            System.out.println("请输入第"+(j+1)+"个数");
            a[j]=input.nextInt();
            sum = sum + a[j];
            if (a[j] > max){
                max = a[j];
            }
        }
        System.out.println("最大数为："+ max + "平均数为："+ (sum/i));
    }
}
