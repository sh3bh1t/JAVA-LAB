abstract class bank{
    String name, accno;
    float balance;

    public bank(String name, String accno , float balance){
        this.name=name;
        this.accno=accno;
        this.balance=balance;
    }

    abstract void interest() ;

    void display(){
        System.out.println("\nname : " + name + "\n accno : " + accno + "\n balance : " + balance);
    }
}

class citibank1 extends bank{
     public citibank1(String name, String accno , float balance){
        super(name, accno, balance);
     }

     @Override
     void interest(){
        System.out.println("the interest is  : " + balance * 0.06);
     }

     void display(){
        super.display();
     }
}

class canara1 extends bank{
    public canara1(String name, String accno, float balance){
        super(name, accno, balance);
    }
    @Override
    void interest(){
        System.out.println("the interest is : " + balance*0.08);
    }
    void display(){
        super.display();
    }
}

class prog61{
    public static void main(String[] args) {
        bank[] banks=new bank[]{
            new canara1("raj", "54625", 90000),
            new citibank1("mohan", "6526272", 907302)
        };

        for(bank bank:banks){
            bank.display();
            bank.interest();
        }
    }
}