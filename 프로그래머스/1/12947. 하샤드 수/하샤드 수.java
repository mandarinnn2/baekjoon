class Solution {
    public boolean solution(int x) {
        
        String text = String.valueOf(x);
        
        int sum = 0;
        
        for(int i = 0; i < text.length(); i++){
            sum += Integer.parseInt(text.substring(i, i + 1));
        }
        
        boolean answer = true;
        
        if(x % sum != 0){
            answer = false;
        }
        
        return answer;
    }
}