class Solution {
    public int solution(int n) {
        
        int answer = 0;
        if(n == 0 || n == 1){
            return n;
        }
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0 && i <= (n / i)){
                answer += i;
                System.out.print(i + " ");
                if(i != (n / i)){
                    answer += (n / i);
                    System.out.print(n / i + " ");
                }
            }
        }
        return answer;
    }
}