package leetcode.跳台阶;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author mushi
 * @Date 2019/3/1716:55
 * @Version 1.0
 **/
public class Solution {
    public int JumpFloor(int target) {
        if (target == 0)
            return 0;
        if (target == 1)
            return 1;
        if (target == 2)
            return 2;
        return JumpFloor(target-1) + JumpFloor(target-2);
    }

    public static void main (String[] args){

        long startTime = System.currentTimeMillis();


        Solution solution = new Solution();
        System.out.println(solution.JumpFloor(45));


        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }
}
