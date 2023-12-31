package algorithm_java;

import java.io.*;
import java.util.*;
public class N1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++) {
            map.put(bf.readLine(), 1);
        }
        
        for (int i = 0; i < m; i++) {
            String name = bf.readLine();
            map.put(name, map.getOrDefault(name,0) +  1);
            if (map.get(name) == 2) list.add(name);
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list);//사전 순 정렬
        sb.append(list.size() + "\n");
        for (String s : list) {
            sb.append(s + "\n");
        }
        System.out.print(sb);
    }
}