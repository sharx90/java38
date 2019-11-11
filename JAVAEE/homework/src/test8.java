//1/2,2/3,3/5,5/8,8/13,13/21,寻找规律，在控制台输出前20项
public class test8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int i = 0;
        int c;

        do {
            System.out.print(a + "/" + b + " ");
            c = a;
            a = b;
            b = a + c;
            i++;
        }while (i<20);

    }
}
