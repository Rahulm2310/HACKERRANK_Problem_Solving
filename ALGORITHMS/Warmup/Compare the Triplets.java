import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
        List<Integer> c = new ArrayList<Integer>(3);
        
           int counta=0;
           int countb=0;
        
            if(a.get(0)>b.get(0))
            {
                counta++;
            }
        
            else if(a.get(0)<b.get(0)){
                
                countb++;
            }

        
            if(a.get(1)>b.get(1))
            {
                counta++;
            }
        
            else if(a.get(1)<b.get(1))
            {
                
                countb++;
                
            }

            if(a.get(2)>b.get(2))
            {
                counta++;
            }
        
            else if(a.get(2)<b.get(2))
            {
                countb++;
            }
        
            c.add(counta);
            c.add(countb);
        
        
            return c;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        

        List<Integer> result = compareTriplets(a, b);

        
        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
