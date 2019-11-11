import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = input.nextInt();
        System.out.println("请输入月份");
        int month = input.nextInt();
        System.out.println("请输入日期");
        int day = input.nextInt();
        int num = day;//总天数
            switch (month-1){
                case 11:
                    num+=30;
                case 10:
                    num+=31;
                case 9:
                    num+=30;
                case 8:
                    num+=31;
                case 7:
                    num+=31;
                case 6:
                    num+=30;
                case 5:
                    num+=31;
                case 4:
                    num+=30;
                case 3:
                    num+=31;
                case 2:
                    if ((year % 4==0)&&(year % 100 != 0)||(year%400==0)) {
                        num+=29;
                    }else {
                        num+=28;
                    }
                case 1:
                    num+=31;
                case 0:
                    break;
            }
        System.out.println(num);

        }
    }

