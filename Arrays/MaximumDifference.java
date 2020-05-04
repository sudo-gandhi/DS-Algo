import java.util.*;
import java.io.*;

public class MaximumDifference {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int i,j;
            for(i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            int ipmax, ipmin, immax, immin;
            ipmax = ipmin = arr[0]+0;
            immax = immin = arr[0]-0;
            for(i=1;i<n;i++) {
                int p,m;
                p = arr[i]+i;
                if(p>ipmax) {
                    ipmax = p;
                }
                if(p<ipmin) {
                    ipmin = p;
                }
                m = arr[i]-i;
                if( m > immax ) {
                    immax = m;
                }
                if(m<immin) {
                    immin = m;
                }
            }
            System.out.println((ipmax-ipmin) > (immax-immin) ? (ipmax-ipmin) :(immax-immin) );
        }
    }
}