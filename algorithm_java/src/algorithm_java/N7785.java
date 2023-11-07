package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N7785 {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        HashMap<String, String> map = new HashMap<String, String>();
        int n = Integer.parseInt(st.nextToken());
        
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			String name = st.nextToken();
			String state = st.nextToken();

			if (state.equals("leave")) {
				map.remove(name);
			} else {
				map.put(name, state);
			}
		}
        
        
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, Collections.reverseOrder());
		
		for(var a : list) {
			System.out.print(a + " \n");
		}

	}

}
