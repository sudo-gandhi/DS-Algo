import java.io.*;
import java.util.*;

public class SorcererSequence {
    public static void main(String args[])throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(p.readLine());
        double s;
        long res;
        while(t-- != 0) {
            long n = Long.parseLong(p.readLine());
            System.out.print(n+" ");
            while(n > 1){
                s = Math.sqrt(n);
                if(n%2 == 0) {
                    res = (long)Math.floor(s);
                }
                else {
                    res = (long)Math.floor(Math.sqrt(n)*Math.sqrt(n)*Math.sqrt(n));
                }
                System.out.print(res+" ");
                n = (long)res;
            }
            System.out.println();
        }
    }
}