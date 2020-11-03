import java.io.*;
import java.util.*;

public class Main{
    //n장의 카드 중 3개를 사용해 숫자 m을 넘지 않으면서 가장 가까운 수를 만들어라
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        //주어진 카드의 수 n
        int m = Integer.parseInt(st.nextToken());
        //제시된 숫자 m
        int[] arr = new int[n];
        int max=0;
        
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            //각 카드에 써진 숫자들을 arr에 차례대로 담기
        }
        
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    //arr에서 중복되지 않는 3개의 조합으로 합을 만들기
                    if(sum==m){
                        max=sum;
                        break;
                    }else if(max<sum&&sum<m){
                        max=sum;
                    }
                }
            }
            if(max==m){
                break;
            }
        }
        
        sb.append(max);
        System.out.println(sb);
    }
}