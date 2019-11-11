import java.util.Scanner;

public class test4 {

    public static void main(String[] args) {
        /**
         *请用户输入一个4-8位的数，判断这个数是否是回文数
         *
         * */
        Scanner input = new Scanner(System.in);
        int a[] = new int[8];
        System.out.println("请输入一个4-8位的数");
        int num =input.nextInt();
        int count = 0;
        int temp = num;
        while (temp > 0){
            count++;
            temp/= 10;
        }

        for (int i = 0; i < count; i++) {
            int b = num % 10;
            a[i] = b;
            num /=10;
        }
        boolean flag = true;
        for (int i = 0; i < count; i++) {
            if (a[i] != a[count- 1 - i]){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("这是一个回文数");
        }else {
            System.out.println("这不是一个回文数");
        }


    }
}
