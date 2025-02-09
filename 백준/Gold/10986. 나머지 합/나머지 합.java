import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long A[] = new long[N];
        long B[] = new long[M];
        long x = 0;
        long answer = 0;
        for (int i = 0; i < N; i++) {
            x += Integer.parseInt(st.nextToken());
            A[i] = (int)(x % M);
            if(A[i] == 0) ++answer;
        }

        for(int i = 0; i < N; i++){
            ++B[(int)(A[i])];
        }

        for(int i = 0; i < M; i++){
            if(B[i] >= 2){
                answer += B[i] * (B[i] - 1) / 2;
            }
        }
        
        System.out.println(answer);

    }
}