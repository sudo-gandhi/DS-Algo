import java.util.*;
import java.io.*;

public class GoodNumber {

    public static long power(long n,long c) {
        long ans = 1;
        while(c-- != 0) {
            ans  = ans * n;
        }
        return ans;
    }

    public static String toBase3(Long n) {
        String str = "";
        while (n != 0) {
            long d = n % 3;
            str = d + str;
            n = n / 3;
        }
        return str;
    }

    public static Long toBase10(String str) {
        long n = 0 ;
        int c = 0;
        for(int i = str.length()-1;i>=0;i--) {
            int nn = ((int)(str.charAt(i))-48);
            n = n+nn*power(3,c);
            c++;
        }
        return n;
    }
    public static boolean isGoodNumber(Long n) {
        boolean flag = true;
        if(toBase3(n).indexOf('2')>=0) {
            flag = false;
        }
        return flag;
    }

    public static Long generateGoodNumber(Long n) {
        String str = toBase3(n);
        int len = str.length();
        String str1 = "";
        long carry = 0;
        do {
            int i;
            i = len-1;
            while(str.charAt(i) != '2') {
                str1 = str1+'0';
                i--;
            }

            char c = str.charAt(i);
            Long sum = ((int)c - 48) + 1 + carry;
            carry = sum/3;
            sum = sum%3;
            str1 = sum+str1;
            i--;

            while(i>=0) {
                c = str.charAt(i);
                sum = ((int)c - 48) + carry;
                carry = sum/3;
                sum = sum%3;
                str1 = sum+str1;
                i--;
            }
            if(carry > 0) {
                str1 = carry + str1;
            }
            str = str1;
            str1 = "";
        }while(str.indexOf('2')>=0);
        return toBase10(str);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(p.readLine());
        while (t-- != 0) {
            Long n = Long.parseLong(p.readLine());
            if(isGoodNumber(n)) {
                System.out.println(n);
            }
            else {
                System.out.println(generateGoodNumber(n));
            }
        }
    }
}