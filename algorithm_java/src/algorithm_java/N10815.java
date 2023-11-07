package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N10815 {
	static int N;
	static int cardsarr[];
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(bf.readLine());
		cardsarr = new int[N];
		st = new StringTokenizer(bf.readLine());
		for (int i=0; i<N; i++) {
			cardsarr[i] = Integer.parseInt(st.nextToken());		
		}
		
		Arrays.sort(cardsarr);
		
		int M =Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		for ( int i=0; i<M; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(binarySearch(num)) 
				sb.append("1 ");
			else
				sb.append("0 ");
		}
		System.out.println(sb.toString());
		
	}
    private static boolean binarySearch(int num) {
        int startIndex = 0;
        int endIndex = N - 1;

        while(startIndex <= endIndex){
            int midIndex = (startIndex + endIndex) / 2;
            int mid = cardsarr[midIndex];

            if(num < mid) endIndex = midIndex - 1;
            else if(num > mid) startIndex = midIndex + 1;
            else return true; //num ==  mid
        }
        return false;
    }

}
