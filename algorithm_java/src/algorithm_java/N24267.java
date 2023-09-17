package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N24267 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bf.readLine());
		//n의 최댓값 50만 이므로 n*n 시에 오버플로우 우려존재
		//따라서 int 말고 long으로 받기.
		System.out.println((n-2)*(n-1)*n/6);
		System.out.print(3);

	}

}
