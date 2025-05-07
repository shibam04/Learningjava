package ex20_Constructors;

public class Prog1_Person
{
    public static void main(String[] args)
    {
        Person p1=new Person();
        Person p2=new Person("Shibam",29,"Siliguri", 8767648753L,true);
        p2.printDetails();
        p1.eat();
        p1.walk();
        p1.doHome();
        p1.sleep();
    }


}

class Person
{
    String name;
    int age;
    String address;
    long phone;
    boolean isMale;

    //Default Constructor

    Person()
    {
        System.out.println("Sharing the User Details");
    }

    //Parameterized Constructor

    Person(String name1,int age,String Address,long Phone,boolean Male)
    {
        this.name=name1;
        this.age=age;
        this.address=Address;
        this.phone=Phone;
        this.isMale=Male;

    }
    void printDetails()
    {
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
        System.out.println("Address:"+address);
        System.out.println("Phone Number:"+phone);
        if(isMale)
        {
            System.out.println("Male");
        }

    }

    void sleep()
    {
        System.out.println("Sleeps Around 12am");
    }
    void eat()
    {
        System.out.println("Eats Around 10 pm");
    }
    void walk()
    {
        System.out.println("Walk Around 9pm");
    }
    void doHome()
    {
        System.out.println("Does All Task");
    }

}
