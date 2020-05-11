import java.util.*;
import java.io.*;

public class DuplicateCharacters {

    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(p.readLine());
        while (t-- != 0) {
            String s = p.readLine();
            int arr[] = new int[26];
            int i = 0;
            for (i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                arr[(int) c-'a']++;
            }
            boolean f = false;
            for (i = 0; i < 26; i++) {
                if (arr[i] > 1) {
                    f = true;
                    System.out.print((char) ('a' + i) + "=" + arr[i] + " ");
                }
            }
            if (f) {
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}