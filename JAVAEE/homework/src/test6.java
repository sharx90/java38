//控制台输出菱形
public class test6 {
    public static void main(String[] args) {
        for (int i = 0; i < 6 ; i++) {
            for (int j = 0; j <5-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = 0; m < 5; m++) {
            for (int n = 0; n < m+1 ; n++) {
                System.out.print(" ");
            }
            for (int p = 0; p <2 *(4-m) - 1 ; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
