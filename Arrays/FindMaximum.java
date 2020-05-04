import java.io.*;
import java.util.*;

public class FindMaximum {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =  new int[n];
        int i,j;
        for(i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int max = -1;
        for(i=0;i<n;i++) {
            for(j=n-1;j>i;j--) {
                if(arr[j] > arr[i]) {
                    if((j-i) > max) {
                        max = j-i;
                    }
                    break;
                }
            }
        }
        System.out.println(max);
    }
}