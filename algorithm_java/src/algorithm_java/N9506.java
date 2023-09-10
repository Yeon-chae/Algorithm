package algorithm_java;

import java.io.*;
import java.util.Scanner;

public class N9506{
    public static void main(String[] args) throws IOException{
    		Scanner scan = new Scanner(System.in);
    		StringBuilder sb;
    		int n, temp, sum;
    		while((n = scan.nextInt()) != -1) {
    			sum =0;
    			temp =1;
    			sb = new StringBuilder();
    			sb.append(n).append(" = ");
    			while(true) { 
    				if (temp == n) {sb.delete(sb.length()-3, sb.length()); break;}
    				if(n != temp && n % temp == 0) {
	    				sum += temp; 
	    				sb.append(temp);
	    				sb.append(" + ");
    				}
    				temp++;
    			}
    			if(sum == n) {
    				System.out.println(sb);
    			}
    			else { System.out.println(n +" is NOT perfect.");}
	
    		}
    		scan.close();
    }
}
