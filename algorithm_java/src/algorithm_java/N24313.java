package algorithm_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N24313 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(bf.readLine());
		int n0 = Integer.parseInt(bf.readLine());
		
		if(a1*n0 + a0 <= c*n0 && (a1<=c))//a0�� ������ ��쵵 f(n)�� �ϰ��ǰ� ���ų� �۵��� �������ֱ�����.)
		{
			System.out.println('1');
		}
		else {
			System.out.println('0');
		}

	}

}
