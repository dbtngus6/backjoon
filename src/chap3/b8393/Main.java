package chap3.b8393;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=0;
        int total=0;
        num = sc.nextInt();

        for(int i=1;i<=num;i++) {
            total += i;
        }
        System.out.println(total);

    }
}
