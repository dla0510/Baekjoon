import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int[] arr = new int[3];
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int z = Integer.parseInt(st.nextToken());

    while(x!=0){
      if(x>y){int copy=y; y=x; x=copy;}
      if(y>z){int copy=z; z=y; y=copy;}

      if(x*x+y*y==z*z){
        bw.write("right");
      }else{
        bw.write("wrong");
      }

      bw.write("\n");

      st = new StringTokenizer(br.readLine());
      x = Integer.parseInt(st.nextToken());
      y = Integer.parseInt(st.nextToken());
      z = Integer.parseInt(st.nextToken());
    }

    bw.flush();
    bw.close();
  }
}