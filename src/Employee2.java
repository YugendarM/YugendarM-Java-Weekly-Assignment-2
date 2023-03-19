import java.util.Scanner;

public class Employee2 {
    String name;
    int year;
    String addr;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of the employee:");
         name = sc.next();
        System.out.print("Enter Year of joining:");
         year = sc.nextInt();
        System.out.print("Enter Address:");
         addr = sc.next();

    }


}
