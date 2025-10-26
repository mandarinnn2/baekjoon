class Solution {
    public long solution(long n) {
        String text = String.valueOf(n);
        
        long i = text.length();

        if(i % 2 == 0){
            i /= 2;
        }else{
            i = i / 2 + 1;
        }
        i--;
        i = Math.round(Math.pow(10, i));
        while(i * i <= n){
            if(i * i == n){
                return (i+1)*(i+1);
            }
            i++;
        }
        return -1;
    }
}