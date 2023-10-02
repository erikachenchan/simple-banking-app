package org.example;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String usersChoice;
        int defaultPin = 1234;
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("Enter pin: ");
                int userPin = Integer.parseInt(scanner.nextLine());
                if (userPin == defaultPin) {
                    displayMenu();
                    System.out.println("Enter your choice: ");
                    while (true) {
                        try {
                            usersChoice = scanner.nextLine().trim().toUpperCase();
                            break;
                        } catch (Exception e) {
                            System.out.println("");
                            System.out.println("You enter an invalid choice, please try again");
                            System.out.println("");
                            displayMenu();
                        }
                    }
                    switch (usersChoice) {
                        case "D":
                            depositMoney();
                            break;
                        case "W":
                            withdrawMoney();
                            break;
                        case "E":
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid choice, please try again");
                            break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Input pin again!");
            }
        }

    }

    public static void displayMenu() {
        System.out.println("[ W ] - Withdraw");
        System.out.println("[ D ] - Deposit");
        System.out.println("[ E ] - Exit");
    }

    public static double depositMoney() {
        return 0;
    }

    public static double withdrawMoney() {
        return 0;
    }
}