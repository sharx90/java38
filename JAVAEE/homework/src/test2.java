//打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
public class test2 {
    public static void main(String[] args) {
        int i = 100;
        int a,b,c;

        while (i < 1000){

            a = (i / 1)   % 10;
            b = (i / 10)  % 10;
            c = (i / 100) % 10;
            if( i == (a*a*a + b*b*b + c*c*c)){
                System.out.println(i);
            }
            i++;
        }
    }
}
