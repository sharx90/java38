//你现在有9个朋友，现在都比较渴，刚好又遇到商店搞活动，每3个空的饮料瓶子可以换一瓶新的饮料，你为了节省开支，最多买几瓶就够你的朋友喝了
public class test18 {
    public static void main(String[] args) {
        int a = 0;//买饮料数量
        final int count = 9;
        while (true){
                int b = a;
                int c = a;
                while (b>=3){
                    c +=b/3;
                    b = b/3 + b%3;
                }
            if (c >= count){
                break;
            }else {
                a++;
            }
        }
        System.out.println(a);
    }
}
