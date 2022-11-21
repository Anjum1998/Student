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
                case 2:
                    System.out.println("Display Student Details");
                    for(stud student : arr)
                    {
                        System.out.println(student.name);
                        System.out.println(student.rollNo);
                        System.out.println(student.admissionNo);
                        System.out.println(student.college);
                    }
                    break;
                case 3:
                    System.out.println("Enter the Admission No");
                    String ad=sc.next();
                    for(stud st : arr)
                    {
                       if(st.admissionNo.equals(ad))
                       {
                           System.out.println("Student Found");
                           System.out.println(st.name);
                           System.out.println(st.rollNo);
                           System.out.println(st.admissionNo);
                           System.out.println(st.college);
                           break;
                       }
                       else {
                           System.out.println("student not found");
                       }
                    }
                    break;
                case 4:
                    System.out.println("Enter the Admission No");
                    String a=sc.next();
                    for(stud s1 : arr)
                    {
                       // if(s1.admissionNo.equals(a))
                        if(a.equals(s1.admissionNo))
                        {
                            arr.remove(s1);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("invalid choice");
            }
        }

    }
}
