interface compute{
    double convert(double value);
}

class eurToinr implements compute{
    public double convert(double eur){
        return eur *90;
    }
}
class gbTob implements compute{
    public double convert(double gb){
        return gb*102478493;
    }
}

class prog91{
    public static void main(String[] args) {
        compute EURtoINR = new eurToinr();
        compute GBtoBYTES = new gbTob();

        System.out.println("euro in rupee is  : " + EURtoINR.convert(20));
        System.out.println("gb in bytes is  : " + GBtoBYTES.convert(5));
    }
}

