import java.util.*;
import java.io.*;

public class FriendsAge {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int age[] = new int[n];
        int i,j;
        int freq[] = new int[121];
        for(i = 0;i<n;i++) {
            age[i] = sc.nextInt();
            freq[age[i]]++;
        }
        int c = 0;
        boolean arr[][] = new boolean[121][121];
        for(i=0;i<121;i++) {
            for(j=0;j<121;j++) {
                    if(!((j<=(0.5*i+7)) || ((j>100) && (i<100)) || (j>i))) {
                        arr[i][j] = true;
                    }
            }
        }
        for(i=0;i<n;i++) {
            for(j=1;j<121;j++) {
                if((arr[age[i]][j] == true)) {
                  if(j == age[i]) {
                    c = c+freq[j]-1;
                  }
                  else {
                    c = c+freq[j];
                  }
                }
            }
        }
        System.out.println(c);
    }
}