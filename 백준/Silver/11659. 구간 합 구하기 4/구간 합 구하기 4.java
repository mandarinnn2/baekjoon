import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[N];
        
        for(int i = 0; i < N; i++){
            if(i == 0){
                ans[i] = arr[i];
            }else{
                ans[i] = arr[i] + ans[i-1];
            }
        }

        for(int i = 0; i < M; i++){
            int A = sc.nextInt() - 1;
            int B = sc.nextInt() - 1;
            int result = 0;
            if(A==0){
                result = ans[B];
            }else{
                result = ans[B] - ans[A-1];
            }
            System.out.println(result);
        }
    }
}
