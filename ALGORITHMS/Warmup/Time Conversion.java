import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

 
    static String timeConversion(String s) {
    
        
         int hh;
         
         if(s.substring(8,10).equals("AM")){
         
             if(s.substring(0,2).equals("12")){
             
                 s="00"+s.substring(2,8);
             }
             
             else{
             
                 s=s.substring(0,8);
                 
             }
         }
         
         else if(s.substring(8,10).equals("PM"))
         {

              if(s.substring(0,2).equals("12"))
              {
                 s=s.substring(0,8);
              }
              
             else
             {
                 hh=Integer.parseInt(s.substring(0,2));
                 hh=hh+12;
                 s=hh+s.substring(2,8);
             }

         }

         return s;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();


        bw.close();
    }
}
