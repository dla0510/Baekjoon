import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int r = sc.nextInt();
		//반지름 r

		sb.append(Math.PI*r*r);
		//유클리드 기하학(원의 넓이)

		sb.append("\n");

		sb.append(2*r*r);
		//택시 기하학(원의 넓이)

		System.out.println(sb);

	}
}