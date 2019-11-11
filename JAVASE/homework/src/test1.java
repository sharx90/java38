//一张纸的厚度大约是0.08mm，对折多少次之后能达到珠穆朗玛峰的高度（8848.13米）？
public class test1 {
    public static void main(String[] args) {
        double depth = 0.0008;
        int i = 0;

        while (depth < 8848.13){

                depth *= 2;
                i++;
        }
        System.out.println(i);
    }
}
