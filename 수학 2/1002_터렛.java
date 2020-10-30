import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(t>0){
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());

			double d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));

			if(d==0&&r1==r2){
				bw.write("-1");
			}else if(d>Math.abs(r1-r2)&&d<(r1+r2)){
				bw.write("2");
			} else if(Math.abs(r1-r2)==d||(r1+r2)==d){
				bw.write("1");
			} else{
				bw.write("0");
			}

			bw. write("\n");
			t--;
		}

		bw.flush();
		bw.close();
	}
}