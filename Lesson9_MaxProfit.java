class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==0)
            return 0;
        int  min=A[0];
        int mp=0;
        int p=0;
        for  (int  i=1;i<A.length;i++){
            if(A[i]<min){
                min=A[i];
            }
            else{
                p=A[i]-min;
                if(p>mp)
                    mp=p;
            }
        }

        return mp;
    }
}
