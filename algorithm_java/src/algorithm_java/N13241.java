package algorithm_java;

import java.io.*;
import java.util.StringTokenizer;

public class N13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long A = Integer.parseInt(st.nextToken()); //���� A
        long B = Integer.parseInt(st.nextToken()); //���� B

        bf.close();

        if(A > B){ //A�� Ŭ ���
            bw.write(A*B/findGCD(A, B) + "\n"); 
        }else if(A < B){ //B�� Ŭ���
            bw.write(A*B/findGCD(B, A) + "\n");
        }else{ //A�� B�� ���� ���
            bw.write(A + "\n"); //���� ���ٸ�, �ϳ��� ����ϸ� �ȴ�.
        }

        bw.flush();
        bw.close();
    }
    
    //�ּ� ����� ã�� �޼���
    static long findGCD(long A, long B){
        while(B != 0){
            long R = A%B; //������
            A = B; 
            B = R;
        }
        return A;
    }
}