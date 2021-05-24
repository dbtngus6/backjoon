package chap3.b2739;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=0;
        num = sc.nextInt();
        for(int j=1;j<10;j++) {
            System.out.printf("%d * %d = %d\n",num,j,num*j);

        }
    }
}
