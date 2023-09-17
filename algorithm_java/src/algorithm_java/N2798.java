package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class N2798 {

	public static void main(String[] args) throws IOException {
		List<Integer> numlist = new ArrayList<Integer>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int sum;
		for(int i=0; i<N; i++) {
			sum=0;
			sum +=i;
			String  i1 = Integer.toString(i);
			
			for(int j = 0; j<i1.length(); j++) {
				sum += Integer.parseInt(String.valueOf(i1.charAt(j)));
			}
			if(sum == N ) {
				numlist.add(i);
				break;
			}
			
		}
		System.out.println(numlist.isEmpty()? 0 : numlist.get(0));
	}

}
