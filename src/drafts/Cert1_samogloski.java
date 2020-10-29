package drafts;

/**
 * @title liczenie samoglosek 
 *
 * @date 29 wrz 2020
 *
 * @author Lukasz Janus
 *
 */


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


class Result {

    /*
     * Complete the 'findSubstring' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String findSubstring(String s, int k) {
        
        String sub="";
        int l = s.length();
        char[] arr = new char[s.length()];
        int max = 0;

        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        
        for(int i=0;i<=l-k;i++){
            
            int tmax=0;
            
            for(int j=i;j<i+k;j++){
                
                switch (arr[j]){
                        case 'a':{
                            tmax++;
                            break;
                        }
                        case 'e':{
                            tmax++;
                            break;
                        }
                        case 'i':{
                            tmax++;
                            break;
                        }
                        case 'o':{
                            tmax++;
                            break;
                        }
                        case 'u':{
                            tmax++;
                            break;
                        }
                    }
                }
            
         //   System.out.println(i+" "+max+" "+tmax+" "+s.substring(i, i+k));

            if(max<tmax){
                    max=tmax;
                    sub=s.substring(i, i+k);
                }
                tmax=0;
            
        }
        if(sub.length()==0){
            return "Not found!";
        }
        return sub;
    }

}
public class Cert1_samogloski {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.findSubstring(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
