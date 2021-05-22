class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int e=0;
        int p=0;
        for (int i=0;i<A.length;i++){
            if(A[i]==0){
                e++;
            }
            else{
                p+=e;
                if(p>1000000000){
                    return -1;
                }
            }
        }
        return p;

    }
}
