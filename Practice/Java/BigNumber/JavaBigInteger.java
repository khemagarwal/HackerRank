import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        
        BigInteger bigA=new BigInteger(a);
        BigInteger bigB=new BigInteger(b);
        BigInteger resultPlus;
        BigInteger resultMul;

        resultPlus=bigA.add(bigB);
        resultMul=bigA.multiply(bigB);

        System.out.println(resultPlus);
        System.out.print(resultMul);

    }
}
