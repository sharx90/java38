//请用户输入一个正整数，计算这个数字的总和
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = input.nextInt();
        int len = 1;
        int num1;
        int sum = 0;
        while (num/len >= 10){
            len*=10;
        }
        //System.out.println(len);
        for (int i = 1; i <= len; i*=10) {
            num1 = (num/i) % 10;
            sum +=num1;
        }
        System.out.println("这个数字的和是："+ sum);
    }
}
