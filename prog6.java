abstract class bank{
    String name, accno;
    float balance;

    bank(String name, String accno, float balance){
        this.name=name;
        this.accno=accno;
        this.balance=balance;
    }

    abstract void calculateInterest();

    void display(){
        System.out.println("\n----------\n name" + name + "\n accno : " + accno + "\n balance : " + balance);
    }
}

class citibank extends bank{
    citibank(String name, String accno , float balance){
        super(name, accno, balance);
    }
    @Override
    void  calculateInterest(){
        System.out.println("the interest is  : " + balance * 0.06);
    }

    void display(){
        super.display();
    }
}
class canara extends bank{
    canara(String name, String accno , float balance){
        super(name, accno, balance);
    }
    @Override
    void  calculateInterest(){
        System.out.println("the interest is  : " + balance * 0.08);
    }

    void display(){
        super.display();
    }
}

class prog6{
    public static void main(String[] args) {
        bank[] banks= {
            new citibank("abhiman","5523434",98000),
            new canara("shyan","989833",80000)
        };

        for(bank bank:banks){
            bank.display();
            bank.calculateInterest();
        }

    }
}