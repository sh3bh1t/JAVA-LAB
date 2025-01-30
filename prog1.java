import  java.util.*;
public class prog1{

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void bubblesort(int arr[], boolean ascending){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if((ascending && arr[j]>arr[j+1]) || (!ascending && arr[j]<arr[j+1])){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarr(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the eqn coeffs a,b,c : ");
        double a=sc.nextDouble() , b=sc.nextDouble() , c=sc.nextDouble();
        double disc = ((b*b)-(4*a*c));
        
        double root1 = ((-b)+Math.sqrt(disc))/2*a; 
        double root2 = ((-b)-Math.sqrt(disc))/2*a; 

        System.out.println("the roots are : " + root1 + " , " + root2);

        int[] arr1={8,1,4,9,15,5};
        bubblesort(arr1,true);
        System.out.println("");
        bubblesort(arr1,false);

    }
}