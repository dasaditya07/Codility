// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// you can also use imports, for example:
import java.util.*;
import java.lang.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack st = new Stack();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if( '('==c){
                st.push(c);
            }
            else{
                if(st.isEmpty())
                    return 0;
                char p=(char)st.pop();
                if(!(c==')' && p=='(') ){
                    return 0;
                }
            }

        }
        if(st.isEmpty())
            return 1;
        return 0;
    }
}
