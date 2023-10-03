# simple-banking-app

Create a program that will process a basic transaction of an ATM. The program must have a withdrawal deposit, and
checking of balance.
The default pin is "1234", the default cash on account is 1000.
One transaction per execution of program to test.
The program must test if the amount to withdraw is less than or equal to current cash on account.
You can create your own messages per test cases like "Insufficient fund" or "Incorrect Pin" etc.

Sample output for withdraw.

Enter PIN:

Transaction Available
[ W ] - Withdraw
[ D ] - Deposit
[ C ] - Check balance

### For withdrawal

How much would you like to withdraw:
Your remaining balance is:
You will get ___ GBP.
Thanks for banking with us!

### For deposit

How much would you like to deposit:
Your remaining balance is:
Thanks for banking with us!

### For check balance

Your remaining balance is: ____
Thanks for banking with us!

# Test Cases

### test cases 1

- (Scenario) Check the return message when users input the wrong number pin
- (Expected) It should return exceptions messages "Incorrect pin try again!"

### test cases 2

- (Scenario) Check the return message when users input the wrong pin other than numbers.
- (Expected) It should exceptions messages "Input PIN again using four digits!"

### test cases 3

- (Scenario) Check if users prompt wrong input from the display menu d,w,c
- (Expected) It should exceptions messages "You enter an invalid choices, please try again"

### test cases 4

- (Scenario) Check if users able to check the current balance or default balance 1000 GBP
- (Expected) it should return messages "Your remaining balance is: 1000 GBP"

### test cases 5

- (Scenario) Check if users able to check the current balance
- (Expected) it should return messages "Your remaining balance is: 1010 GBP"

### test cases 6

- (Scenario) Check if users able to withdraw money, 
- (Expected) it should return messages 

### test cases 7

- (Scenario) Check if users able to withdraw money higher than the current balance. 
- (Expected) It should return messages "Insufficient funds!"




