//控制台输出三角形
public class test5 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k <5-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
