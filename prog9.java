interface compute{
    double convert(double value);
}

class EURtoRupee implements compute{
    public double convert(double value){
        return value*90;
    }
}
class GBtoBytes implements compute{
    public double convert(double value){
        return value*10000000;
    }
}

class prog9{
    public static void main(String[] args) {
        compute eurtorup = new EURtoRupee();
        compute gbtob = new GBtoBytes();

        System.out.println("euro to rupee is : " + eurtorup.convert(10));
        System.out.println("gb to bytes  is : " + gbtob.convert(30));
    }
}