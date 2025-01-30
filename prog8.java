
import java.util.Scanner;

class prog8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int numerator,denominator;
            System.out.println("enter numerator");
            numerator=sc.nextInt();
            System.out.println("enter denominator");
            denominator=sc.nextInt();
            if(numerator<=0)throw new IllegalArgumentException("input numerator cant be less than 0");
            if(denominator<=0) throw  new ArithmeticException("cant divide by less than 0");
            System.out.println("result  : " + numerator/denominator);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}