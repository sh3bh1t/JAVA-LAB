interface compute1{
    void convert();
}

class eurotoINR implements compute1{
    double euro;

    public eurotoINR(double euro) {
        this.euro=euro;
    }
    public void convert(){
        System.out.println(euro + "euro = " + euro * 90 + "rupees");
    }
}

class gbtobytes implements compute1{
    double gb ;
    public gbtobytes(double gb){
        this.gb=gb;
    }
    public void convert(){
        System.out.println(gb + "gb = " + gb *10000000 + "bytes");
    }
}

class conversion1{
    public static void main(String[] args) {
        compute1 gbtoby = new gbtobytes(4);
        compute1 eurotorupee = new eurotoINR(90);

        gbtoby.convert();
        eurotorupee.convert();
    }
}