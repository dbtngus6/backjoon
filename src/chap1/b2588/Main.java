package chap1.b2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1=0,num2=0;
        num1=sc.nextInt();
        num2=sc.nextInt();

        //System.out.println(num1*(num2%10)+"\n"+num1*(num2/10%10)+"\n"+num1*(num2/100)+"\n"+num1*num2);
        System.out.println(num1*(num2%10));
        System.out.println(num1*(num2/10%10));
        System.out.println(num1*(num2/100));
        System.out.println(num1*num2);
    }
}
