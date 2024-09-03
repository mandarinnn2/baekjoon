import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        int N = Integer.parseInt(x);

        String y = br.readLine();
        StringTokenizer st = new StringTokenizer(y);

        int[] A = new int[N];
        int i = 0;
        while(st.hasMoreTokens()){
            A[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        String a = br.readLine();
        int M = Integer.parseInt(a);

        String q = br.readLine();
        StringTokenizer st1 = new StringTokenizer(q);

        int[] B = new int[M];
        i = 0;
        while(st1.hasMoreTokens()){
            B[i] = Integer.parseInt(st1.nextToken());
            i++;
        }

        Arrays.sort(A);

        for(i = 0; i < M; i++){
            int start = 0;
            int end = A.length - 1;
            int idx = 0;
            while(start <= end){
                int mid = (start + end) / 2;
                if(A[mid] == B[i]){
                    idx = 1;
                    break;
                }else if(B[i] < A[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            System.out.println(idx);
        }
    }
}