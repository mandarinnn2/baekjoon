import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int A[][] = new int[N + 1][N + 1];

        for(int i = 1; i < N + 1; i++){
            for(int j = 1; j < N + 1; j++){
                if(i == j) A[i][j] = 0;
                else A[i][j] = 10000001;
            }
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(A[a][b] > c) A[a][b] = c;
        }

        for(int k = 1; k < N + 1; k++){
            for(int i = 1; i < N + 1; i++){
                for(int j = 1; j < N + 1; j++){
                    if(A[i][j] > A[i][k] + A[k][j])
                    A[i][j] = A[i][k] + A[k][j];
                }
            }
        }

        for(int i = 1; i < N + 1; i++){
            for(int j = 1; j < N + 1; j++){
                if(A[i][j] == 10000001) System.out.print(0 + " ");
                else System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}