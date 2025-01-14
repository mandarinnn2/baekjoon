import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 완료까지 소요 시간을 저장하는 큐
        Queue<Integer> queue = new LinkedList<>();
        
        // 정답을 저장하는 큐
        Queue<Integer> ans = new LinkedList<>();
    
        // 소요 시간을 계산해 큐에 저장하기
        for(int i = 0; i < speeds.length; i++){
            if((100 - progresses[i]) % speeds[i] > 0){
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }else{
                queue.add((100 - progresses[i]) / speeds[i]);
            }
            // System.out.println(queue.poll());
        }
        
        // 소요 시간을 기준으로 함꼐 배포하는 결과를 정답 큐에 저장하기
        while(!queue.isEmpty()){
            int index = 0;
            int a = queue.poll();
            ++index;
            
            int x = queue.size();
            for(int i = 0; i < x; i++){
                if(a >= queue.peek()){
                    queue.poll();
                    ++index;
                }else{
                    break;
                }
            }
            
            ans.add(index);
        }
                       
        
        int[] answer = new int[ans.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = ans.poll();
        }
        return answer;
    }
}