import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        /**
         * 声明一个长度为5的数组:接收用户的输入，求合
         *(1)：首先接收用户输入5个数，存在数组里
         *(2): 对这个数组里的数求和
         * */
        int a[] = new int[5];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入五个数");

        for (int i = 0; i < a.length; i++) {
            System.out.println("输入第" + (i+1) + "个数");
            int num = input.nextInt();
            a[i] = num;
            sum += a[i];
        }
        System.out.println("这五个数的和为:"+sum);
    }

}

