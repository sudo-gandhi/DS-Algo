import java.util.*;
import java.io.*;

public class TableChair {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long m = sc.nextLong();
            long r1 = sc.nextLong();
            long r2 = sc.nextLong();
            long r3 = sc.nextLong();

            m = m % 4;
            m = 4 - m;
            long min = 0;
            if(m == 1) {
                min = r1;

                if(min > (r2+r3)) {
                    min = r2+r3;
                }

                if(r3*3<min) {
                    min = r3*3;
                }
            }
            else if (m == 2) {
                min = r1*2;

                if(r2 < min) {
                    min = r2;
                }

                if(r3*2 < min) {
                    min = r3*2;
                }
            }
            else if(m == 3) {
                min = r1*3;

                if((r2+r1) < min) {
                    min = r2+r1;
                }

                if(r3< min) {
                    min = r3;
                }
                
            }
            System.out.println(min);
        }
        sc.close();
    }
}