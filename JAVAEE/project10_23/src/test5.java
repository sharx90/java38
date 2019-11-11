public class test5 {
    public static void main(String[] args) {
        /**
         *如下数组的数组：
         *String str[] = {"AAA","AAB","AAA","AAC","AAC","AAC","BBC","BBD","AAC","DBB","AAE","AAD"}.
         *试写一段Java程序，去除数组中相同的纪录,然后输出。
         *
         * */
        String str[] = {"AAA","AAB","AAA","AAC","AAC","AAC","BBC","BBD","AAC","DBB","AAE","AAD"};

        for (int i = 0; i < 12; i++) {
            for (int j = i + 1; j < 12; j++) {
                if (str[i] == str[j]){
                    str[j] = null;
                }
            }
        }
        for (int i = 0; i < 12; i++) {
            if (str[i] != null){
            System.out.println(str[i]);
            }
        }

    }
}
