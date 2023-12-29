package lab1;

import java.util.Scanner;
public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input year of your date birth: ");
        int age = in.nextInt();
        System.out.println("Your age: " + (2023 - age));

    }
}
