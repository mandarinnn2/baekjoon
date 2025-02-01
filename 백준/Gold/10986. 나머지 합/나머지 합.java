import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long A[] = new long[N];
        long X[] = new long[M];
        st = new StringTokenizer(br.readLine());
        A[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            A[i] = A[i - 1] + Integer.parseInt(st.nextToken());
        }

        long answer = 0;
        for (int i = 0; i < N; i++) {
            A[i] %= M;
            ++X[(int)A[i]];
            if (A[i] == 0) {
                ++answer;
            }
        }

        for (int i = 0; i < M; i++) {
            if (X[i] == 2) {
                ++answer;
            } else if (X[i] > 2) {
                answer = answer + (X[i] * (X[i] - 1)) / 2;
            }
        }

        System.out.println(answer);
    }
}