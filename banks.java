abstract class Bank {
    String name, accountNumber;
    double balance;

    Bank(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void calculateInterest();

    void display() {
        System.out.println("Name: " + name + ", Account: " + accountNumber + ", Balance: " + balance);
    }
}

class CityBank extends Bank {
    CityBank(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("CityBank Interest: " + balance * 0.06);
    }
}

class SBIBank extends Bank {
    SBIBank(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("SBIBank Interest: " + balance * 0.05);
    }
}

class CanaraBank extends Bank {
    CanaraBank(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("CanaraBank Interest: " + balance * 0.04);
    }
}

public class banks {
    public static void main(String[] args) {
        Bank[] banks = {
            new CityBank("Alice", "CB123", 10000),
            new SBIBank("Bob", "SBI456", 15000),
            new CanaraBank("Charlie", "CB789", 20000)
        };

        for (Bank bank : banks) {
            bank.display();
            bank.calculateInterest();
        }
    }
}
