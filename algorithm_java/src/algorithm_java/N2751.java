package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class N2751 {

	public static void main(String[] args) throws Exception, IOException {
		ArrayList <Integer> al = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		for(int i=0; i<N; i++) {
			al.add(Integer.parseInt(bf.readLine()));
		}
		
		Collections.sort(al);
		for(int i=0; i<al.size(); i++) {
			sb.append(al.get(i)).append("\n");
		}
		System.out.println(sb.toString());
		

	}

}
