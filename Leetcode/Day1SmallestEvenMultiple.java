import java.util.*;
class Solution {
    public int smallestEvenMultiple(int n) {
       if(n%2!=0) {
        return n*2;      // If n is odd, the smallest even multiple is 2*n
       } 
       for(int i=n;i<n*2;i++)
       {
        if(i%2==0 && i%n==0) {
            return i;     // If n is even, the smallest even multiple is n itself, but we check for multiples of n until we find the first even one.
        }
        }
       return n*2;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 5;
        int result = s.smallestEvenMultiple(n);
        System.out.println(result); // Output: 10
    }
}