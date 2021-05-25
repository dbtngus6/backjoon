package chap3.b2438;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=num;i>0;i--) {
            for(int j=i-1;j>0;j--) {
                System.out.printf(" ");
            }
            for(int j=0;j<num-i+1;j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
