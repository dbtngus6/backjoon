package chap3.b11022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1;i<=num;i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n",i, A, B, A+B);
        }
    }
}
