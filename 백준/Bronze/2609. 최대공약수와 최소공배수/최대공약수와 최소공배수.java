import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.println(GCD(N, M));
        System.out.println(LCM(N, M));

        
    }

    public static int LCM(int a, int b){
        int ans = a;
        int x = a;
        int y = b;
        while(a != b){
            if(a > b){
                b += y;
            }else if(a < b){
                a += x;
            }if(a == b){
                ans = a;
            }
        }
        return ans;
    }

    public static int GCD(int a, int b){
        if(a < b){
            int idx = a;
            a = b;
            b = idx;
        }

        int ans = a % b;

        while(ans != 0){
            a = b;
            b = ans;
            ans = a % b;
        }
        return b;
    }
}