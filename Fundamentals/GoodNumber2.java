import java.util.*;
import java.io.*;

public class GoodNumber2 {

    public static void main(String args[]) throws IOException {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(pp.readLine());
        while (t-- != 0) {
            Long n = Long.parseLong(pp.readLine());
            long p, k;
            p = 3;
            k = 1;
            while (k < n) {
                k += p;
                p = k * 3;
            }
            while (p != 0) {
                if (k - p >= n) {
                    k -= p;
                }
                p /= 3;
            }
            System.out.println(k);
        }
    }
}