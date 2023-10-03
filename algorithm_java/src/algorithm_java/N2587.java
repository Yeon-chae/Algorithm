package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2587 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int [] numarr = new int[5];
		int sum=0;
		int tmp;
		for(int i=0; i<5; i++) {
			numarr[i]=Integer.parseInt(bf.readLine());
			sum += numarr[i];
		}
		for (int j=0; j<5; j++) {
			for(int i=j; i<5; i++) {//내림차순 정렬
				if(i > 0 && numarr[i] < numarr[i-1]) {
					tmp = numarr[i];
					numarr[i] = numarr[i-1];
					numarr[i-1]= tmp;
				}
				
			}
		}
		System.out.println(sum/5);
		System.out.println(numarr[2]);
		

	}

}
