import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
       
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int T = input.nextInt();
        int[] widths = new int[N];
        
        
        for(int i = 0; i < N; i++)
        {
            
            widths[i] = input.nextInt();
            
        }
        
        
        for(int test = 0; test < T; test++)
        {
            
            int i = input.nextInt();
            int j = input.nextInt();
            int vehicleSize = 3; //Initialize to truck
            
            while(i <= j)
            {
                
                if(vehicleSize > widths[i])
                {
                    
                    vehicleSize = widths[i];
                    
                }
                
                i++;
                
            }
            
            System.out.println(vehicleSize);
            
            
        }
    }
}
