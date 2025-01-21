import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x = br.readLine();

        Queue<String> queue = new LinkedList<>();

        String idx = "";
        for (int i = 0; i < x.length(); i++) {
            String co = x.substring(i, i + 1);
            if (co.equals("+") || co.equals("-")) {
                queue.add(idx);
                idx = "";
                queue.add(co);
            } else {
                idx += co;
            }
            if (i == x.length() - 1) {
                queue.add(idx);
            }
        }

        float ans = 0;
        int comp = 0;
        String chk = "";
        while (!queue.isEmpty()) {
            chk = queue.poll();
            if (chk.equals("-")) {
                comp += Integer.parseInt(queue.poll());
                while (!queue.isEmpty()) {
                    if (queue.peek().equals("-")) {
                        break;
                    } else if (queue.peek().equals("+")) {
                        queue.poll();
                        comp += Integer.parseInt(queue.poll());
                    }
                }
                ans -= comp;
                comp = 0;
            } else if (chk.equals("+")) {
                ans += Integer.parseInt(queue.poll());
            } else {
                ans += Integer.parseInt(chk);
            }
        }

        System.out.println(Math.round(ans));
    }
}