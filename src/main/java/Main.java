import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // --- Task 1: Digital Wallet ---
        DigitalWallet wallet = new DigitalWallet("Sonia", 1000, "4321");
        System.out.println("Balance: " + wallet.getBalance());

        boolean result1 = wallet.withdraw(200, "4321");
        System.out.println("Withdraw 200 with correct PIN: " + result1);
        System.out.println("New balance: " + wallet.getBalance());

        boolean result2 = wallet.withdraw(100, "0000");
        System.out.println("Withdraw 100 with wrong PIN: " + result2);

        boolean result3 = wallet.withdraw(-50, "4321");
        System.out.println("Withdraw negative amount: " + result3);

        boolean result4 = wallet.withdraw(5000, "4321");
        System.out.println("Withdraw more than balance: " + result4);

        // --- Task 2: Employee / Developer / SalesManager ---
        List<Employee> employees = new ArrayList<>();
        employees.add(new Developer("Ali", 50000, 10000));
        employees.add(new SalesManager("Sara", 40000, 200000));
        employees.add(new Developer("Zain", 55000, 12000));

        for (Employee e : employees) {
            System.out.println(e.getName() + " -> Pay: " + e.calculatePay());
        }

        // --- Task 3: SmartDevice interface ---
        SmartBulb bulb = new SmartBulb();
        bulb.turnOn();
        bulb.setBrightness(75);
        System.out.println(bulb.getStatus());

        SmartThermostat thermostat = new SmartThermostat();
        thermostat.turnOn();
        thermostat.setTemperature(24.5);
        System.out.println(thermostat.getStatus());
    }
}