import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        int[] ans = new int[a+1];

        for(int i = 1; i <= a; i++){
            ans[i] = i + ans[i-1];
        }

        int first = 1, end = 1, sum = 1, ind = 1;

        while(end != a){
            sum = ans[end] - ans[first - 1];
            if(sum < a){
                end++;
            }else if(sum > a){
                first++;
            }else{
                ind++;
                end++;
            }
        }
        System.out.println(ind);
    }
}