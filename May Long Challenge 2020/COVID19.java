import java.util.*;
import java.io.*;

public class COVID19 {
    public static void main(String args[]) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(p.readLine());
        while(t-- != 0) {
            int n = Integer.parseInt(p.readLine());
            int arr[] = new int[n];
            int aff[] = new int[n];
            int i,j;
            i = 0;
            for(String x: p.readLine().split(" ")) {
                arr[i++] = Integer.parseInt(x);
            }
            for(i=0;i<n;i++) {
                int c = 1;
                for(j=i;j<n-1;j++) {
                    if(arr[j+1]-arr[j] <=2) {
                        c++;
                    }
                    else {
                        break;
                    }
                }

                for(j=i;j>0;j--) {
                    if(arr[j]-arr[j-1] <=2) {
                        c++;
                    }
                    else {
                        break;
                    }
                }
                aff[i] = c;
            }

            int mx,mn;
            mx = mn = aff[0];
            for(i=0;i<n;i++) {
                if(aff[i]>mx) {
                    mx = aff[i];
                }
                if(aff[i]<mn) {
                    mn = aff[i];
                }
            }
            System.out.println(mn+" "+mx);
        }
    }
}