import java.io.*;
import java.util.*;

public class Subarrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int kk = sc.nextInt();
            int arr[] = new int[n];
            int i, k;
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum =0 ;
            k = 0;
            int ans = 0;
            for(i =0 ;i<n;i++) {

                while(sum < kk) {
                    if(k== n) {
                        break;
                    }
                    else {
                        sum = sum + arr[k];
                        k++;
                    }
                }
                
                if(sum < kk) {
                    break;
                }

                ans = ans + n - k + 1;
                sum = sum - arr[i];
            }

            System.out.println(ans);
        }
        sc.close();
    }
}