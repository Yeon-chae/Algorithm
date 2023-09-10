package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10101 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int angle1 = Integer.parseInt(bf.readLine());
		int angle2 = Integer.parseInt(bf.readLine());
		int angle3 = Integer.parseInt(bf.readLine());
		int sum = angle1 + angle2 + angle3;
			
		if(sum != 180){
			System.out.println("Error");
		}
		else if(angle1 == 60 && angle2 == 60 && angle3== 60) {
			System.out.println("Equilateral");
		}
		else if(angle1 == angle2 ||angle2 == angle3 || angle1 == angle3) {
			System.out.println("Isosceles");
		}
		else if(angle1 != angle2 && angle1 != angle3 && angle2 != angle3) {
			System.out.println("Scalene");
		}
	}
	
}
