import java.io.*;
import java.util.*;

public class UniqueArray {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
          int n = sc.nextInt();
          int arr[] = new int[n];
          int i;
          for(i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
          }
          int max = 0;
          int l = 0;
          boolean[] flag = new boolean[n];
          for(i=0;i<n;i++) {
            if(!flag[i]) {
              l = 0;
              int hash[] = new int[n];
              while(true) {
                if(hash[arr[i]] == 1) {
                  break;
                }
                else {
                  flag[i] = true;
                  hash[arr[i]]++;
                  l++;
                  i = arr[i];
                }
              }
              if(l>max) {
                max = l;
              }
            }
          }
          System.out.println(max);
        }
      }
}