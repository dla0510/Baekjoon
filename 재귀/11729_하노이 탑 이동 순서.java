import java.io.*;
import java.util.*;

public class Main{
    static int count;
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        count = 0;
        tower(1,2,3,n);
        System.out.println(count);
        System.out.println(sb);
        
    }
    
    private static void tower(int a, int b, int c, int n){
        //a에 있는 원판 n개를 b를 거쳐 c로 옮기는 함수
        if(n==1){
            sb.append(a+" "+c+"\n");
            count++;
        }else{
            tower(a,c,b,n-1);
            //a에 있는 원판 n-1개를 c를 거쳐 b로 옮겨라
            sb.append(a+" "+c+"\n");
            count++;
            //a에 있는 마지막 원판 1개를 c로 옮김
            tower(b,a,c,n-1);
            //b에 있는 원판 n-1개를 a를 거쳐 c로 옮겨라
        }
        return;
    }
}