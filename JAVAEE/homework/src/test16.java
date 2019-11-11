//请用户输入一个正整数，判断这个数字里面是否包含6
import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = input.nextInt();
        int num1;
        int len = 1;
        boolean a = true;
        while (num/len >= 10){
            len*=10;
        }
        for (int i = 1; i <= len; i*=10) {
            num1 = (num/i) % 10;
           if (num1 == 6){
               a = false;
               break;
           }
        }
        if (a){
            System.out.println("这个数不含6");
        }else {
            System.out.println("这个数含有6");
        }
    }
}
