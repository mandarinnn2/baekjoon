import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A[][] = new int[N + 1][N + 1];
        int B[][] = new int[N + 1][N + 1];

        // A 배열 값 입력받기
        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 구간 합 구하기
        for(int i = 1; i < N + 1; i++){
            for(int j = 1; j < N + 1; j++){
                B[i][j] = B[i][j - 1] + B[i- 1][j] + A[i][j] - B[i- 1][j- 1];
            }
        }

        // B배열에서 값 꺼내기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = B[x2][y2] - B[x1 - 1][y2] - B[x2][y1 - 1] + B[x1 - 1][y1 - 1];
            System.out.println(result);

        }

    }
}