import java.io.*;
import java.util.*;

public class Pairs {

    public static boolean function(int pairs[][], int m, int x, int y) {

        int i;
        for(i=0;i<m;i++) {
            if((pairs[i][0] == x) ||(pairs[i][1] == x) ||(pairs[i][0] == y) ||(pairs[i][1] == y)) {
                continue;
            }
            if(y != 0) {
                return false;
            }
            return function(pairs, m, pairs[i][0], x) || function(pairs, m, pairs[i][1], x);
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int pairs[][] = new int[m][2];
        int i = 0;

        for(i=0;i<m;i++) {
            pairs[i][0] = sc.nextInt();
            pairs[i][1] = sc.nextInt();
        }
        if(function(pairs, m, pairs[0][0], 0) || function(pairs, m, pairs[0][1], 0)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}