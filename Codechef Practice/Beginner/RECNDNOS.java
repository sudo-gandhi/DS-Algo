import java.util.*;
import java.io.*;

public class RECNDNOS {
    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        String tt = p.readLine().trim();
        int t = 0;
        if(tt != null) {
            t = Integer.parseInt(tt);
        }
        while(t-- != 0) {
            int n = Integer.parseInt(p.readLine().trim());
            int arr[] = new int[n];
            int i = 0;
            for(String x: p.readLine().trim().split(" ")) {
                arr[i++] = Integer.parseInt(x);
            }
            int ans[] = new int[1001];
            i = 0;
            while(i<n) {
                ans[arr[i]]++;
                if(i != n-1) {
                    if(arr[i] == arr[i+1]) {
                        i = i+2;
                    }
                    else {
                        i = i+1;
                    }
                    continue;
                }
                i++;
            }
            int res = 0;
            for(i=0;i<1001;i++) {
                if(ans[i] > ans[res]) {
                    res = i;
                }
            }
            System.out.println(res);
        }
    }
}