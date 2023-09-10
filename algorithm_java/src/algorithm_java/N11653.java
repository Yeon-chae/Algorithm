package algorithm_java;

import java.util.Scanner;

public class N11653 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
        
		int N = scan.nextInt();
		int i=2;
		while(N != 1) {
			if (N % i == 0) {
				sb.append(i).append('\n');
				N /= i;
			}
			else {
				i++;
			}
		}
		System.out.println(sb);
		scan.close();
	}
}