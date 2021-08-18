import java.util.*;
class Person{
String Name;
String Gender;
String Address;
int Age;
Person(String name,String gender,String address,int age){
Name=name;
Gender=gender;
Address=address;
Age=age;
}
}
class Employee extends Person{
    String Empid;
    String Companyname;
    String Qualification;
    double Salary;
    Employee(String name,String gender,String address,int age,String empid,String companyname,String qualification,double salary){
        super(name, gender, address, age);
        Empid=empid;
        Companyname=companyname;
        Qualification=qualification;
        Salary=salary;
    }
}
class Teacher extends Employee{
    String Subject;
    String Department;
    String Teacherid;
    Teacher(String name,String gender,String address,int age,String empid,String companyname,String qualification,double salary,String subject,String department,String teacherid){
        super(name, gender, address, age, empid, companyname, qualification, salary);
        Subject=subject;
        Department=department;
        Teacherid=teacherid;
    }

void display()
{
System.out.println("Name:  "+Name);
System.out.println("Gender:  "+Gender);
System.out.println("Address:  "+Address);
System.out.println("Age:  "+Age);
System.out.println("Employee id:  "+Empid);
System.out.println("Company name:  "+Companyname);
System.out.println("Qualification:  "+Qualification);
System.out.println("Salary:  "+Salary);
System.out.println("Subject: "+Subject);
System.out.println("Department:  "+Department);
System.out.println("Teacher Id:  "+Teacherid);
}
}

class j2_inheritance
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name,gen,addrs,emid,cname,qual,sub,dept,trid,temp;
int age,N;
double sal;
Teacher t[]=new Teacher[10];
System.out.println("Enter the no of teachers: ");
N=sc.nextInt();
temp=sc.nextLine();
for(int i=0;i<N;i++)
{
int m=i+1;
System.out.println("Enter the details of Teacher:"+m);
            System.out.println();
            System.out.println("Enter the Name :");
            name=sc.nextLine();
            System.out.println("Enter the Gender :");
            gen=sc.nextLine();
            System.out.println("Enter the Address :");
            addrs=sc.nextLine();
            System.out.println("Enter the Age :");
            age=sc.nextInt();
            temp=sc.nextLine();
            System.out.println("Enter the Employee ID :");
            emid=sc.nextLine();
            System.out.println("Enter the Company Name :");
            cname=sc.nextLine();
            System.out.println("Enter the Qualification :");
            qual=sc.nextLine();
            System.out.println("Enter the Salary :");
            sal=sc.nextDouble();
            temp=sc.nextLine();
            System.out.println("Enter the Subject :");
            sub=sc.nextLine();
            System.out.println("Enter the Department :");
            dept=sc.nextLine();
            System.out.println("Enter the Teacher ID :");
            trid=sc.nextLine();
            System.out.println();

t[i]=new Teacher(name,gen,addrs,age,emid,cname,qual,sal,sub,dept,trid);
}
for(int i=0;i<N;i++)
{
int m=i+1;
System.out.println();
System.out.println("Teacher Details"+m);
t[i].display();
System.out.println();
}

sc.close();

}
}
