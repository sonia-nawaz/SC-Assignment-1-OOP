 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
public class DigitalWallet {

    private String accountHolder;
    private double balance;
    private String pinCode;

    public DigitalWallet(String accountHolder, double balance, String pinCode) {
        this.accountHolder = accountHolder;
        this.balance = (balance >= 0) ? balance : 0;
        this.pinCode = pinCode;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (!this.pinCode.equals(enteredPin)) {
            return false;
        }
        if (amount <= 0 || amount > this.balance) {
            return false;
        }
        this.balance -= amount;
        return true;
    }
}