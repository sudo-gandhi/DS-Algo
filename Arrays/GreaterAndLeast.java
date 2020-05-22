import java.io.*;
import java.util.*;

public class GreaterAndLeast {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int l = (int) Math.ceil(Math.log10(n));
            int arr[] = new int[l];
            int i;
            int m = n;
            for (i = l - 1; i >= 0; i--) {
                arr[i] = m % 10;
                m = m / 10;
            }
            for (i = l - 2; i >= 0; i--) {
                if (arr[i] < arr[i + 1]) {
                    break;
                }
            }

            if (i < 0) {
                System.out.print(n);
            } else {

                int a = i + 1;
                for (int j = i + 1; j < l; j++) {
                    if ((arr[j] > arr[i]) && (arr[j] < arr[a])) {
                        a = j;
                    }
                }

                int temp = arr[i];
                arr[i] = arr[a];
                arr[a] = temp;

                Arrays.sort(arr, i+1, l);
                for (i = 0; i < l; i++) {
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
        }
    }
}