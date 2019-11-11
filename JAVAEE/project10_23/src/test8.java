public class test8 {
    public static void main(String[] args) {
        /**
         *
         * 有一个数组  int[] arr={123, 12, 3445,2178};
         * 请分解每一个数字后计算和，
         * 如果是偶数就输出来如： 123=1+2+3=6    6是偶数，显示123
         * */
        int[] arr = {123,12,3445,2178};
        int a ;
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            int num = arr[i];
            while (num > 0 ){
                a = num % 10;
                sum += a;
                num /= 10;
            }
            if (sum % 2 == 0){
                System.out.println(arr[i]);
            }
        }


    }
}
