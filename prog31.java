class complex{
    double real,imaginary;

    public complex(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public complex add(complex other){
        return new complex(this.real+other.real,this.imaginary+other.imaginary);
    }

    public complex subtract(complex other){
        return new complex(this.real-other.real , this.imaginary-other.imaginary);
    }

    public boolean equals(complex other){
        return this.real==other.real && this.imaginary==other.imaginary;
    }

    @Override
    public String toString(){
        return real + " + " + imaginary + "i" ;
    }
}

class prog31{
    public static void main(String[] args) {
        complex c1= new complex(5,3 );
        complex c2=new complex(8, 7);

        complex sum=c1.add(c2);
        complex difference=c1.subtract(c2);
        boolean equals=c1.equals(c2);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(equals);
    }
}