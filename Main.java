package com.company;
//ask user for season of the year
//ask user for a whole number
//ask user for an adjective

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a season");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        System.out.println("Please enter a number");
        int num = scanner.nextInt();

        System.out.println("Please enter an adjective");
        String adj = scanner.nextLine();
        scanner.close();

        System.out.println(
                "On a " + adj + season + " day of the year I drink a minimum of "
                + num + " cups of coffee");


        // write your code here
    }
}
