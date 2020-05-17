import java.util.*;
import java.lang.*;
import java.io.*;

public class KnapSack01 {

    public static void main(String[] args) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(p.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(p.readLine());
            int w = Integer.parseInt(p.readLine());
            int i, j;
            int val[] = new int[n];
            int wt[] = new int[n];
            i = 0;
            for (String x : p.readLine().split(" ")) {
                val[i++] = Integer.parseInt(x);
            }
            i = 0;
            for (String x : p.readLine().split(" ")) {
                wt[i++] = Integer.parseInt(x);
            }
            int arr[][] = new int[n][w + 1];
            for (i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
            for (i = 0; i <= w; i++) {
                if (i >= wt[0]) {       
                    arr[0][i] = val[0];
                } else {
                    arr[0][i] = 0;
                }
            }
            for (i = 1; i < n; i++) {
                for (j = 1; j <= w; j++) {
                    if (j >= wt[i]) {
                        int a = arr[i - 1][j - wt[i]] + val[i];
                        if (arr[i - 1][j] > a) {
                            arr[i][j] = arr[i - 1][j];
                        } else {
                            arr[i][j] = a;
                        }
                    }
                    else {
                        arr[i][j] = arr[i-1][j];
                    }
                }
            }
            for (i = 0; i < n; i++) {
                for (j = 0; j <= w; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(arr[n - 1][w]);
        }
    }
}