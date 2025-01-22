import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean A[] = new boolean[M + 1];
        A[0] = A[1] = true;

        // 거꾸로 true인 경우 소수가 아님
        for(int i = 2; i <= M; i++){
            int idx = 2;
            int j = i;
            while(j * idx <= M){
                A[j*idx] = true;
                ++idx;
            }
        }

        for(int i = N; i <= M; i++){
            if(!A[i]){
                System.out.println(i);
            }
        }
    }
}