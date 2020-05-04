import java.util.*;
import java.io.*;

public class Matrix {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int i,j;
        for(i = 0 ;i<m;i++) {
            for(j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(i = 0 ;i<m;i++) {
            for(j=0;j<n;j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int sum[][] = new int[m][n];
        int mul[][] = new int[m][n];

        for(i=0;i<m;i++) {
            for(j=0;j<n;j++) {
                sum[i][j] = a[i][j]+b[i][j];
            }
        }

        for(i=0;i<m;i++) {
            for(j=0;j<n;j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        for(i=0;i<m;i++) {
            for(j=0;j<n;j++) {
                mul[i][j] = 0;
                for(int k = 0;k<m;k++) {
                    mul[i][j] = mul[i][j] + a[i][k]*b[k][j];
                }
            }
        }


        for(i=0;i<m;i++) {
            for(j=0;j<n;j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}