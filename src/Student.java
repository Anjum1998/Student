import java.util.ArrayList;
import java.util.Scanner;

class stud
{
    String name;
    int rollNo;
    String admissionNo;
    String college;

    public stud(String name, int rollNo, String admissionNo, String college) {
        this.name = name;
        this.rollNo = rollNo;
        this.admissionNo = admissionNo;
        this.college = college;
    }
}
public class Student {
    public static void main(String[] args) {
        ArrayList<stud> arr=new ArrayList<stud>();
        while(true)
        {
            System.out.println("Select an option \n 1.Add Student \n 2.View Student \n 3.Search Student \n 4.Delete student \n 5.Exit");
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter the Name");
                    String name=sc.next();
                    System.out.println("Enter the RollNo");
                    int rollNo= sc.nextInt();
                    System.out.println("Enter the Admission No");
                    String AdNo=sc.next();
                    System.out.println("Enter the college");
                    String college= sc.next();
                    stud s=new stud(name,rollNo,AdNo,college);
                    arr.add(s);
                    break;
            }
        }

    }
}
