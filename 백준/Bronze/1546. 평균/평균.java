import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int[] arr = new int[N];
        float result = 0;
        float max = 0;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 0; i < N; i++){
            result += arr[i]/max * 100;
        }

        System.out.println((double)(result) / (double)(N));
    }
}