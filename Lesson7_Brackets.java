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
            if( "{([".indexOf(c) > -1){
                st.push(c);
            }
            else if( "}])".indexOf(c) > -1){
                if(st.isEmpty())
                    return 0;
                char p=(char)st.pop();
                if(!((c=='}' && p=='{') ||  (c==')' && p=='(') || (c==']' && p=='['))){
                    return 0;
                }
            }
            else return 0;

        }
        if(st.isEmpty())
            return 1;
        return 0;
    }
}
