package algorithm_java;

import java.io.*;
import java.util.Scanner;

public class N2501{
    public static void main(String[] args) throws IOException{
    		Scanner scan = new Scanner(System.in);
    		int N = scan.nextInt();
    		int K = scan.nextInt();
    		int temp;
    		temp = 1;
    		while(true) {
    			if(N % temp ==0) {
    				K--;
    				if(K==0) {System.out.println(temp);break;}
    			}
    			temp++;	
    			if(temp> N) {System.out.println("0");break;}
    		}
    		scan.close();
    		
    }
}