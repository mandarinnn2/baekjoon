import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int[] ans = new int[commands[i][1] - commands[i][0] + 1];
            int k = 0;
            for(int j = 0; j < ans.length; j++){
                ans[k++] = array[j + commands[i][0] - 1];
            }
            
            Arrays.sort(ans);
            answer[i] = ans[commands[i][2] - 1];
        }
        
        return answer;
    }
}