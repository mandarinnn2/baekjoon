import java.io.*;
import java.util.*;

public class Main{
    static ArrayList<Integer> A[];
    static boolean visited[];
    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        A = new ArrayList[N + 1];
        
        for(int i = 1; i < N + 1; i++){
            A[i] = new ArrayList<>();
        }

        visited = new boolean[N + 1];

        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            A[x].add(y);
            A[y].add(x);
        }
        
        count = 0;
        DFS(1);
        
        System.out.println(count);
        
    }

    public static void DFS(int x){
        if(visited[x]){
            return;
        }
        visited[x] = true;
        for(int i : A[x]){
            if(!visited[i]){
                ++count;
                DFS(i);
            }
        }
    }
}