import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();

		sb.append(facto(n));
    	System.out.println(sb);
	}

	private static int facto(int n){
		int result=n;

		if(n==0){
			return 1;
		} else{
			result*=facto(n-1);
		}
		return result;
	}
}