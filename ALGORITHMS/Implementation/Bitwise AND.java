import java.io.*;
import java.util.*;


public class Solution
{

    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        
        
        for(int t = 0; t < T; t++)
        {
            
            int max = 0;
            int n = input.nextInt();
            int k = input.nextInt();
            
            
            if (((k-1)|k) <= n) 
                System.out.println(k-1);
            
            else
                System.out.println(k-2);
            
            
        }
        
    }
    
}
