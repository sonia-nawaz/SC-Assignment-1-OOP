# SC-Assignment-1-OOP

Assignment 01 for Software Construction (Instructor: Engr. Rizwan Shah) — demonstrates four core OOP pillars in Java: Encapsulation, Inheritance, Polymorphism, and Abstraction, through four independent tasks.

## Author
Sonia Nawaz — UET Abbottabad Campus, Department of Software Engineering, 5th Semester

## Contents

### Task 1 — Encapsulation (`DigitalWallet.java`)
A digital wallet class refactored from a poorly designed, fully-public class into a properly encapsulated one.

**Business rules enforced:**
- All fields (`accountHolder`, `balance`, `pinCode`) are `private`
- `balance` can never go negative — validated both in the constructor and in `withdraw()`
- `pinCode` is set once, only through the constructor — no getter or setter exists for it afterward
- `withdraw(double amount, String enteredPin)` only processes a transaction if the entered PIN matches and sufficient funds are available; returns `true`/`false` accordingly

**Why it matters:** without encapsulation, any part of the program could directly overwrite `balance` or `pinCode` with no validation — a real risk in a financial application.

### Task 2 — Inheritance & Polymorphism (`Employee.java`, `Developer.java`, `SalesManager.java`)
- `Employee` — base class with `name`, `baseSalary`, and `calculatePay()`
- `Developer extends Employee` — adds `techAllowance`, overrides `calculatePay()` to include it
- `SalesManager extends Employee` — adds `totalSales` and a commission rate, overrides `calculatePay()` to compute commission-based pay
- `Main.java` builds a `List<Employee>` containing a mix of `Developer` and `SalesManager` objects and loops through it, calling `calculatePay()` on each — Java resolves the correct overridden method at runtime based on the actual object type (dynamic method dispatch / runtime polymorphism)

### Task 3 — Abstraction via Interfaces (`SmartDevice.java`, `SmartBulb.java`, `SmartThermostat.java`)
- `SmartDevice` — interface defining the contract: `turnOn()`, `turnOff()`, `getStatus()`
- `SmartBulb implements SmartDevice` — adds a unique `setBrightness(int level)` method
- `SmartThermostat implements SmartDevice` — adds a unique `setTemperature(double temp)` method

**Why an interface instead of a base class:** it forces every implementing class to guarantee the same core behavior while allowing completely unrelated classes (a bulb and a thermostat share no common state) to still be treated interchangeably as `SmartDevice` — a form of loose coupling a shared parent class wouldn't offer as cleanly.

### Task 4 — AI Code Review (Meta-Learning)
An AI was prompted with the exact instruction: *"Write a Java program for a simple Library System using OOP. Include classes for Book and Member."* The output was analyzed for one OOP strength and one design flaw, and the flawed class/method was rewritten. Full write-up, original AI snippet, critique, and fix are in the PDF report — not included as runnable code in this repo.

## How to Run
All Task 1–3 demonstrations are wired into a single `Main.java`. Compile and run it to see console output for every task in sequence.

## Structure
