import java.util.Scanner;

public class test14_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = input.nextInt();
        int temp = num;
        int len = 0;
        while (temp > 0){
            temp/=10;
            len++;
        }



    }
}
