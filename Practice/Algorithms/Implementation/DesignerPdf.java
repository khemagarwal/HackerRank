import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {

        int temp=0;
        ArrayList<Integer> charHeights=new ArrayList<Integer>();
        char[] charArray = word.toCharArray();
        for(char output : charArray) 
        {
            if(output == 'a')
            {
                charHeights.add(h[0]);
                
            }
            if(output == 'b')
            {
                charHeights.add(h[1]);
                
            }
            if(output == 'c')
            {
                charHeights.add(h[2]);
                
            }
            if(output == 'd')
            {
                charHeights.add(h[3]);
                
            }
            if(output == 'e')
            {
                charHeights.add(h[4]);
                
            }
            if(output == 'f')
            {
                charHeights.add(h[5]);
                
            }
            if(output == 'g')
            {
                charHeights.add(h[6]);
                
            }
            if(output == 'h')
            {
                charHeights.add(h[7]);
                
            }
            if(output == 'i')
            {
                charHeights.add(h[8]);
                
            }
            if(output == 'j')
            {
                charHeights.add(h[9]);
                
            }
            if(output == 'k')
            {
                charHeights.add(h[10]);
                
            }
            if(output == 'l')
            {
                charHeights.add(h[11]);
                
            }
            if(output == 'm')
            {
                charHeights.add(h[12]);
                
            }
            if(output == 'n')
            {
                charHeights.add(h[13]);
                
            }
            if(output == 'o')
            {
                charHeights.add(h[14]);
                
            }
            if(output == 'p')
            {
                charHeights.add(h[15]);
                
            }
            if(output == 'q')
            {
                charHeights.add(h[16]);
                
            }
            if(output == 'r')
            {
                charHeights.add(h[17]);
                
            }
            if(output == 's')
            {
                charHeights.add(h[18]);
                
            }
            if(output == 't')
            {
                charHeights.add(h[19]);
                
            }
            if(output == 'u')
            {
                charHeights.add(h[20]);
                
            }
            if(output == 'v')
            {
                charHeights.add(h[21]);
                
            }
            if(output == 'w')
            {
                charHeights.add(h[22]);
                
            }
            if(output == 'x')
            {
                charHeights.add(h[23]);
                
            }
            if(output == 'y')
            {
                charHeights.add(h[24]);
                
            }
            if(output == 'z')
            {
                charHeights.add(h[25]);
                
            }
        
        
        }

        Collections.sort(charHeights);

        return charArray.length*charHeights.get(charHeights.size()-1);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
