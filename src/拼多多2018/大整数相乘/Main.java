package 拼多多2018.大整数相乘;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String line1 = new StringBuffer(str1).reverse().toString();
        String line2 = new StringBuffer(str2).reverse().toString();
        String inside = "";
        String outside = "";
        int inside_shiwei = 0;
        int outside_shiwei = 0;
        int inside_gewei = 0;
        int outside_gewei = 0;
        for (int i=0; i<line1.length(); i++){
            inside = "";
            for(int j=0; j<line2.length(); j++){

                int a = Integer.valueOf(line1.charAt(i) - '0').intValue();

                int aa = a * Integer.valueOf(line2.charAt(j) - '0').intValue() + inside_shiwei;
                //System.out.println(a+" "+aa);
                inside_gewei = aa%10;
                inside_shiwei = aa/10;
                //System.out.println(inside_shiwei+" "+inside_gewei);
                inside = inside + inside_gewei;

            }
//            System.out.println(inside);
//            System.out.println("*****");
            outside_gewei = outside_gewei + inside.charAt(i);

        }

    }
}
