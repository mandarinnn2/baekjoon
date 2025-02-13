import java.io.*;
import java.util.*;

public class Main {
    // 방문 여부 확인
    public static boolean[] visited;

    // 각 노드별 연결 노드 확인
    public static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 노드와 간선 수 입력받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        // 각 노드와 연결된 노드 작성을 위해 각 ArrayList를 또 하나의 ArrayList로 초기화하기
        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        // 값을 입력받아서 각 노드와 연결되어 있는 ArrayList에 저장하기
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            A[u].add(v);
            A[v].add(u);
        }

        // DFS 메소드를 재귀형식으로 돌며 방문하지 않은 노드를 확인하여 연결 요소의 수를 구한다.
        int count = 0;
        for(int i = 1; i < N + 1; i++){
            if(!visited[i]){
                ++count;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    public static void DFS(int a){
        // 이미 방문한 경우 return
        if(visited[a])
            return;

        // 방문 여부를 true로 변경하고 해당 노드와 연결된 모든 노드를 확인한다.
        visited[a] = true;
        for(int i: A[a]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}