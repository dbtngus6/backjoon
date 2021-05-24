package chap3.b10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A=0, B=0;
        int num=0;

        num = sc.nextInt();

        for(int i=0;i<num;i++) {
            A = sc.nextInt();
            B = sc.nextInt();

            System.out.println(A+B);
        }




    }
}
