package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
		String[] nameArr = new String[N + 1];
		StringBuilder sb = new StringBuilder();
		
		// 입력
		for(int i = 1; i < N + 1; i++) {
			String name = br.readLine();
			nameMap.put(name, i);
			nameArr[i] = name;
		}
		
		while(M --> 0) {
			String findStr = br.readLine();
			if(isStringNumber(findStr)) { // 숫자 입력
				int index = Integer.parseInt(findStr);
				sb.append(nameArr[index]);
			}
			else {	// 문자 입력
				sb.append(nameMap.get(findStr));
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	// 숫자인지 아닌지 판단
	public static boolean isStringNumber(String s) {
	   try {
	       Double.parseDouble(s);
	       return true;
	   }
	   catch (NumberFormatException e) {
	       return false;
	   }
	}
}