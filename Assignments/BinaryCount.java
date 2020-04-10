import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int i=1,max=0;
        //Stack<Integer> biStack;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String biStr = Integer.toBinaryString(n);

        // System.out.println(biStr);

        char[] ch =biStr.toCharArray();
        for (int j=0;j<ch.length-1;j++){
            if(Character.compare(ch[j],ch[j+1])==0){
                i++;
            } else {
                max = max<i?i:max;
                i=1;
            }
        }
        max = max<i?i:max;
        System.out.println(max);

        scanner.close();
    }
}
