import java.util.Scanner; 

/**
 * Driver program to test the BankAccount class using whole dollar or currency modes.
 * CITATION: The logic for method overloading and setting up the constructors 
 * was guided by the Chapter 6 pt2 power point recaps and Java tutorials on youtube.
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-03-29
 */
public class BankAccountDemo {
    
    public static void main (String[] args) {
        int mode;
        Scanner keyboard = new Scanner(System.in);
        
        // Ask the user for their preferred mode
        System.out.print("Press 1 to use whole dollars or 2 to use currency: ");
        mode = keyboard.nextInt();
        
        // Loop to force a valid 1 or 2 input
        while (mode != 1 && mode != 2) {
            System.out.print("Press 1 to use whole dollars or 2 to use currency: ");
            mode = keyboard.nextInt();
        }
        
        // Run the correct mode based on their choice
        if (mode == 1) {
            useWholeDollarMode();
        } else {
            useCurrencyMode();
        }
        
        keyboard.close();
    }

    //used for menu option 1
    /**
     * useWholeDollarMode asks the user for the starting balance, the interest, and the number of months to
     * process. A BankAccount object is created with balance and interest rates as args.
     * A loop runs based on number of months to process. For each month deposits, withdraws,
     * and interest rate is calculated. After the loop processes, ending balance, total deposits,
     * total withdraws, and total interest is displayed.
     */
    public static void useWholeDollarMode(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        int balance = keyboard.nextInt();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();
        System.out.println("===============================");
        
        // Create the account object
        BankAccount bankAccount = new BankAccount(balance, intRate);
        
        for(int i=1;i<=counter;i++){
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextInt());
            
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextInt());
            
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance()); 
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f\n",bankAccount.getInterest());
    } //end useWholeDollarMode()

    //used for menu option 2
    /**
     * useCurrencyMode asks the user for the starting balance, the interest, and the number of months to
     * process. A BankAccount object is created with balance and interest rates as args.
     * A loop runs based on number of months to process. For each month deposits, withdraws,
     * and interest rate is calculated. After the loop processes, ending balance, total deposits,
     * total withdraws, and total interest is displayed.
     */
    public static void useCurrencyMode(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        double balance = keyboard.nextDouble();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();
        System.out.println("===============================");
        
        // Create the account object
        BankAccount bankAccount = new BankAccount(balance, intRate);
        
        for(int i=1;i<=counter;i++){
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextDouble());
            
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextDouble());
            
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance()); 
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f\n",bankAccount.getInterest());
    }//end useCurrencyMode()

}//end class