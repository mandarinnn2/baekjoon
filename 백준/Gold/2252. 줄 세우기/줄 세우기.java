import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 학생 수, 반복 횟수
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for(int i = 0; i < N + 1; i++){
            A.add(new ArrayList<>());
        }

        int indegree[] = new int[N + 1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken()); 
            int E = Integer.parseInt(st.nextToken()); 
            A.get(S).add(E);
            indegree[E]++; // 진입차수 배열 데이터 저장 부분
        }
        
        // 위상 정렬 실행
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now + " ");
            for(int next : A.get(now)){
                indegree[next]--;
                if(indegree[next] == 0){
                    queue.offer(next);
                }
            }

        }
    }
}