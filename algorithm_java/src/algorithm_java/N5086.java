package algorithm_java;

import java.io.*;
import java.util.StringTokenizer;

public class N5086{
    public static void main(String[] args) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	int a;
    	int b;
    	String s;
    	while(true) {
    		st = new StringTokenizer(bf.readLine());
    		a = Integer.parseInt(st.nextToken());
    		b = Integer.parseInt(st.nextToken());
    		if(a==0 && b==0) break;
    		if(a%b == 0 || b%a == 0) {
    			s = (a<b)? "factor" : "multiple";
    			System.out.println(s);
    		}
    		else {
    			System.out.println("neither");
    		}

    	}
    	bf.close();
    }
}
