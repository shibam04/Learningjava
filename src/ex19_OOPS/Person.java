package ex19_OOPS;

import java.util.Scanner;

public class Person
{
    public static void main(String[] args)
    {
        Behaviour b=new Behaviour();
        String Firstname=b.FirstName();
        System.out.println("First Name:"+Firstname);
        String Lastname=b.LastName();
        System.out.println("Last Name:"+Lastname);
        int age=b.Age();
        System.out.println("Age"+age);
        System.out.println("Gender:"+b.gender);
        System.out.println("Home Address:"+b.Address);
        System.out.println("Office Address:"+b.Office_Address);
        float Salary=b.Salary();
        System.out.println("Salary:"+Salary);
        System.out.println("Qualifications:"+b.Qualification);
        System.out.println("Designation:"+b.Designation);
        System.out.println("Years of Experience:"+b.experience);

    }

}
class Behaviour
{
    String First_Name;
    String Last_Name;
    int age;
    char gender='M';
    String Address="Siliguri";
    String Office_Address="Pune";
    float salary;
    String Qualification="BE ENGINEER";
    String Designation="QA ENGINEER";
    double experience=4.0;
    Scanner sc=new Scanner(System.in);

    String FirstName()
    {
        System.out.print("Enter First Name:");
        String First_Name = sc.next();
        return First_Name;

    }

    String LastName()
    {
        System.out.print("Enter Last Name:");
        String Last_Name = sc.next();
        return Last_Name;

    }

    int Age()
    {
        System.out.print("Enter Age:");
        int age=sc.nextInt();
        return age;
    }

    float Salary()
    {
        System.out.print("Enter Salary:");
        float salary=sc.nextFloat();
        return salary;
    }



}
