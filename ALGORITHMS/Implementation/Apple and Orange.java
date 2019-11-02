import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    
        int applecount=0;
        int orangecount=0;
        
        for(int i=0;i<apples.length;i++)
        {
        
            apples[i]=apples[i]+a;
            
        }

         for(int j=0;j<oranges.length;j++)
        {
        
            oranges[j]=oranges[j]+b;
            
        }


        for(int l=0;l<apples.length;l++)
        {
        
            if(s<=apples[l]&&apples[l]<=t)
            {
                applecount++;
            }
            
        }
       

         for(int k=0;k<oranges.length;k++)
        {
            if(s<=oranges[k]&&oranges[k]<=t)
            {
                orangecount++;
            }
            
        }
        

    System.out.println(applecount);
    System.out.println(orangecount);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);
        

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);
        

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);
        

        int[] apples = new int[m];
        

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) 
        {
        
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
            
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++)
        {
        
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
            
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);
        

        scanner.close();
        
    }
}
