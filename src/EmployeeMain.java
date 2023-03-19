import java.util.Scanner;

public class EmployeeMain {
    public static void progm1()
    {

        Scanner sc = new Scanner(System.in);

        Manager man = new Manager();

        System.out.print("Enter Manager Name:");
        man.name = sc.next();
        System.out.print("Enter Manager Age:");
        man.age = sc.nextInt();
        System.out.print("Enter Manager Phone number:");
        man.phoneno = sc.nextLong();
        System.out.print("Enter Manager Address:");
        man.addr = sc.next();
        System.out.print("Enter Manager Salary:");
        man.sal = sc.nextInt();

        System.out.print("Enter Manager Specialization:");
        man.specialization = sc.next();
        System.out.print("Enter Manager Department:");
        man.dept = sc.next();


        System.out.println("Manager Details:----");
        System.out.println("Name\t\tAge\t\tPhone Number\tAddress\t\tSalary\t\tSpecialization\t\tDepartment");
        System.out.println(man.name+"\t"+man.age+"\t\t"+man.phoneno+"\t\t"+man.addr+"\t\t"+man.printSalary()+"\t\t\t"+man.specialization+"\t\t\t"+man.dept);


        System.out.println();
        System.out.println();


        Employee1 emp = new Employee1();

        System.out.print("Enter Employee Name:");
        emp.name = sc.next();
        System.out.print("Enter Employee Age:");
        emp.age = sc.nextInt();
        System.out.print("Enter Employee Phone number:");
        emp.phoneno = sc.nextLong();
        System.out.print("Enter Employee Address:");
        emp.addr = sc.next();
        System.out.print("Enter Employee Salary:");
        emp.sal = sc.nextInt();

        System.out.print("Enter Employee Specialization");
        emp.specialization = sc.next();
        System.out.print("Enter Employee Department");
        emp.dept = sc.next();

        System.out.println("Employee Details:----");
        System.out.println("Name\t\tAge\t\tPhone Number\tAddress\t\tSalary\t\tSpecialization\t\tDepartment");
        System.out.println(emp.name+"\t"+emp.age+"\t\t"+emp.phoneno+"\t\t"+emp.addr+"\t\t"+emp.printSalary()+"\t\t\t"+emp.specialization+"\t\t\t"+emp.dept);



    }
    public static void main(String[] args){
        progm1();
    }
}
