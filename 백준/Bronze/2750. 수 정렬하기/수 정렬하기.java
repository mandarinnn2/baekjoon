import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int A[] = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        int target;
        int j;
        for(int i = 1; i < N; i++){
            target = A[i];
             
            j = i - 1;

            while(j >= 0 && target < A[j]){
                A[j + 1] = A[j];
                --j;
            }

            A[j + 1] = target;
        }
        for(int i = 0; i < N; i++){
            System.out.println(A[i]);
        }
    }
}
