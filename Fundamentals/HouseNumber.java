import java.util.*;
import java.io.*;

public class HouseNumber {
    public static int countDigits(int n) {
        int c = 0;
        while(n!=0) {
            c++;
            n = n/10;
        }
        return c;
    }

    public static long power(int n,int p) {
        long s = 1;
        while(p != 0) {
            s = s*n;
            p--;
        }
        return s;
    }

    public static long getSum(int count) {
        long sum = 0;
        long c = 1;
        for(int i = 1;i<count; i++) {
            sum = sum + i*c;
            c = c*10;
        }
        return sum*9;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(p.readLine());
        while(t-- != 0) {
            int n = Integer.parseInt(p.readLine());
            int count = countDigits(n);
            long ans = ((n-(power(10,count-1)-1))*count)+getSum(count);
            System.out.println(ans);
        }

    }
}