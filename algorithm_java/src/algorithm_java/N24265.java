package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N24265 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bf.readLine());
		//n�� �ִ� 50�� �̹Ƿ� n*n �ÿ� �����÷ο� �������
		//���� int ���� long���� �ޱ�.
		System.out.println(n*(n-1) /2);
		System.out.print(2);
		
	}	
}
