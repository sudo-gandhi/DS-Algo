import java.util.*;
import java.io.*;

public class CORUS {
    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(p.readLine().trim());
        while(t-- != 0) {
            int nq[] = new int[2];
            int i;
            i = 0;
            for(String x: p.readLine().trim().split(" ")) {
                nq[i++] = Integer.parseInt(x);
            }
            String str = p.readLine();
            HashMap<Character,Integer> hm = new HashMap<>();
            for(i=0;i<str.length();i++) {
                char c = str.charAt(i);
                if ( hm.containsKey(c)) {
                    int val = hm.get(c);
                    val++;
                    hm.put(c,val);
                }
                else {
                    hm.put(c,1);
                }
            }
            for(i=0;i<nq[1];i++) {
                int c = Integer.parseInt(p.readLine().trim());
                int q = 0;
                for(Character ch: hm.keySet()){
                    int val = hm.get(ch);
                    if(val > c) {
                        q = q+val-c;
                    }
                }
                System.out.println(q);
            }
        }
    }
}