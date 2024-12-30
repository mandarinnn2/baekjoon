import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()); // 예제의 첫번째 수를 받아온다

        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        long[] S = new long[suNo + 1];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 1; i <= suNo; i++){
            S[i] = S[i-1]+ Integer.parseInt(st2.nextToken());
        }

        for(int i = 1; i <= quizNo; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st3.nextToken());
            int b = Integer.parseInt(st3.nextToken());
            System.out.println(S[b] - S[a-1]);
        }
    }
}