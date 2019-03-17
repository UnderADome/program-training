package 剑指offer.从头到尾打印链表;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @time 2019.3.15
 * 翻转可以用Collections类中的reverse方法
 *
 *
 * String中也有reverse方法
 * String line1 = new StringBuffer(str1).reverse().toString();
 */
public class Solution {

    public static class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (listNode == null){
            ArrayList<Integer> list = new ArrayList<Integer>();
            return list;
        }
        else if (listNode.next == null){
            result.add(listNode.val);
            return result;
        }
        else if (listNode.next != null){
            while (listNode.next != null){
                result.add(listNode.val);
                listNode = listNode.next;
            }
            result.add(listNode.val);
        }
        ArrayList<Integer> result1 = new ArrayList<Integer>();
        for (int i=0; i<result.size(); i++){
            result1.add(result.get(result.size()-i-1));
            //result1.get(result.size()-i);

        }
        return result1;
//        Collections.reverse(result);
//        return result;

    }


}
