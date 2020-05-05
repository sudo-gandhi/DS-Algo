import java.io.*;
import java.util.*;

public class QualityFactory {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        for(i=0;i<n;i++) {
          arr[i] = sc.nextInt();
        }
        long sum = Math.abs(arr[0]);
        for(i=1;i<n;i++) {
          sum = sum + Math.abs(arr[i] - arr[i-1]);
        }
        System.out.println(sum);
      }
}