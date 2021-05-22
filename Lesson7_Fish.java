// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack upst= new Stack();
        Stack dnst = new Stack();

        int t = 0;

        for(int i=0;i<A.length;i++){
            if(t == 0){
                if(B[i] == 0){
                    upst.push(A[i]);
                }
                else  if(B[i]==1){
                    dnst.push(A[i]);
                    t=1;
                }
            }
            else {
                if(B[i] == 0){
                    while(!dnst.isEmpty()){
                        int p=(int)dnst.pop();
                        if(p>A[i]){
                            dnst.push(p);
                            break;
                        }
                        else{
                            continue;
                        }
                    }
                    if(dnst.isEmpty()){
                        upst.push(A[i]);
                        t=0;
                    }
                    
                }
                else  if(B[i]==1){
                    dnst.push(A[i]);
                }
            }
            
        }
        return upst.size()+dnst.size();
    }
}
