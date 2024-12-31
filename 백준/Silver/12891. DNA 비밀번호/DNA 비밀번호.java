import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int myArr[];
    static int checkArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); // 총 문자열 길이
        int P = Integer.parseInt(st.nextToken()); // 비밀번호 길이

        int Result = 0;
        checkArr = new int[4]; // 비밀번호 조건
        myArr = new int[4]; // 현재 비밀번호 조건
        char A[] = new char[S]; // 비밀번호
        checkSecret = 0; // 조건에 맞는 번호 수

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0){
                checkSecret++;   
            }
        }

        for(int i = 0; i < P; i++){ // 부분 문자열 처음 받을 때 세팅
            Add(A[i]);
        }
        
        if(checkSecret == 4) Result++;

        for(int i = P; i < S; i++){
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) Result++;
        }
        System.out.println(Result);
        br.close();
    }

    private static void Add(char c){
        switch(c){
        case 'A':
            myArr[0]++;
            if(myArr[0] == checkArr[0]) checkSecret++;
            break;
        case 'C':
            myArr[1]++;
            if(myArr[1] == checkArr[1]) checkSecret++;
            break;
        case 'G':
            myArr[2]++;
            if(myArr[2] == checkArr[2]) checkSecret++;
            break;
        case 'T':
            myArr[3]++;
            if(myArr[3] == checkArr[3]) checkSecret++;
            break;

        }
    }

    private static void Remove(char c){
        switch(c){
        case 'A':
            if(myArr[0] == checkArr[0]) checkSecret--;
            myArr[0]--;
            break;
        case 'C':
            if(myArr[1] == checkArr[1]) checkSecret--;
            myArr[1]--;
            break;
        case 'G':
            if(myArr[2] == checkArr[2]) checkSecret--;
            myArr[2]--;
            break;
        case 'T':
            if(myArr[3] == checkArr[3]) checkSecret--;
            myArr[3]--;
            break;
        }
    }
}