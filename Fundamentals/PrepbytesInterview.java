import java.io.*;

public class PrepbytesInterview{
    public static boolean func(int a,int b, int c) {
        if((a==1) && (b==1)) {
            if(c==0) {
                return true;
            }
        }
        else {
            if(a!=1) {
                return false;
            }
        }
        return false;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(p.readLine());
        while(t-- != 0) {
            int arr[] = new int[2];
            int i = 0;
            for(String x: p.readLine().split(" ")) {
                arr[i++] = Integer.parseInt(x);
            }

        }
    }
}