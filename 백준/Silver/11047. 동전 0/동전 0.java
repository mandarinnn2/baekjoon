import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int ans = 0;

        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        for(int i = N - 1; i >= 0; i--){
            if(x == 0){
                break;
            }
            if((x % A[i]) != x){
                ans += x / A[i];
                x %= A[i];
            }
        }

        System.out.println(ans);

    }
}