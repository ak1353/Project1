package lab1;

import java.util.Scanner;
public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = in.nextInt();
        System.out.println(number - 1);
        System.out.println(number);
        System.out.println(number+1);
        System.out.println(number*3*(number*3));
    }
}
