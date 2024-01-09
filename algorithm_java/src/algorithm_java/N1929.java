package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=M; i<=N; i++) {
			if (isDecimal(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isDecimal(int i) {
		boolean result = true;
		if (i == 1 )
			result = false;
		else if( i == 2 )
			result =true;
		else {
			for(int j = 2; j<=Math.sqrt(i); j++ ) {
				if(i % j == 0)
					result = false;
			}
		}
		return result;
		
	}

}
