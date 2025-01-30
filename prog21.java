
import java.util.Scanner;

class Employee{
    String name,dept,designation;
    int age,id;
    float salary;

    Employee(String name,String dept, String designation , int age , int id, float salary){
        this.name=name;
        this.dept=dept;
        this.designation=designation;
        this.age=age;
        this.id=id;
        this.salary=salary;
    }

    void display(){
        System.out.println("\n name : " + name + "\n dept : " + dept + "\n designation : " + designation + "\n age : " + age + "\n id : " +id + "\n salary : " + salary );
    }
}

class prog21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees= new Employee[5];
        System.out.println("Enter the employee details : ");
        for(int i=0;i<5;i++){
            String name = sc.nextLine();
            String dept = sc.nextLine();
            String designation = sc.nextLine();
            int age=sc.nextInt();
            sc.nextLine();
            int id=sc.nextInt();
            sc.nextLine();
            float salary=sc.nextFloat();
            sc.nextLine();
            employees[i]= new Employee(name, dept, designation, age, id,salary);
        }

        for(Employee emp:employees){
            System.out.println("-----------------------");
            emp.display();
        }

        float salesSalary =0;
        Employee highestpaidmanager = null;

        for(Employee emp:employees){
            if(emp.dept.equalsIgnoreCase("sales")){
                salesSalary+=emp.salary;
            }
            if(emp.dept.equalsIgnoreCase("purchase") && emp.designation.equalsIgnoreCase("manager")){
                if(highestpaidmanager==null || emp.salary > highestpaidmanager.salary){
                    highestpaidmanager=emp;
                }
            }
        }

        System.out.println("\n--------------------\n sales deot salary is : " +  salesSalary);
        System.out.println("\n----------------------\n highest paid manager is : \n");
        highestpaidmanager.display();

    }
}