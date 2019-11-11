//专家求出了某种彩票的重奖几率,它的计算公式为7! （7！ = 7×6×5×4×3×2×1）,我们来算一算这个彩票的重奖几率到底是多少?
public class test10 {
    public static void main(String[] args) {
        double product = 1;
        for (int i = 7; i >0 ; i--) {
            product *=i;
        }
        product = 1/product * 100;
        System.out.println(product+"%");
    }
}
