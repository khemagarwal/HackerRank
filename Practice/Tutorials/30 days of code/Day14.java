import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

Difference(int[] elements)
{
    this.elements=elements;

}
void computeDifference()
{
    ArrayList<Integer> yo = new ArrayList<Integer>();
    for(int i=0;i<elements.length;i++)
    {
        for(int j=i+1;j<elements.length;j++)
    {
        yo.add(Math.abs(elements[i]-elements[j]));
        
    }
    }
    Collections.sort(yo);
    this.maximumDifference=yo.get(yo.size()-1);
}
	// Add your code here

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
