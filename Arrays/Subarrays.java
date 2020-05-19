public class Subarrays {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = 10;
        int i,j,k;
        for(i=0;i<n;i++) {
            for(j=1;(i+j)<=n;j++) {
                for(k=i;k<i+j;k++) {
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }    
}