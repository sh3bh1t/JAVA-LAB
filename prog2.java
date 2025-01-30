
import java.util.Scanner;

class employee{
    String name , dept , designation;
    int id,age;
    float salary;

    employee(String name, String dept, String designation , int id , int age , float salary){
        this.name=name;
        this.dept=dept;
        this.designation=designation;
        this.id=id;
        this.age=age;
        this.salary=salary;
    }

    void display(){
        System.out.println("name : " + name + "\n dept : " + dept + "\n designation : " + designation + "\n id : " + id + "\n age: " + age + "\n salary : " + salary + "\n --------------------------- \n" );
    }
}

public class prog2{
    public static void main(String[] args) {
        employee[] emp= new employee[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter empoyee details : \n");
        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            String dept = sc.nextLine();
            String designation = sc.nextLine();
            int id = sc.nextInt();
            int age = sc.nextInt();
            float salary= sc.nextFloat();
            sc.nextLine();
            emp[i] = new employee(name, dept, designation, id,age,salary);
        }

        for(employee employee:emp){
            employee.display();
        }

        float salesSal=0;
        employee highestpaidmanager = null;

        for(employee employee:emp){
            if(employee.dept.equalsIgnoreCase("sales")){
                salesSal += employee.salary;
            }
            
            if(employee.dept.equalsIgnoreCase("purchase") && employee.designation.equalsIgnoreCase("manager") ){
                if(highestpaidmanager==null || employee.salary > highestpaidmanager.salary){
                    highestpaidmanager=employee;
                }
            }
        }
        System.out.println("\n ----------------------------------- \n sales dept salary is : " + salesSal);

        if(highestpaidmanager==null){
            System.out.println("no such manager");
        }else{
            System.out.println("\n ----------------------------------- \n highest paid manager is  : \n");
            highestpaidmanager.display();
        }

    }
}