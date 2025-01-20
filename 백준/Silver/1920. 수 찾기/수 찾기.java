import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int A[];
    static int B[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        for (int i = 0; i < M; i++) {
            System.out.println(comp(B[i]));
        }
    }

    public static int comp(int a){
        int start = 0;
        int end = A.length - 1;
        boolean x = false;
        while(start <= end){
            int mid = (end + start) / 2;

            if(A[mid] > a){
                end = mid - 1;
            }else if(A[mid] < a){
                start = mid + 1;
            }else{
                x = true;
                break;
            }
        }
        
        if(x){
            return 1;
        }else{
            return 0;
        }
    }
}
