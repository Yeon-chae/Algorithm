package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class N27323 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		System.out.println(A*B);
	}
}