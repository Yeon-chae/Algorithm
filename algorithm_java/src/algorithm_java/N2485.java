package algorithm_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N2485 {

    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        int[] streetTree =new int[N];

        for(int i = 0; i < N; i++){
            streetTree[i]=Integer.parseInt(bf.readLine());
        }

        bf.close();

        int gcd = 0; //���μ� ������ �ִ� ������� �����ϴ� ����

        for(int i = 0; i < N-1; i++){
            int distance = streetTree[i+1] - streetTree[i];
            gcd = findGCD(distance, gcd); //���μ� ������ �ִ� �����
        }

        //���μ��� ������ ������ ���Ϸ��� ������ ������ + 1
        bw.write((streetTree[N-1]-streetTree[0])/gcd+1-(streetTree.length) + "");
        bw.flush();
        bw.close();

    }

    //�ִ� ����� ���ϱ�
    static int findGCD(int A, int B){
        while(B != 0){
            int R = A%B;
            A = B;
            B = R;
        }
        return A;
    }

}
