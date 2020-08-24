import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long numofS = n/s.length();
        long rest = n % s.length();


        
        
        char a[]=s.toCharArray();
        long countA=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i] == 'a')
            {
                countA++;
            }
        }

        // long num=countA*n;
        // double dem=a.length; 

        countA = numofS * countA;

        for(int i=0;i<rest;i++)
        {
            if(s.charAt(i) == 'a')
            {
                countA++;
            }
        }

        return countA;

//         double result= (num/dem);
// System.out.println(result);

//         long aa=Math.round(result);
//         return aa;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
