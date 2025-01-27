import java.io.*;
import java.util.*;

public class Main{
    static boolean visited[];
    static ArrayList<Integer> A[];
    static int check[];
    static boolean IsEven;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            A = new ArrayList[V + 1];
            visited = new boolean[V + 1];
            check = new int[V + 1];
            IsEven = true;

            for(int j = 1; j < V + 1; j++){
                A[j] = new ArrayList<Integer>();
            }

            for(int j = 0; j < E; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                A[x].add(y);
                A[y].add(x);
            }
            
            for(int j = 1; j < V + 1; j++){
                if(IsEven){
                    DFS(j);
                }else{
                    break;
                }
            }

            if(IsEven){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
    }

    public static void DFS(int x){
        visited[x] = true;
        for(int i : A[x]){
            if(!visited[i]){
                check[i] = (check[x] + 1) % 2;
                DFS(i);

            }else if(check[x] == check[i]){
                IsEven = false;
            }

        }
    }   
}