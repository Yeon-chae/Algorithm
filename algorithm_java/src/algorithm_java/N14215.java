package algorithm_java;

import java.util.Scanner;

public class N14215 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,Max,Min;
		
		a= scan.nextInt();
		b= scan.nextInt();
		c= scan.nextInt();
		
		if (a==b&&b==c)
			System.out.println(a+b+c);
		else {
			Max =Math.max(Math.max(a, b),c);
			if (Max==a) {
				Min= Math.min(b, c);
				if(Min==b) {
					if(a<c+b&&a>=c)
						System.out.println(a+b+c);
					else {
						a= b+c-1;
						System.out.println(a+b+c);
					}
				}
				else {
					if(a<c+b&&a>=b)
						System.out.println(a+b+c);
					else {
						a= b+c-1;
						System.out.println(a+b+c);
					}
				}
			}
			else if(Max==b){
				Min= Math.min(a, c);
				if(Min==a) {
					if(b<c+a&&b>=c)
						System.out.println(a+b+c);
					else {
						b= a+c-1;
						System.out.println(a+b+c);
					}
				}
				else {
					if(b<c+a&&b>=a)
						System.out.println(a+b+c);
					else {
						b= a+c-1;
						System.out.println(a+b+c);
					}
				}
			}
			else if(Max==c){
				Min= Math.min(a, b);
				if(Min==a) {
					if((c<b+a)&&(c>=b))
						System.out.println(a+b+c);
					else {
						c= a+b-1;
						System.out.println(a+b+c);
					}
				}
				else {
					if(c<b+a&&c>=a)
						System.out.println(a+b+c);
					else {
						c= a+b-1;
						System.out.println(a+b+c);
					}
				}
			}
		}
		scan.close();
	}
}
