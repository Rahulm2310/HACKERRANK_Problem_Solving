import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.Math;

public class Solution {

    
    static String catAndMouse(int x, int y, int z) {
        
        String s=new String("");
        
        if(Math.abs(z-x)>Math.abs(z-y))
        {
            s="Cat B";
        }
        
        else if(Math.abs(z-x)<Math.abs(z-y))
        {
            s="Cat A";
        }
        
        else
        {
            s="Mouse C";
        }


        return s;

    }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
    
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        

        for (int qItr = 0; qItr < q; qItr++) {
        
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);


            bufferedWriter.write(result);
            bufferedWriter.newLine();
            
        }

        bufferedWriter.close();


        scanner.close();
        
    }
    
}