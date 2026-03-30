/**
 * This class models a Bank Account, tracking balances, deposits, withdrawals, and interest.
 * CITATION: The logic for method overloading and setting up the constructors 
 * was guided by the Chapter 6 power point recaps and Java tutorials on youTube.
 * @author David Rivera Ortiz
 * @version 1.0
 * @since 2026-03-27
 */
public class BankAccount {

    // Variables
    private double balance, deposit, withdraw, interest, monthlyIntRate;

    /**
     * No-arg constructor that sets the default monthly interest rate.
     */
    public BankAccount() {
        // 4.4% annual rate divided by 12 for the monthly rate 
        monthlyIntRate = 0.044 / 12.0; 
    }

    /**
     * Constructor for when the starting balance is a whole number
     * @param inBalance The starting balance as a whole number.
     * @param intRate The annual interest rate as a percentage.
     */
    public BankAccount(int inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100.0) / 12.0;
    }

    /**
     * Constructor for when the starting balance has decimals
     * @param inBalance The starting balance as a decimal number.
     * @param intRate The annual interest rate as a percentage.
     */
    public BankAccount(double inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100.0) / 12.0;
    }

    /**
     * Adds a deposit to the balance and tracks the total deposited.
     * @param add The double amount to deposit.
     */
    public void makeDeposit(double add) {
        balance += add;
        deposit += add; 
    }

    /**
     * Adds a deposit to the balance and tracks the total deposited.
     * @param add The integer amount to deposit.
     */
    public void makeDeposit(int add) {
        balance += add;
        deposit += add;
    }

    /**
     * Subtracts a withdrawal from the balance and tracks the total withdrawn.
     * @param sub The double amount to withdraw.
     */
    public void makeWithdraw(double sub) {
        balance -= sub;
        withdraw += sub; 
    }

    /**
     * Subtracts a withdrawal from the balance and tracks the total withdrawn.
     * @param sub The integer amount to withdraw.
     */
    public void makeWithdraw(int sub) {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * Calculates monthly interest and adds it to the balance if the balance is positive.
     */
    public void calcInterest() {
        double monthlyInterestEarned = 0.0; 

        // calculate interest if the account has a positive balance
        if (balance > 0) {
            monthlyInterestEarned = balance * monthlyIntRate;
            interest += monthlyInterestEarned; 
            balance += monthlyInterestEarned;
        }
    }

    /**
     * Gets the current account balance.
     * @return The account balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets the total amount deposited.
     * @return The total deposits.
     */
    public double getDeposit() {
        return deposit;
    }

    /**
     * Gets the total amount withdrawn.
     * @return The total withdrawals.
     */
    public double getWithdraw() {
        return withdraw;
    }

    /**
     * Gets the total interest earned.
     * @return The total interest.
     */
    public double getInterest() {
        return interest;
    }
}