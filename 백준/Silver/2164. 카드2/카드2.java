import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            queue.add(i+1);
        }
        int a = 0;
        while(queue.size() >= 2){
            queue.poll();
            a = queue.poll();
            queue.add(a);
        }
        System.out.println(queue.poll());

    }
}