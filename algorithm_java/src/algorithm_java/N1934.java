package algorithm_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class N1934 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(bf.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int d = gcd(a, b);
			
			sb.append(a * b / d).append('\n');
		}
		System.out.println(sb);
 
	}
    
    
	// 최대공약수
	public static int gcd(int a, int b) {
 
		while (b != 0) {
			int r = a % b;
 
			// GCD(a, b) = GCD(b, r)
			a = b;
			b = r;
		}
		return a;
	}
}