package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
		int arr[] = new int[N];
		int sortedarr[];
		int i=0;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		st= new StringTokenizer(bf.readLine());
		
		for(int j=0; j<N; j++) {
			arr[j] = Integer.parseInt(st.nextToken());
		}
		sortedarr = arr.clone();
		Arrays.sort(sortedarr);
		
		for(int v : sortedarr ) {
			if(!map.containsKey(v)) {
				map.put(v, i);
				i++;
			}
		}
		
		for(int key : arr) {
			sb.append(map.get(key)).append(" ");
		}
		System.out.print(sb.toString());

	}

}
