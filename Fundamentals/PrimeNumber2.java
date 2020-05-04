import java.util.*;
import java.io.*;

public class PrimeNumber2 {
    public static int[] powerOfTen(int c) {
        int arr[] = new int[c];
        arr[0] = 1;
        return arr;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(p.readLine());
        if(n == 2) {
            System.out.println(-1);
        }
        else if(n==3) {
            System.out.println(210);
        }
        else {
            int arr[] = powerOfTen(n);
            int div = 0;
            int i;
            for(i=0;i<n;i++) {
                if(div>210) {
                    div = div%210;
                }
                div = div*10+arr[i];
            }
            while(div>210) {
                div = div%210;
            }
            div = 210 - div;
            i = n -1;
            while(div != 0) {
                arr[i--] = div%10;
                div = div/10;
            }
            for(i = 0;i<n;i++) {
                System.out.print(arr[i]);
            }
        }
    }
}