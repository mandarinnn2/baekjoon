import java.io.*;
import java.util.*;

public class Main {
    public static int A[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());

        A = new int[N + 1];

        for(int i = 1; i < N + 1; i++){
            A[i] = i;
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int que = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 배열 연결하기
            if(que == 0){
                union(a, b);
            }
            else{ // 값 찾기
                boolean result = checkSame(a, b);
                if(result){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }

        }

    }

    public static void  union(int a, int b){
        a = find(a);
        b = find(b);
        if(a != b){
            A[b] = a;
        }

    }

    public static int find(int a){
        if(a == A[a]){
            return A[a];
        }else{
            return A[a] = find(A[a]);
        }
    }

    public static boolean checkSame(int a, int b){
        a = find(a);
        b = find(b);
        if(a == b) return true;
        return false;

    }
}