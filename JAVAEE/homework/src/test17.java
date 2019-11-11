//某个商店搞活动，每3个空的饮料瓶子可以换一瓶新的饮料，现在你有20个空瓶子，请按照此活动的换法，你一个可以喝到多少瓶饮料(包含你自己的20瓶饮料)
public class test17 {
    public static void main(String[] args) {
        int a = 20;//空瓶子的数量
        int b = 20;//可以喝到的数量
       // int c;//空瓶换饮料的数量
         while (a >= 3){
            b +=a/3;
            a = a/3 + a % 3;

        }
        System.out.println(b);
    }
}
