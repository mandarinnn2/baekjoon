import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<Integer> A[];
    public static boolean visited[];
    public static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
            A[b].add(a);
        }

        for (int i = 1; i < N + 1; i++) {
            Collections.sort(A[i]);
        }

        DFS(V);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(V);

    }

    public static void DFS(int a) {
        if (visited[a])
            return;

        visited[a] = true;
        System.out.print(a + " ");
        for (int i : A[a]) {
            if (!visited[i])
                DFS(i);
        }

    }

    public static void BFS(int a) {
        queue = new LinkedList<Integer>();
        queue.add(a);
        visited[a] = true;
        while(!queue.isEmpty()){
            a = queue.peek();
            for(int i : A[a]){
                if(!visited[i]){
                    visited[i] =  true;
                    queue.add(i);
                }
            }
            System.out.print(queue.poll() + " ");
        }
    }
}