package algorithm_java;

import java.io.*;
import java.util.StringTokenizer;

public class N2581{
    public static void main(String[] args) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int M = Integer.parseInt(st.nextToken());
    	st = new StringTokenizer(bf.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int sum = 0;
    	int min = -1;
    	boolean check = false;
    	while(M<=N) {
    		check = true;
    		if(N == 1 ) {
    			N--;
				continue;
    		}
    		if(N ==2 ) {
    			min =2;
    			sum +=N;
    			N--;
    			continue;
    		}
    		for(int i=2; i<=N-1; i++) {
    			if(N % i ==0) {
    				check = false;
    				break;
    			}
    		}
    		if(check == true) {
    			sum += N;
    			min = N;
    		}
    		N--;
    	}
    	if(sum ==0) {
    		System.out.println("-1");
    		}
    	else {
    		System.out.println(sum);
    		System.out.println(min);
    		
    	}
    }
}

