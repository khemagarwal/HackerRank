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
        String n = scanner.nextLine();

        boolean result;

        BigInteger bigInteger=new BigInteger(n);
        result=bigInteger.isProbablePrime(1);

        if(result == true)
        {
        System.out.print("prime");

        }
        else
        {
        System.out.print("not prime");

        }


        scanner.close();
    }
}
