class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int s=0;
        int ms=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<0){
                s=0;
            }
            else{
                s+=A[i];
            }
            if(s>ms){
                ms=s;
            }

        }
        if (max<0){
            return max;
        }
        return ms;
    }
}
