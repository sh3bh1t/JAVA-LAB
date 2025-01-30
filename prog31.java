class Complex{
    double real,imaginary;

    public Complex(double real, double imaginary) {
        this.real=real;
        this.imaginary=imaginary;
    }

    public Complex add(Complex other){
        return new Complex(this.real+other.real , this.imaginary+other.imaginary);
    }
    public Complex subtract(Complex other){
        return new Complex(this.real-other.real , this.imaginary-other.imaginary);
    }

    public boolean equals(Complex other){
        return this.real==other.real && this.imaginary==other.imaginary;
    }
    
    @Override
    public String toString(){
        return real + " + " + imaginary+ "i";
    }
}

class prog31{
    public static void main(String[] args) {
        Complex c1=new Complex(5,3);
        Complex c2=new Complex(5,3);

        Complex sum= c1.add(c2);
        Complex difference= c1.subtract(c2);
        boolean equals = c1.equals(c2);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(equals);
    }
}