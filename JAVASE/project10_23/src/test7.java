import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        /**
         *
         * 完成数据交换程序,现有一组数{13,6,75,22,11,8,5,7,1},请用户输入2个需要交换的元素位置，
         * 然后将这2个位置的元素交换，输出交换后的数组
         * */
        int a[] = {13,6,75,22,11,8,5,7,1};

        Scanner input = new Scanner(System.in);
        System.out.println("{13,6,75,22,11,8,5,7,1}\n请输入该数组中两个需要交换的元素");
        System.out.println("请输入第一个:");
        int num1 = input.nextInt();
        System.out.println("请输入第二个:");
        int num2 = input.nextInt();
        int b = -1;
        int c = -1;
        for (int i = 0; i < 9; i++) {
            if (a[i] == num1){
                b = i;
            }
            if (a[i] == num2){
                c = i;
            }
        }
        int num3;
        num3 = a[b];
        a[b] = a[c];
        a[c] = num3;
        for (int i = 0; i < 9; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
