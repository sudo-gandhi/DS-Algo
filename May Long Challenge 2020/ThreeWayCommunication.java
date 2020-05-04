import java.util.*;
import java.io.*;

public class ThreeWayCommunication{
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {

        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        String tt = p.readLine();
        int t = 0;
        if(tt != null) {
            t = Integer.parseInt(tt);
        }
        while(t-- != 0) {

            int r = Integer.parseInt(p.readLine());
            int xy1[] = new int[2];
            int xy2[] = new int[2];
            int xy3[] = new int[2];
            int i = 0;
            for(String x: p.readLine().trim().split(" ")) {
                xy1[i++] = Integer.parseInt(x);
            }
            i = 0;
            for(String x: p.readLine().trim().split(" ")) {
                xy2[i++] = Integer.parseInt(x);
            }
            i = 0;
            for(String x: p.readLine().trim().split(" ")) {
                xy3[i++] = Integer.parseInt(x);
            }
            double d12 = euclideanDistance(xy1[0],xy1[1],xy2[0],xy2[1]);
            double d23 = euclideanDistance(xy3[0],xy3[1],xy2[0],xy2[1]);
            double d31 = euclideanDistance(xy1[0],xy1[1],xy3[0],xy3[1]);
            int c = 0;
            if(d12<=r) {
                c++;
            }
            if(d23<=r) {
                c++;
            }if(d31<=r) {
                c++;
            }
            if(c>=2) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}