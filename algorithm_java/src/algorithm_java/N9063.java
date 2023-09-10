package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N9063 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int xmin = 0;
		int ymin = 0;
		int xmax = 0;
		int ymax = 0;
		for ( int i=0; i<N; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(i==0) {
				xmin = x;
				xmax = x;
				ymin = y;
				ymax = y;
			}
			
			if(x>xmax) {
				xmax =x;
			}
			else if(x<xmin) {
				xmin =x;
			}
			if(y>ymax) {
				ymax =y;
			}
			else if(y<ymin) {
				ymin = y;
			}
		}
		
		System.out.println((xmax-xmin)*(ymax-ymin));
		
	}

}
