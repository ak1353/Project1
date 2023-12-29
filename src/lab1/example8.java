package lab1;

import java.util.Scanner;
public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input current day of the week: ");
        String dayweek = in.nextLine();
        System.out.println("Input month name: ");
        String monthname = in.nextLine();
        System.out.println("Input date: ");
        int date = in.nextInt();
        System.out.println(dayweek + " " + date + " " + monthname);
    }
}
