package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N24267 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bf.readLine());
		//n�� �ִ� 50�� �̹Ƿ� n*n �ÿ� �����÷ο� �������
		//���� int ���� long���� �ޱ�.
		System.out.println((n-2)*(n-1)*n/6);
		System.out.print(3);

	}

}
