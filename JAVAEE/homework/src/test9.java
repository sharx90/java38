//循环计算1-100中的偶数的合(2,4,6,8这样的叫偶数)
public class test9 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2!=0){
                continue;
            }
            sum +=i;
        }
        System.out.println("1-100的偶数之和为"+sum);
    }
}
