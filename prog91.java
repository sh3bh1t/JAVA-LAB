interface compute{
    double convert(double value);
}

class gbTObytes1 implements compute{
    @Override
    public double convert(double value){
        return value*102478493;
    }
}

class eurTOinr1 implements compute{
    @Override
    public double convert(double value){
        return value*90;
    }
}

class prog91{
    public static void main(String[] args) {
        compute eTi = new eurTOinr1();
        compute gTb = new gbTObytes1();

        System.out.println("euro in rupees is : " + eTi.convert(20));
        System.out.println("gb in bytes is : " + gTb.convert(5));
    }
}