//控制台输出九九乘法表
public class test3 {
    public static void main(String[] args) {
        int product;

        for (int i = 1; i < 10 ; i++) {
            for (int j = 1; j <10 ; j++) {
                product = i * j ;
                if (j > i){
                    continue;
                }
                System.out.print( j+"*"+i+"="+product+"\t");
            }
            System.out.println();
        }
    }
}
