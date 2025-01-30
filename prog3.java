class Complex{

    private  double  real,imaginary;
    public Complex(double real , double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public Complex add(Complex other){
        return new Complex(this.real + other.real , this.imaginary +other.imaginary);
    }
    public Complex subtract(Complex other){
        return new Complex(this.real - other.real , this.imaginary - other.imaginary);
    }
    public boolean  equals(Complex other){
        return this.real == other.real && this.imaginary == other.imaginary;
    }
    @Override
    public String toString(){
        return  real + " + " + imaginary + "i";
    }
}

class prog3{
    public static void main(String[] args) {
        Complex c1 = new Complex(5,3);
        Complex c2 = new Complex(3,5);

        Complex sum = c1.add(c2);
        System.out.println("result of sum is  : " + sum);
        Complex difference = c1.subtract(c2);
        System.out.println("result of subtraction is  : " + difference);
        boolean equals  = c1.equals(c2);
        System.out.println("result of equals is  : " + equals);
    }
}