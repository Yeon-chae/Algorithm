package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class N14425 {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count =0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < n; i++) {
            map.put(bf.readLine(), 0);
        }
        for (int i =0; i<m; i++) {
        	if(map.containsKey(bf.readLine())) {
        		count++;
        	}
        			
        }
        System.out.println(count);

	}

}
