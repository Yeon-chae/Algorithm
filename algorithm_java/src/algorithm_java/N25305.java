package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N25305 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	int numarr[] = new int[N];
    	st = new StringTokenizer(bf.readLine());
    	for(int i=0; i<N; i++) {
    		numarr[i] = Integer.parseInt(st.nextToken());
    	}
    	Arrays.sort(numarr);

    	System.out.println(numarr[N-k]);
	}

}
