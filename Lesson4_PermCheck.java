// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B= new int[A.length];
        int N=A.length;
        for(int i=0;i<A.length;i++){
            if((A[i]<=N && A[i]>0) && B[A[i]-1] != 1){
                B[A[i]-1] = 1;

            }
            else
                return 0;
        }

        return 1;
    }
}
