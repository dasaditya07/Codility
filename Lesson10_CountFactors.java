// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
    int count=1;
        List<Integer> l= new ArrayList<>();
        int c=0;
        while(N%2==0){
            c++;
            N/=2;
        }
        l.add(c);

        for (int i = 3; i <= Math.sqrt(N); i+= 2)
        {
            // While i divides n, print i and divide n
            int r=0;
            while (N%i == 0)
            {
                r++;
                N /= i;
            }
            if(r!=0)
                l.add(r);
        }
        if(N>2)
            l.add(1);

        for(int i=0;i<l.size();i++){
            count=count*(l.get(i)+1);
        }
        return count;
    }
    
}
