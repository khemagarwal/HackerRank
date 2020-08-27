import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class FastScanner {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer("");
    String next() {
        while (!st.hasMoreTokens())
            try {
                st=new StringTokenizer(br.readLine());
            } catch (IOException e) {}
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
    long nextLong() {
        return Long.parseLong(next());
    }
}

public class Solution {
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        PrintWriter pw=new PrintWriter(System.out);

        int size=fs.nextInt();
        int num=fs.nextInt();
        ArrayList<Integer> numbers=new ArrayList<Integer>();

        for(int i=0;i<size;i++)
        {
            numbers.add(fs.nextInt());

        }

        Collections.rotate(numbers,-num);

        for(int i=0;i<numbers.size();i++)
        {
        System.out.print(numbers.get(i) + " ");

        }

    }
}
