import java.util.*;
import java.io.*;

public class PrimeNumber {
    public static int powerOfTen(int c) {
        int s = 1;
        while(c!=0) {
            s = s*10;
            c--;
        }
        return s;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(p.readLine());
        int pow = powerOfTen(n-1);
        if(n == 2) {
            System.out.println(-1);
        }
        else if(n==3) {
            System.out.println(210);
        }
        else {
            System.out.println(pow + (210-(pow%210)) );
        }
    }
}