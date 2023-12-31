package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
    	int N = Integer.parseInt(bf.readLine());
    	int [] counting = new int[10001];

    	
    	for(int i= 0; i<N; i++) {
    		counting[Integer.parseInt(bf.readLine())]++;
    	}
    	
    	for(int i = 1; i<10001; i++) {
    		while(counting[i]>0) {
    			sb.append(i).append('\n');
    			counting[i]--;
    		}
    		
    	}
    	System.out.println(sb.toString());


    	
	}

}
