package algorithm_java;

import java.io.*;
import java.util.StringTokenizer;

public class N1978{
    public static void main(String[] args) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int sum = N;
    	st = new StringTokenizer(bf.readLine());
    	for(int j=0; j<N; j++) {
    		int num = Integer.parseInt(st.nextToken());
    		if(num==1){ sum--; continue;}
    		for(int i=2; i<=num-1;i++) {
    			if(num % i == 0) { sum--; break;}
    			if(num == 2) break;
    		}
    		
    	}
    	System.out.println(sum);
    	
    }
}

