import java.util.*;

class Solution {
    public long solution(long n) {
        String text = String.valueOf(n);
        long answer = 0;
        long arr[] = new long[text.length()];
        
        for(int i = 0; i < text.length(); i++){
            arr[i] = Integer.parseInt(text.substring(i, i + 1));
        }
        Arrays.sort(arr);
        
        String x = "";
        for(int i = text.length() - 1; i >= 0; i--){
            x += arr[i];
        }
        answer = Long.parseLong(x);
     
        return answer;
    }
}