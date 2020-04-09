import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str,even="",odd="";
        int i=0;
        Scanner scan = new Scanner(System.in);

        // Scanner sc = new Scanner(System.in);
        int T = scan.nextInt();
        str = scan.nextLine();
        for (int j = 0; j < T; j++) {
            str = scan.nextLine();
            // System.out.println("new string: "+str);
            char[] ch = str.toCharArray();

            for(char c:ch){
                if(i%2==0){
                    even=even+Character.toString(c);
                    i++;
                }else{
                    odd=odd+Character.toString(c);
                    i++;
                }
            }

            System.out.println(even+" "+odd);  
            
            even="";
            odd="";  ;
            i=0;
        }
        scan.close();

    }
}
