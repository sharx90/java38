package homework.harder;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        /**
         *给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，
         * 返回移除后数组的新长度。不要使用额外的数组空间
         * 输入[0,0,1,1,1,2,2,3,3,4],
         * */
        int[] num1 = {0,0,1,1,1,2,2,3,3,4};
        List list = new ArrayList();
        for (int i = 0; i < num1.length; i++) {
            list.add(num1[i]);
        }
        for (int i = 1; i < num1.length; i++) {
            if (list.get(i) ==list.get(i-1)){
                list.remove(list.get(i));
            }
        }
        int a = num1.length;
        for (int i = 1; i < num1.length; i++) {
            if (num1[i-1] == num1[i]){
                a--;
            }
        }
        int[] num2 = new int[a];
        for (int i = 0; i < a; i++) {
          list.get(i);
        }

    }
}
