import java.util.*;
import java.io.*;

public class Main{
    //사람의 덩치 x kg, y cm로 표현
    //만약 사람 A(x,y), B(p,q)가 있을 때
    //x>p && y>q 이면 A 덩치가 B보다 더 크다 고 표현

    //주어진 사람들 각각의 덩치 등수를 출력
    //이때, 덩치 등수는 (자신보다 더 큰 덩치의 사람의 수+1)

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        //주어진 사람의 수 n
        int[][] build = new int[n][2];
        //[kg][cm]의 덩치를 가진 n명의 사람들

        StringTokenizer st;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            build[i][0] = Integer.parseInt(st.nextToken());
            build[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0;i<n;i++){
            int r=1;
            //등수 r
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                    //본인 제외
                }
                if(build[j][0]>build[i][0]&&build[j][1]>build[i][1]){
                    r++;
                    //j번째 사람이 자신(i번째 사람)보다 더 큰 덩치를 가진 사람인 경우
                    //등수+1
                }
            }
            sb.append(r+" ");
        }
        
        System.out.println(sb);
    }
}