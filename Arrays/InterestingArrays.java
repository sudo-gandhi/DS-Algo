import java.util.*;
import java.io.*;

public class InterestingArrays {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int i,j,k;
            for(i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            k = sc.nextInt();
            i=0;
            j=n-1;
            while(i<j) {
                if((arr[i]+arr[j]) == k) {
                    System.out.println(i+" "+j);
                    break;
                }
                else if((arr[i] + arr[j]) < k) {
                    i++;
                }
                else {
                    j--;
                }
            }
            if(i>=j) {
                System.out.println("no answer");
            }
        }
    }
}