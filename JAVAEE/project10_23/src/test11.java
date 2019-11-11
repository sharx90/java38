public class test11 {
    public static void main(String[] args) {
        int[][] a = new int[1000][2];
        for (int i = 0; i < 1000; i++) {
            a[i][0] = (int) (1000*Math.random()-500);
        }
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (a[i][0] == a[j][0] && i !=j){
                    a[i][1]++;
                    a[j][1] = 0;
                }
            }
        }
        for (int i = 0; i < 1000; i++) {
            System.out.print(a[i][0] + ",");
            System.out.print(a[i][1] +"\n");
        }


    }
}
