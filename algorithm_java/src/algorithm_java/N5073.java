package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class N5073 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr = new int[3];
		while(true) {
			 st = new StringTokenizer(bf.readLine());
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			if(arr[0]== 0 && arr[1] == 0 && arr[2] ==0) break;
			Arrays.sort(arr);

			if(arr[2] >= arr[0] + arr[1]){
				System.out.println("Invalid");
				
			}
			else if(arr[0] == arr[1] && arr[1] == arr[2]) {
				System.out.println("Equilateral");
			}
			else if(arr[0] == arr[1]|| arr[1] == arr[2] || arr[0]== arr[2]) {
				System.out.println("Isosceles");
			}
			else if(arr[0] != arr[1]|| arr[1] != arr[2] || arr[0] != arr[2]) {
				System.out.println("Scalene");
			}
			
		}
	}
}
