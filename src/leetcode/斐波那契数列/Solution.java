package leetcode.斐波那契数列;

/**
 * @Author 李韬
 * @Date 2019/3/17 16:51
 *
 * @Description
 * @Param
 * @return
 **/
public class Solution {
    public int Fibonacci(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        n = Fibonacci(n-1)+Fibonacci(n-2);
        return n;
    }
}
