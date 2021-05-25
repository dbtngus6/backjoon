package chap3.b11021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1;i<=num;i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.printf("Case #%d: %d\n",i,A+B);
        }
    }
}
