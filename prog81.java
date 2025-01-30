
import java.util.Scanner;

class prog81{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            int numerator,denominator;
            System.out.println("Enter the numerator :");
            numerator=sc.nextInt();
            System.out.println("enter the denominator : ");
            denominator=sc.nextInt();
            if(numerator <0 ) throw new IllegalArgumentException("cant divide negative numbers");
            if(denominator==0) throw  new ArithmeticException("cant divide by zero");
            int result = numerator/denominator;
            System.out.println("the result is  : " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}