package Practice;

public class day2 {
    // Note that the size of the array is n-1
    public static int missingNumber(int n, int arr[]) {
       int xor1=0;
       int xor2=0;
       for(int i=1;i<=n;i++)
       {
    	   xor1^=i;
       }
       for(int i=0;i<arr.length;i++)
       {
    	   xor2^=arr[i];
       }
       return xor1^xor2;
    }

    public static void main(String[] args) {
        int n = 5;
        int a[] = {1, 2,4,5};  // Array of size n-1
        System.out.println(missingNumber(n, a));
    }
}
