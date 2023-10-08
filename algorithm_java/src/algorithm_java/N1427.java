package algorithm_java;

import java.io.IOException;

public class N1427 {

	public static void main(String[] args) throws IOException {
		int[] counting = new int[10];//0~9·Î ±¸¼º
		int input;
		while(true) {
			input = System.in.read();
			if(input=='\n' || input==' ' || input == '\r') {
				break;
			}
			else {			
				counting[input-'0']++;
			}
			
		}
		
		for(int j =9; j>=0;) {
			if(counting[j] > 0) {
				counting[j]--;	
				System.out.print(j);
					
			}
			else if(counting[j] == 0 ){
				j--;
			}
		}

	}

}
