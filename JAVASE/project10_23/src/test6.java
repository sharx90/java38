public class test6 {
    public static void main(String[] args) {
        /**
         * 现有一组数{3,12,5,6,11,8,7}请编写Java程序求租该组数的最大值和最小值.(请编写2种方法实现)
         *
         * */

        int a[] = {3,12,5,6,11,8,7};
        int max1 = a[0];
        int min1 = a[0];
        for (int i = 1; i < 7; i++) {
            if (a[i] > max1){
                max1 = a[i];
            }
            if (a[i] < min1){
                min1 = a[i];
            }
        }
        System.out.println("最大值为:" + max1 + ",最小值为:" + min1);
        for (int i = 0; i < 7; i++) {
            for (int j = i +1; j < 7; j++) {
                int b;
                if (a[i] < a[j]){
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n最大值是:"+ a[0] + ",最小值是:" +a[6]);

    }
}
