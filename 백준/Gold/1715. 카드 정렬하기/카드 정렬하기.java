import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        int a = 0;
        int b = 0;
        while(queue.size() > 1){
            a = queue.remove();
            b = queue.remove();
            sum += a + b;
            queue.add(a + b);
        }

        System.out.println(sum);
    }
}
