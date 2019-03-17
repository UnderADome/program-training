package 剑指offer.二维数组中的查找;

public class Solution {
    public static boolean Find(int target, int[][] array){

        if (array == null)
            return false;

        if (target < array[0][0])
            return false;

        for (int i=0; i<array.length; i++){//这里横着的a.length表示行数，a[0].length表示列数


            if (array[i] != null){
                if (target == array[i][0])
                    return true;

                else if (target > array[i][0]){
                    for (int j=0; j<array[i].length; j++){
                        System.out.println(j);
                        if (array[i][j] == target){
                            return true;
                        }
                    }
                }
                else
                    return false;

            }
            else{
                continue;
            }

        }

        return false;
    }

    public static void main(String[] args){
        int[][] a = new int[][] {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}};
        System.out.println(Find(10,a));
    }


}
