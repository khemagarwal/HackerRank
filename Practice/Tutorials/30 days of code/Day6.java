import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int nooftc=sc.nextInt();

        sc.nextLine();
        
        for(int i=0;i<nooftc;i++)
        {
            String name=sc.nextLine();
            char[] charArray = name.toCharArray();

            for(int j=0;j<charArray.length;j++)
            {
                if(j % 2 == 0)
                {
                    System.out.print(charArray[j]);
                }


            }

            System.out.print(" ");

            
            for(int j=0;j<charArray.length;j++)
            {
                if(j % 2 != 0)
                {
                    System.out.print(charArray[j]);
                }


            }
            System.out.println();

        }
    }
}
