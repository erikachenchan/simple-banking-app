# simple-banking-app

Create a program that will process a basic transaction of an ATM. The program must have a withdrawal deposit, and checking of blanace.
The default pin is "123456", the default cash on account is 0. 
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

## test cases
- Check if users input the wrong pin then throws messages "Incorrect pin try again!"
- Check if users prompt wrong input then throw exceptions messages "You enter an invalid choices, please try again"
- Check if users input small letters when asked to pick either (w,d,c)
- Check if users able to check the default balance 0 GBP
- Check if users able to check the current balance 
- Check if users able to withdraw money and show the total balance.
- Check if users able to withdraw money higher than the current balance and should return messages "Insufficient funds"
- Check if users able to deposit money and display the total balance after. 



