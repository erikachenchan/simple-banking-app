package org.example;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    static double defaultBalance;
    static double depositBalance;
    static double withdrawBalance;
    static double totalBalance;

    public static void main(String[] args) {

        String usersChoice;
        int defaultPin = 1234;
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("Enter pin: ");
                int userPin = Integer.parseInt(scanner.nextLine());
                if (userPin != defaultPin) {
                    System.out.println("Incorrect pin!");
                }
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
                }
            } catch (Exception e) {
                System.out.println("Input PIN again using four digits!");
            }
        }

    }

    public static void displayMenu() {
        System.out.println("[ W ] - Withdraw");
        System.out.println("[ D ] - Deposit");
        System.out.println("[ C ] - Check balance");
        System.out.println("[ E ] - Exit");
    }

    public static double depositMoney() {

        System.out.print("How much would you like to deposit: ");
        double userInputDeposit = Double.parseDouble(scanner.nextLine());
        depositBalance = defaultBalance + userInputDeposit;

        System.out.println("Your remaining balance is: " + depositBalance + " GBP.");
        System.out.println("Thanks for banking with us!");
        System.out.println("");

        totalBalance = depositBalance;
        return totalBalance;
    }

    public static double withdrawMoney() {

        System.out.println("How much would you like withdraw? ");

        double userInputWithdraw = Double.parseDouble(scanner.nextLine());

        if (userInputWithdraw > totalBalance) {
            System.out.println("Don't withdraw higher than your current balance!");
        }
        if (userInputWithdraw < totalBalance) {
            withdrawBalance = defaultBalance - userInputWithdraw;
        }
        System.out.println("Your remaining balance is: " + withdrawBalance + " GBP.");
        System.out.println("You will get " + userInputWithdraw + " GBP.");
        System.out.println("Thanks for banking with us!");
        System.out.println("");

        totalBalance = withdrawBalance;
        return totalBalance;
    }

    private static void checkBalance() {

        System.out.println("Your remaining balance is: " + totalBalance + " GBP.");
        System.out.println("Thanks for banking with us!");

    }

}