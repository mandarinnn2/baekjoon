import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        String x = sc.nextLine();

        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = x.substring(i, i+1);
        }

        int result = 0;
        for(int i = 0; i < N; i++){
            result += Integer.parseInt(arr[i]);
        }
        System.out.println(result);
    }
}