import java.io.*;
import java.util.*;

public class ArithmeticProgression {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int diff[] = new int[100001];
        for(i=0;i<100001;i++) {
            diff[i] = -1;
        }
        for(i=0;i<n;i++) {
            int d = 0;
            int lastIndex = i;
            for(j=i+1;j<n;j++) {
                if(arr[i] == -1) {
                    break;
                }
                if((arr[j] == arr[i])) {
                    arr[j] = -1;
                    d = j - lastIndex;
                    lastIndex = j;
                }
            }
            if(arr[i] != -1) {
                diff[arr[i]] = d;
            }
            arr[i] = -1; 
        }
        for(i=1;i<100001;i++) {
            if(diff[i] > -1) {
                System.out.println(i+" "+diff[i]);
            }
        }
    }
}