
class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        for(int i=(int)Math.sqrt(N);i>1;i--){
            if(N%i==0){
                return 2*(i+(N/i));
            }
        }
        return 2*(N+1);
    }
}
