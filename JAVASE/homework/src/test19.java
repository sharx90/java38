//求1-1000之中所有带3的数,15个一行进行输出，并统计总的个数
public class test19 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i < 1000; i++) {
            int temp = i;
            int n;
            boolean flag = false;
           while (temp > 0){
               n = temp % 10;
               if (n == 3){
                    flag = true;
                    break;
               }
               temp/=10;
           }

                if (flag){
                    System.out.print(i + "\t");
                    a++;
                    if (a % 15 == 0){
                        System.out.println();//输出15个数后换行
                    }
                }
            }
            System.out.println("\n总数为:" + a);
        }

    }

