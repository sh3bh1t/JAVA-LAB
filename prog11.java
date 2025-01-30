
import java.util.Scanner;

class prog11{

    static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }

    static void bubblesort(int arr[],boolean ascending){
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length-i-1;j++){
                if((ascending && arr[j]>arr[j+1]) || (!ascending && arr[j]<arr[j+1]) ){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        printarr(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the coefficients a,b,c");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float disc= (b*b)-4*a*c;
        float root1 = (float) ((-b + Math.sqrt(disc))/2*a);
        float root2 = (float) ((-b - Math.sqrt(disc))/2*a);
        System.out.println("the roots are  : " + root1 + " , " + root2);
        

        int arr[]={9,8,3,4,10,15,6,7};
        bubblesort(arr,true);
        bubblesort(arr,false);

    }
}