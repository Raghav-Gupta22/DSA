import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int max(int a, int b)
        {
        return (a > b) ? a : b;
        }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int[][] lengths = new int[s1.length()+1][s2.length()+1];
        
        
        for (int i = 1; i < lengths.length; i++) {
            for (int j = 1; j < lengths.length; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    lengths[i][j] = lengths[i-1][j-1] + 1;
                }
                else {
                    lengths[i][j] = max(lengths[i-1][j],lengths[i][j-1]);
                }
            }
        }
        System.out.println(lengths[lengths.length-1][lengths.length-1]);
    }
}
