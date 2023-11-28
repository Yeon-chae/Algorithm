package algorithm_java;

import java.util.Scanner;

public class N1735 {

    public static void main(String[] args) {
        int[] num = new int[4];
        int gcd;
        int deno, nume;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        deno = num[0]*num[3]+num[2]*num[1];
        nume = num[1]*num[3];
        gcd = findGCD(deno, nume);
        System.out.println(deno/gcd + " " + nume/gcd);
        sc.close();
    }
    //최대 공약수 구하기
    static int findGCD(int b1, int b2){
        while(b2 != 0){
            int R = b1%b2;
            b1 = b2;
            b2 = R;
        }
        return b1;
    }

}
