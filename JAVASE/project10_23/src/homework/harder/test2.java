package homework.harder;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /**
         *给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
         *输入:
         *[1,2,3,4,5,6,7]和 k = 3
         *输出:
         *[5,6,7,1,2,3,4]
         */
        String[] nums = null;
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数组(每个数之间用空格隔开):");
        nums = input.nextLine().split(" ");//把输入的字符以空格为标准分成一个数组
        int[] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.valueOf(nums[i]);//把字符串数组装换成int数组
        }
        System.out.println("输入一个数字");
        int a = input.nextInt();
        int[] num2 =new int[num.length + a];
        for (int i = num2.length; i > 0; i--) {

        }


    }
}
