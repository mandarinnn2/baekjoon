import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 입력받을 숫자의 수

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st2.nextToken()); // 합해서 나와야할 숫자

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int[] a = new int[N + 1];

        for(int i = 1; i <= N; i++){
            a[i] = Integer.parseInt(st3.nextToken());
        }

        int idx = 0;
        for(int i = 1; i <= N; i++){
            for(int j = i + 1; j <= N; j++){
                if(a[i] + a[j] == M){
                    ++idx;
                }
            }
        }
        System.out.println(idx);

    }
}