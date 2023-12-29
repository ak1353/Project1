package lab1;

import java.util.Scanner;
public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Month name: ");
        String monthname = in.nextLine();
        System.out.println("Number of days in a month: ");
        int number = in.nextInt();
        System.out.println(monthname + " contains " + number + " days");
    }
}
