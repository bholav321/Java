//program to convert days into month , weeks and day

import java.util.Scanner;

class Test{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter days: ");
        int days = input.nextInt();
        int month = (days /30);
        int weeks = (days % 365) / 7;
        int day = (days % 365) % 7;
        System.out.println(month + " month(s), " + weeks + " Week(s), " + day + " Day(s)");
    }
}
