import java.io.*;
import java.util.*;

public class Main{
    //자연수 n의 가장 작은 생성자 m 구하기
    //이때 생성자란, 숫자 m의 분해합(m과 m을 이루는 각 자리수의 합)
    //이 n인 경우를 말한다

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int l = s.length();        
        int n = Integer.parseInt(s);
        //주어진 숫자 n
        int m = 0;
        //생성자 m
        for(int i=n-l*9;i<n;i++){
            //l은 n의 자리수
            s = Integer.toString(i);
            int sum = i;
            //숫자 i를 더함.
            for(int j=0;j<s.length();j++){
                sum += (int)s.charAt(j)-48;
                //숫자 i의 각 자리수를 더함.
            }
            
            //sum은 i의 분해합
            if(sum==n){
                m=i;
                //i의 분해합이 n인 경우
                break;
            } else{
                m = 0;
                //i의 분해합이 n이 아닌 경우
            }
        }
        sb.append(m);
        System.out.println(sb);
    }
}