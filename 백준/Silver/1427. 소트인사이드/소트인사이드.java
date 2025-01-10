import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int len = N.length();
        int A[] = new int[len];

        for(int i = 0; i < len; i++){
            A[i] = Integer.parseInt(N.charAt(i)+"");
        }

        for(int i = 0; i < len - 1; i++){
            int max = A[i];
            int num = i;
            for(int j = i + 1; j < len; j++){
                if(A[j] > max){
                    max = A[j];
                    num = j;
                }
            }
            if(i < num){
                int idx = A[i];
                A[i] = A[num];
                A[num] = idx;    
            }
        }

        for(int i = 0; i < len; i++){
            System.out.print(A[i]);
        }
    }
}