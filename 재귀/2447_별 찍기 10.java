import java.io.*;
import java.util.*;

public class Main{
    static boolean[][] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        arr = new boolean[n][n];
        //false면 공백, true면 *

        star(0,0,n);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        
    }
    
    private static void star(int x, int y, int n){
        if(n==1){
            arr[x][y]=true;
        } else{
            int count = 0;
            for(int i=x;i<x+n;i+=n/3){
                for(int j=y;j<y+n;j+=n/3){
                    if(count==4){count++; continue;}
                    star(i,j,n/3);
                    count++;
                }
            }
        }
        return;
    }
}