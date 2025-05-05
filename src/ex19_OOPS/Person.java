package ex19_OOPS;

import java.util.Scanner;

public class Person
{
    public static void main(String[] args)
    {
        Behaviour b=new Behaviour();
        System.out.println("First Name:"+b.First_Name);
        String Lastname=b.LastName();
        System.out.println("Last Name:"+Lastname);
        b.Age(29);
        System.out.println("Gender:"+b.gender);
        System.out.println("Home Address:"+b.Address);
        System.out.println("Office Address:"+b.Office_Address);
        double Salary=b.Salary(50000.00);
        System.out.println("Salary:"+Salary);
        System.out.println("Qualifications:"+b.Qualification);
        System.out.println("Designation:"+b.Designation);
        System.out.println("Years of Experience:"+b.experience);

    }

}
class Behaviour
{
    String First_Name="Shibam";
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

    //Without Parameters and Without Return Type
    void FirstName()
    {
        System.out.println("First Name:"+First_Name);
    }

    //Without Parameters but Return Type
    String LastName()
    {
        System.out.print("Enter Last Name:");
        String Last_Name = sc.next();
        return Last_Name;

    }

    //With Parameters and Without Return Type
    void Age(int age)
    {
        System.out.println("Age is:"+age);
    }

    //With Parameters and With Return Type
    double Salary(double salary)
    {
        double salary1=salary*2;
        return salary1;
    }



}
