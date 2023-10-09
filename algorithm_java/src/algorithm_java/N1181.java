package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class N1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		
		ArrayList<String> wordarr = new ArrayList<String>();
		for(int i=0; i<N; i++) {
			wordarr.add(bf.readLine());
		}
		//정렬
		Collections.sort(wordarr, (e1, e2) -> {
			if(e1.length()== e2.length()) {//길이 같은경우 단어 순
				return e1.compareTo(e2);
			}
			else {//길이 짧은 순
				return e1.length() -e2.length();
			}
		});
		//중복 제거
		for(int i = wordarr.size()-2; i >=0 ; i--) {
			if( (wordarr.get(i).compareTo(wordarr.get(i+1))) == 0 ) {
				wordarr.remove(i+1);
			}
		}
		//출력
		for(int i = 0; i < wordarr.size(); i++) {
			System.out.println(wordarr.get(i));
		}
		

	}

}
