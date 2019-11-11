//猜数游戏，随机生成一个0-9的数,请用户猜，给出相应提示(太大，太小，相等)，没有猜中继续猜，猜到为止.
import java.util.Random;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Random ra = new Random();
        int i = ra.nextInt(11);//随机生成一个0-10的数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个0-10的整数");
        while (true) {
            int a = input.nextInt();
            if (a < i) {
                System.out.println("太小");
            } else if (a > i) {
                System.out.println("太大");
            } else {
                System.out.println("恭喜你答对了！");
                break;
            }
        }
    }
}
