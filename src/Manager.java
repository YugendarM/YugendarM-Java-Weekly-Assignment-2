import java.util.Scanner;

public class Manager extends Member{
    String specialization;
    String dept;

    public void printManager(){
        System.out.println("Manager Specialization:"+specialization);
        System.out.println("Manager Department:"+dept);
    }
}
