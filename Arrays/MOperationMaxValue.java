import java.util.*;
import java.lang.*;
import java.io.*;

public class MOperationMaxValue {
    public static void main (String[] args)throws IOException {
		BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(p.readLine());
		while(t-- != 0) {
		    int nm[] = new int[2];
		    int i,j;
		    i = 0;
		    for(String x: p.readLine().split(" ")) {
		        nm[i++] = Integer.parseInt(x);
		    }
		    int arr[] = new int[nm[0]];
		    for(i =0;i<nm[1];i++) {
		        int abk[] = new int[3];
		        j = 0;
		        for(String x: p.readLine().split(" ")) {
		            abk[j++] = Integer.parseInt(x);
		        }
		        for(j=abk[0];j<=abk[1];j++) {
		            arr[j] += abk[2];
		        }
		    }
		    int max = 0;
		    for(i=0;i<nm[0];i++) {
		        if(arr[i]>max) {
		            max = arr[i];
		        }
		    }
		    System.out.println(max);
		}
	}
}