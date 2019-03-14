package 拼多多2018.最大乘积;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author litao
 *
 *
 * 出现过两处错误：
 * 1.数组越界，a.length-1才是数组最后一个
 * 2.这一题要用long来解决
 * 注：
 * Arrays.sort()可以直接排序
 */

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);

        long max = a[a.length-1];
        long max2 = a[a.length-2];
        long max3 = a[a.length-3];
//        System.out.println(max+" "+max2+" "+max3);

        long min = a[0];
        long min2 = a[1];
//        System.out.println(min+" "+min2);

        if (max*max2*max3 > max*min*min2){
            System.out.println(max*max2*max3);
        }else{
            System.out.println(max*min*min2);
        }
    }
}
