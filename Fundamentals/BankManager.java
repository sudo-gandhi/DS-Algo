import java.util.*;
import java.io.*;

public class BankManager{
    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(p.readLine());
        while(t-- != 0) {
            int n = Integer.parseInt(p.readLine());
            int c = 0;
            while(n != 0 ) {
                int x = 2;
                while(x < (n/2)) {
                    if(n%x == 0) {
                        break;
                    }
                    x++;
                }
                if(x<(n/2)) {
                    n = n/x;
                    c = c + x;
                }
                else {
                    c = c+n;
                    n = 0;
                }
            }
            System.out.println(c);
        }
    }
}