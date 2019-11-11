import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        /**
         * 有一组数4,5,34,2,7,6,请用户输入一个数，查找这个数在此数组中的位置
         *
         * */
        int a[] = {4,5,34,2,7,6};

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查找的数:");
        int num = input.nextInt();
        int i = 0;
        for (; i < 6; i++) {
            if (num == a[i]){
                System.out.println("这个数的下标是"+ i );
                break;
            }
        }
        if (i == 6){
            System.out.println("没有这个数");
        }

    }
}
