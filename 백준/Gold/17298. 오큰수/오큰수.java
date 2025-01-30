import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int A[] = new int[N];
        int answer[] = new int[N];

        String[] str = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        for(int i = 0; i < N; i++){
            while(!stack.isEmpty() && A[stack.peek()] < A[i]){
                answer[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        while(!stack.empty()){
            answer[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++){
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
