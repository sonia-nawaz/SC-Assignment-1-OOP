/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
public class SalesManager extends Employee {
    private double totalSales;
    private double commissionRate = 0.05; // 5%

    public SalesManager(String name, double baseSalary, double totalSales) {
        super(name, baseSalary);
        this.totalSales = totalSales;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (totalSales * commissionRate);
    }
}
