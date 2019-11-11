public class test13 {
    public static void main(String[] args) {
        String[] str = {"A","B","C","D"};
        int a =0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                for (int k = 0; k < str.length; k++) {
                    for (int l = 0; l < str.length; l++) {
                        System.out.print(str[i]+str[j]+str[k]+str[l] +"\n");
                        a++;
                    }
                }
            }
        }
        System.out.println("总个数是:"+a);
    }
}
