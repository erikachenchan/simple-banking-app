package org.example;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    static double defaultBalance = 1000;
    static int defaultPin = 1234;

    public static void main(String[] args) {

        String usersChoice;
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
                        case "C":
                            checkBalance();
                            break;
                        case "E":
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid choice, please try again");
                            break;
                    }
                } else {
                    System.out.println("Incorrect pin try again");
                    System.out.println("");
                }
            } catch (Exception e) {
                System.out.println("Input PIN again using four digits!");
                System.out.println("");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("[ W ] - Withdraw");
        System.out.println("[ D ] - Deposit");
        System.out.println("[ C ] - Check balance");
        System.out.println("[ E ] - Exit");
    }

    public static void depositMoney() {

        System.out.print("How much would you like to deposit: ");
        double userInputDeposit = Double.parseDouble(scanner.nextLine());
        defaultBalance += userInputDeposit;

        System.out.println("Your remaining balance is: " + defaultBalance + " GBP.");
        System.out.println("Thanks for banking with us!");
        System.out.println("");
    }

    public static void withdrawMoney() {

        System.out.print("How much would you like withdraw?: ");

        double userInputWithdraw = Double.parseDouble(scanner.nextLine());

        if (userInputWithdraw > defaultBalance) {
            System.out.println("Insufficient funds!");
        }

        if (userInputWithdraw < defaultBalance) {
            defaultBalance -= userInputWithdraw;
        }

        System.out.println("");

        System.out.println("Your remaining balance is: " + defaultBalance + " GBP");
        System.out.println("You will get " + userInputWithdraw + " GBP.");
        System.out.println("Thanks for banking with us!");
        System.out.println("");
    }

    public static void checkBalance() {
        System.out.println("Your remaining balance is: " + defaultBalance + " GBP.");
        System.out.println("Thanks for banking with us!");
    }
}