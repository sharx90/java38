//判断一个正整数是否是回文数
import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = input.nextInt();
        int len = 1;
        boolean flag = true;

        while (num / len >= 10){
            len*=10;
        }//判断输入数字的位数

        while (num > 0){
            int first = num / len ;//取第一个数
            int last = num % 10;//取最后一个数
            if (first != last){
                flag = false;
                break;
            }
            num = num % len /10;//数字前后两位去掉
            len /=100;//位数减少两位
        }
        if (flag){
            System.out.println("这个数是回文数");
        }else {
            System.out.println("这个数不是回文数");
        }
    }
}
