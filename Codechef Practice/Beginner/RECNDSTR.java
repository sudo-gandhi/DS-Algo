import java.util.*;
import java.io.*;

public class RECNDSTR {
    public static void main(String args[])throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(p.readLine());
        while(t-- != 0) {
            String s = p.readLine();
            String firstSub, lastSub;
            char firstChar, lastChar;
            firstChar = s.charAt(0);
            firstSub = s.substring(1,s.length());
            lastChar = s.charAt(s.length()-1);
            lastSub = s.substring(0,s.length()-1);
            if((firstSub+firstChar).equals(lastChar+lastSub)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
