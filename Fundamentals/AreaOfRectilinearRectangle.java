import java.io.*;
import java.util.*;

public class AreaOfRectilinearRectangle {
  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- != 0) {
      int a, b, c, d, e, f, g, h;
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      d = sc.nextInt();
      e = sc.nextInt();
      f = sc.nextInt();
      g = sc.nextInt();
      h = sc.nextInt();

      if ((Math.max(a, e) < Math.min(c, g)) && (Math.max(b, f) < Math.min(d, h))) {
        System.out.println(Math.abs(c - a) * Math.abs(d - b) + Math.abs(g - e) * Math.abs(h - f)
            - Math.abs(Math.max(a, e) - Math.min(c, g)) * Math.abs(Math.max(b, f) - Math.min(d, h)));
      } else {
        System.out.println(Math.abs(c - a) * Math.abs(d - b) + Math.abs(g - e) * Math.abs(h - f));
      }

      // int x1,x2,y1,y2;
      // x1 = x2 = y1 = y2 = 0;
      // if((g>a) && (g<d)) {
      // if((h>b) && (h<d)) {
      // x1 = a;
      // x2 = g;
      // y1 = b;
      // y2 = h;
      // }
      // else if((f>b) && (f<d)){
      // x1 = a;
      // x2 = g;
      // y1 = f;
      // y2 = d;
      // }
      // }
      // else if((e > a) && (e<c)) {
      // if((h>b) && (h<d)) {
      // x1 = e;
      // x2 = c;
      // y1 = b;
      // y2 = h;
      // }
      // else if((f>b) && (f<d)){
      // x1 = e;
      // x2 = c;
      // y1 = f;
      // y2 = d;
      // }
      // }
      // else if ((a == e) && (c == g)) {
      // if(b == h) {
      // x1 = a;
      // x2 = c;
      // y1 = b;
      // y2 = h;
      // }
      // else if(d == f) {
      // x1 = a;
      // x2 = c;
      // y1 = d;
      // y2 = f;
      // }
      // }
      // else if((b==f) && (d == h) ) {
      // if(a == g) {
      // x1 = a;
      // x2 = g;
      // y1 = b;
      // y2 = d;
      // }
      // else if(c == e) {
      // x1 = c;
      // x2 = e;
      // y1 = b;
      // y2 = d;
      // }
      // }

      // System.out.println(Math.abs(c-a)*Math.abs(d-b) + Math.abs(g-e)*Math.abs(h-f)
      // - Math.abs(x2-x1)*Math.abs(y2-y1));
    }
  }
}