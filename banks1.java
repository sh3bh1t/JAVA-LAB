abstract class bank{
    String name,accnum;
    float balance;

    bank(String name, String accnum , float balance){
        this.name=name;
        this.accnum=accnum;
        this.balance=balance;
    }

    abstract void calculateInterest();

    void display(){
        System.out.println("Name : " + name + "accnum: " +accnum + "balance : " + balance);
    }
}

class citibank extends bank {
    citibank(String name, String accnum , float balance){
        super(name, accnum, balance);
    }

    void calculateInterest(){
        System.out.println("the interest  is : " + balance *0.08);
    }
}
class canarabank extends bank {
    canarabank(String name, String accnum , float balance){
        super(name, accnum, balance);
    }

    void calculateInterest(){
        System.out.println("the interest  is : " + balance *0.06);
    }
}
class sbibank extends bank {
    sbibank(String name, String accnum , float balance){
        super(name, accnum, balance);
    }

    void calculateInterest(){
        System.out.println("the interest  is : " + balance *0.08);
    }
}

public class banks1{
    public static void main(String[] args) {
        bank[] banks ={
            new citibank("joseph","2343242",6000),
            new sbibank("stalin","67873",70000)
        };

        for ( bank bank:banks){
            bank.display();
            bank.calculateInterest();
        }
    }
}