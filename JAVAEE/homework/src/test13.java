//判断一个整数是否是一个素(质)数
import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = input.nextInt();
        boolean a = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                a = false;
                break;
            }
        }
        if (a){
            System.out.println("这是一个素数");
        }else {
            System.out.println("这不是一个素数");
        }
    }
}

