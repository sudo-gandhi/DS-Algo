import java.io.*;

public class FourAndSeven {

    public static long function(long n) {
        if(n == 0) {
            return 0;
        }
        else if(n < 4) {
            return -1;
        }
        else {
            long a = function(n-4);
            long b = function(n-7);
            if((a == -1) && (b != -1)) {
                return b*10+7;
            }
            else if((b==-1) && (a != -1)) {
                return a*10+4;
            }
            else if((a != -1) && (b != -1)) {
                if((b*10+7) < a*10+4) {
                    return b*10+7;
                }
                else {
                    return a*10+4;
                }
            }
            else if((a == -1) && (b == -1)) {
                return -1;
            }
            else {
                return -1;
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(p.readLine());
        int a,b;
        a = 0;
        b = 0;
        while(n > 0) {
            if(n%7 == 0) {
                a++;
                n = n-7;
            }
            else if(n%4 == 0) {
                b++;
                n = n-4;
            }
            else {
                b++;
                n = n-4;
            }
        }
        if(n<0) {
            System.out.println(-1);
        }
        else {
            for(int i = 0;i<b;i++) {
                System.out.print(4);
            }
            for(int i = 0;i<a;i++) {
                System.out.print(7);
            }
        }
    }
}