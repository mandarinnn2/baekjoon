import java.io.*;
import java.util.*;
import java.lang.StringBuffer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 값 입력받기
        String x = br.readLine();
        int N = Integer.parseInt(x);

        while(true){
            if(isPrime(N) & isPalindrome(N)){
                System.out.println(N);
                break;
            }
            N++;
        }
    }

    public static boolean isPrime(int n){
        if(n == 1)
            return false;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(int n){
        String N = String.valueOf(n);
        StringBuilder sb = new StringBuilder(N);
        String rev = sb.reverse().toString(); // 입력 받은 문자열 뒤집기

        if((n+"").equals(rev)){
            return true;
        }
        return false;
    }
}