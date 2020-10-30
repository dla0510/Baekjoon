import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		sb.append(R_F(n));
		System.out.println(sb);
	}

	private static int R_F(int n){
		int result=0;
		if(n==0){
			return 0;
		} else if(n==1){
			return 1;
		} else{
			result = R_F(n-1)+R_F(n-2);
		}
		return result;
	}
}
