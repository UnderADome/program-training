package 剑指offer.替换空格;

/**
 * @time 2019.3.15
 */
public class Solution {

    public static String replaceSpace(StringBuffer str){

        String res = str.toString();
        res = res.replaceAll(" ", "%20");

        return res;
    }


    public static void main(String[] args){
        StringBuffer str = new StringBuffer("we are happy");

        System.out.println(replaceSpace(str));
    }
}
