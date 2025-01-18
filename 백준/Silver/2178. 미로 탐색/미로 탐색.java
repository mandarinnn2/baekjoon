import java.util.*;
import java.io.*;

public class Main {
    public static int[] xdot = { 0, 0, -1, 1 };
    public static int[] ydot = { 1, -1, 0, 0 };

    public static boolean[][] visited;
    public static int[][] A;

    public static int N;
    public static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 가로
        M = Integer.parseInt(st.nextToken()); // 세로

        visited = new boolean[N][M];
        A = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(x.substring(j, j + 1));
            }
        }

        BFS(0, 0);
        System.out.println(A[N - 1][M - 1]);

    }

    public static void BFS(int a, int b) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { a, b });
        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            visited[a][b] = true;
            for (int i = 0; i < 4; i++) {
                int x = now[0] + xdot[i];
                int y = now[1] + ydot[i];
                if (x >= 0 && y >= 0 && N > x && M > y) {
                    if (A[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;
                        queue.add(new int[] { x, y });
                    }
                }
            }
        }
    }
}
