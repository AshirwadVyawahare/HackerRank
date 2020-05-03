import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int fine = 0;

        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int M = sc.nextInt();
        int Y = sc.nextInt();
        
        int D1 = sc.nextInt();
        int M1 = sc.nextInt();
        int Y1 = sc.nextInt();

        if(Y1>Y){
            fine = 0;
        }else{

            if(Y1<Y){
                fine = 10000;
            }else if(M1<M){
                fine = 500*(M-M1);
            }else if(D1<D){
                fine = 15*(D-D1);
            }
        }
    
        // System.out.println("D: "+D+" M: "+M+" Y: "+Y);
        // System.out.println("D: "+D1+" M: "+M1+" Y: "+Y1);
        System.out.println(fine);
    }
}
