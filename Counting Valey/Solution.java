import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int cnt=0,step=0;
        boolean b=false;
        char[] ch = s.toCharArray(); 

        // System.out.println(s);
        for (char c:ch){
            if(Character.compare(c, 'D') == 0){
                step-=1;
                if(step == -1){
                    cnt++;
                }
                //System.out.println("inside down: "+step);
            }
            if(Character.compare(c, 'U') == 0){
                step+=1;
                System.out.println("inside up: "+step);
            }
        }

        return cnt;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));