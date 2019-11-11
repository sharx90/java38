import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        /**
         *
         * 在一个字符串中找第一个只出现过一次的字符
         * 如：输入”azbaccdeff”,显示第一个出现过一次的字符是： z
         * */

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String str = input.next();
        //str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if ( str.charAt(i)==str.charAt(j)&& i != j){
                    flag = false;
                }
            }
            if (flag){
                System.out.println(str.charAt(i));
                break;
            }
        }

    }
}
