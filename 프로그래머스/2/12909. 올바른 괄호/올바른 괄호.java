import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            stack.push(s.charAt(i));
        }

        int index = 0;
        while(!stack.isEmpty()){
            if(stack.pop() == '('){
                --index;
            }else{
                ++index;
            }
            if(index < 0){
                answer = false;
                break;
            }
        }
        if(index != 0){
            answer = false;
        }
        return answer;
    }
}