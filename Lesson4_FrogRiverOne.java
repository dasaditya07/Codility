// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set s = new HashSet<>();
        int i=0;
        for(i=0;i<A.length;i++){
            s.add(A[i]);
            if(s.size()==X){
                break;
            }
        }
        if(s.size()==X)
            return i;
        else
            return -1;
    
    }
}
