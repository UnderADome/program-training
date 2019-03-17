package leetcode.用两个栈实现队列;

import java.util.Stack;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 李韬
 * @Date 2019/3/1711:29
 * @Version 1.0
 **/
public class Solution {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node){
        stack1.push(node);
    }

    public static int pop{
        //这里一定是要栈2为空的时候才能pop，不然就不是一个真正的队列。
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args){
        push(1);
        push(2);
        push(3);
        pop();
        pop();
        push(4);
        pop();
        push(5);
        pop();
        pop();
    }
}
