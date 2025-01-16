import java.io.*;
import java.util.*;

public class Main {
    static boolean visited[];
    static ArrayList<Integer> A[];
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        A = new ArrayList[N + 1];
        for(int i = 1; i < N + 1; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            A[x].add(y);
            A[y].add(x);
        }

        int count = 0;
        for(int i = 1; i < N + 1; i++){
            if(!visited[i]){
                ++count;
                DFS(i);
            }
        }

        System.out.println(count);

   } 
   public static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i: A[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
   }
}
