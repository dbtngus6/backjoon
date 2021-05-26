package chap4.b1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num = N;
        int first = 0, second = 0;
        int cycle = 0;

        while(true) {
            first = num / 10;
            second = num % 10;
            num = second*10 + (first+second) % 10;
            cycle++;

            if(num == N) {
                break;
            }
        }
        System.out.println(cycle);
    }
}
