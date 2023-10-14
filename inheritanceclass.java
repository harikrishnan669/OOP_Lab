class Employee
{
    String name;
    int age;
    int phonenumber;
    String address;
    double salary;
    
    void salary()
    {
        System.out.println("The salary is"+ salary);
    }
}
 class officer extends Employee
{
    String specilization;
    officer(String name,int age,int phonenumber,String address,double salary,String specilization)
    {
        this.name=name;
        this.age=age;
        this.phonenumber=phonenumber;
        this.address=address;
        this.salary=salary;
        this.specilization=specilization;
    }
    void printdetails()
    {
        System.out.println("Name"+ name);
        System.out.println("Age"+ age);
        System.out.println("Phonenumber"+ phonenumber);
        System.out.println("Address"+ address);
        System.out.println("salary"+ salary);
        System.out.println("Specilization"+ specilization);
    }
}
 class manager extends Employee
{
    String department;
    manager(String name,int age,int phonenumber,String address,double salary,String department)
    {
        this.name=name;
        this.age=age;
        this.phonenumber=phonenumber;
        this.address=address;
        this.salary=salary;
        this.department=department;
    }
    void printdetails()
    {
        System.out.println("Name"+ name);
        System.out.println("Age"+ age);
        System.out.println("Phonenumber"+ phonenumber);
        System.out.println("Address"+ address);
        System.out.println("salary"+ salary);
        System.out.println("Department"+ department);
    }
}
public class group
{
    public static void main(String args[])
    {
        officer office=new officer("hari",18,45434,"hari bhavan",10000,"Mtech");
        manager manage=new manager("hari",18,45434,"sreehari",10000,"CSE");
        office.printdetails();
        manage.printdetails();
    }
}
