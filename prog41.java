
import java.util.Scanner;

class person{
    String name,gender;
    int age;

    public person(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    void display(){
        System.out.println("\n name : " + name + "\n gender : " + gender + "\n age : " + age);
    }
}

class employee1 extends person{
    String designation;
    float salary;

    public employee1(String name, String gender , int age ,String designation , float salary){
        super(name, gender, age);
        this.designation=designation;
        this.salary=salary;
    }

    void display(){
        super.display();
        System.out.println("\n designation : " + designation + "\n salary : " + salary );
    }
}

class student1 extends person{
    String grade;

    public student1(String name, String gender , int age , String grade){
        super(name,gender,age);
        this.grade=grade;
    }

    void display(){
        super.display();
        System.out.println("\n grade : " + grade);
    }
}

class prog41{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        employee1[] employees = new employee1[3];
        student1[] students= new student1[3];
        System.out.println("enter employee details -------------------------------------------");
        for(int i=0;i<3;i++){
            System.out.println("enter details for employee " +  i+1);
            String name=sc.nextLine();
            String gender=sc.nextLine();
            int age=sc.nextInt();
            sc.nextLine();
            String designation= sc.nextLine();
            float salary=sc.nextFloat();
            sc.nextLine();
            employees[i] = new employee1(name, gender, age, designation, salary);
        }
        System.out.println("enter student details -------------------------------------------");
        for(int i=0;i<3;i++){
            System.out.println("enter details for student " +  i+1);
            String name=sc.nextLine();
            String gender=sc.nextLine();
            int age=sc.nextInt();
            sc.nextLine();
            String grade= sc.nextLine();
            students[i] = new student1(name, gender, age, grade);
        }

        System.out.println("Student details --------------------------");
        for(student1 stud:students){
            stud.display();
            System.out.println("----------------");
        }

        System.out.println("Employee Details ------------------------------");
        for(employee1 emp:employees){
            emp.display();
            System.out.println("------------------");
        }
    }
}