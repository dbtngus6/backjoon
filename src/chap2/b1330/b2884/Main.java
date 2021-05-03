package chap2.b1330.b2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H=0, M=0;

        H = sc.nextInt();
        M = sc.nextInt();

        if (H==0 && M<45) {
            H = 24;
        }
        if(M<=44) {
            H -= 1;
            M += 15;
        }else {
            M -= 45;
        }
        System.out.print(H+" "+M);
    }
}
