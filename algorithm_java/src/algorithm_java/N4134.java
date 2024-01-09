package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4134 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long num = Long.parseLong(bf.readLine());
		while(num>0) {
			long t = Long.parseLong(bf.readLine());
			sb.append(String.valueOf(findDecimal(t))).append("\n");
			num--;
		}
		System.out.print(sb);

	}
	
	
	
	public static long findDecimal(long t) {
		if( t <= 2 )
			return 2;
		else {
			boolean flag = false;
			for (int i = 2; i <= Math.sqrt(t); i++ ) {
				if( t % i == 0 ) {
					flag = true;
					break;
					
				}
			}
			if(flag == false) {
				return t;
			}
			
			return findDecimal(++t);
			
		}
		
	}
	
}
