// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max=0;

        for(int i=0;i<A.length;i++){
            if(A[i]>max){
               max=A[i];
            }
        }
        
        int[] arr=new int[max];
        for(int i=0;i<A.length;i++){
            if(A[i]>0){
                arr[A[i]-1] = 1;
            }
        }

        for(int i=0;i<max;i++){
            if(arr[i] == 0){
                return i+1;
            }
        }
        return max+1;
    }
}
