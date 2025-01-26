import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A[] = new int[3];
        for(int i = 0; i < 3; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        while(A[0] != 0 & A[1] != 0 & A[2] != 0){
            if(Math.pow(A[0], 2) + Math.pow(A[1], 2) == Math.pow(A[2], 2)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }

            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < 3; i++){
                A[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(A);

        }

    }
}