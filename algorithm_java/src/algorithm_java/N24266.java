package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N24266 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bf.readLine());
		//n�� �ִ� 50�� �̹Ƿ� n*n �ÿ� �����÷ο� �������
		//���� int ���� long���� �ޱ�.
		System.out.println(n*n*n);
		System.out.print(2);

	}

}
