import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static int[] acmTeam(String[] topic) 
    {
        int subject=0;
        int maxsubject=0;
        int teams=0;
        int arr[]=new int[2];
        for(int i=0;i<topic.length;i++)
        {
            for(int j=i+1;j<topic.length;j++)
            {  subject=0;
                for(int k=0;k<topic[0].length();k++)
                {
                    if(topic[i].charAt(k)=='1'||topic[j].charAt(k)=='1')
                    {
                        subject++;
                    }
                }
                if(maxsubject<subject)
                {
                    teams=1;
                    maxsubject=subject;
                }
               else if(maxsubject==subject)
                {
                    teams++;
                }
            }
        }
        arr[0]=maxsubject;
        arr[1]=teams;
        return arr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
