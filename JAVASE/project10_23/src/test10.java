import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        /**
         * 输入一个已经按升序排序过的数组，再输入一个数字，
         * 在数组中查询两个数字，使得它们的和与你输出的那个数字相等，输出任意一对即可
         * */
        String[] nums = null;
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个升序排序的数组(每个数之间用空格隔开):");
        nums = input.nextLine().split(" ");//把输入的字符以空格为标准分成一个数组
        int [] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.valueOf(nums[i]);//把字符串数组装换成int数组
        }
        System.out.println("输入一个数字");
        int a = input.nextInt();
        for (int i = 1; i < nums.length; i++) {
            if (a == (num[i-1] + num[i])){
                System.out.println(num[i-1] + "+" +num[i] + "=" + a );

            }
        }

    }
}
