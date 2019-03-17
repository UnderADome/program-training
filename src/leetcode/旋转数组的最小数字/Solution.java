package leetcode.旋转数组的最小数字;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * @Author 李韬
 * @Date 2019/3/17 12:11
 *
 * @Description
 * 本题的含义就是寻找数组的一个分界点，在分界点前面的数组比分界点后面的数组（值）要大。
 * 最终目的是为了找到整个数组中最小的数，而这个最小的数就是数组的分界点
 * @Param
 * @return
 **/

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
            return 0;
//        int right_index = array.length-1;
//        int left_index = 0;
//        int mid_index = (right_index + left_index)/2;
//        int right = array[right_index];
//        int left = array[left_index];
//        int mid = array[mid_index];
        int left = 0;
        int right = array.length - 1;
        int mid = -1;

        while (array[left] >= array[right]){

            /**
             * 循环里的各种交换是为了保证while中的判断
             * 能够一直进行下去。
             *
             * 例子：
             * 4 5 6 7 8 9 10 11 12 1 2 3
             * 10 11 12 1 2 3 4 5 6 7 8 9
             * 只有两种情况，mid比left大和mid比right大
             * 以此作为交换条件
             **/
            if (right - left == 1){
                mid = right;
                break;
            }
            mid = (left+right)/2;
            if (array[mid] >=array[left]){
                left = mid;
            }
            if (array[mid] <= array[right]){
                right = mid;
            }
        }
        return array[mid];


    }
}
