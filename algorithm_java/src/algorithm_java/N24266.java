package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N24266 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bf.readLine());
		//n의 최댓값 50만 이므로 n*n 시에 오버플로우 우려존재
		//따라서 int 말고 long으로 받기.
		System.out.println(n*n*n);
		System.out.print(2);

	}

}
