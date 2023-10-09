package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N10814 {
	//�� ����� ȿ���� ���δ� ���߿� ī���� ���ķε� ������ �� ��.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(bf.readLine());
		String arr[][] = new String[N][2];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i][0]=st.nextToken();//���� - ������ �������� ����Ұ�
			arr[i][1]=st.nextToken();
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
		});
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

}
