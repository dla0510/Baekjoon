import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int max=Integer.parseInt(st.nextToken());
        int min=max;
        for(int i=0;i<n-1;i++){
            int a = Integer.parseInt(st.nextToken());
            if(a>max){
                max=a;
            }
            if(a<min){
                min=a;
            }
        }
        bw.write(min+" "+max+"\n");
        bw.flush();
        bw.close();
    }
}