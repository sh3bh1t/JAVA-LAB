
import java.util.Scanner;

class person{
    String name , gender;
    int age;

    public person(String name, String gender , int age) {
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    void display(){
        System.out.println("\n name : " + name + "\n gender : " + gender + "\n age : " + age);
    }
}

class employee extends person{
    String dept;
    float salary;
    public employee(String name, String gender , int age, String dept , float salary){
        super(name, gender, age);
        this.dept=dept;
        this.salary=salary;
    }
    void display(){
        super.display();
        System.out.println("\n dept : " + dept + "\n salary : " + salary);
    }
}

class student extends person{
    String grade;
    public student(String name, String gender , int age, String grade ){
        super(name, gender, age);
        this.grade=grade;    }
    void display(){
        super.display();
        System.out.println("\n grade : " + grade);
    }
}

public class prog4{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        employee[] employees= new employee[3];
        student[] students = new student[3];

        System.out.println("\nenter student details : \n");
        for(int i=0;i<3;i++){
            String name = sc.nextLine();
            String gender=sc.nextLine();
            int age= sc.nextInt();
            sc.nextLine();
            String grade=sc.nextLine();
            students[i] = new student(name, gender, age, grade);
        }
        System.out.println("\n -------------------------- \n enter employee details : \n");
        for(int i=0;i<3;i++){
            String name = sc.nextLine();
            String gender=sc.nextLine();
            int age= sc.nextInt();
            sc.nextLine();
            String dept=sc.nextLine();
            float salary=sc.nextFloat();
            sc.nextLine();
            employees[i] = new employee(name, gender, age, dept,salary);
        }

        System.err.println("----------------------------------");
        for(employee emp:employees){
            emp.display();
        }
        System.out.println("-------------------------------------");
        for(student stud:students){
            stud.display();
        }
    }
}

