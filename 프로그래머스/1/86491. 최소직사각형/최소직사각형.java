class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        for(int i = 0; i < sizes.length; i++){
            for(int j = 0; j < sizes[0].length; j++){
                if(sizes[i][j] > max){
                    max = sizes[i][j];
                }
            }
        }
        
        int answer = max;
        
        max = 0;
        for(int i = 0; i < sizes.length; i++){
            for(int j = 0; j < 1; j++){
                if(sizes[i][0] > sizes[i][1]){
                    if(sizes[i][1] > max){
                        max = sizes[i][1];
                    }
                }else{
                    if(sizes[i][0] > max){
                        max = sizes[i][0];
                    }
                }
            }
        }
        answer *= max;
        return answer;
    }
}