public class Product {
	int pcode;
    String pname;
    int price;

    void setdata(int code,String name,int prc ){
        pcode=code;
        pname=name;
        price=prc;       
    }
    void getdata(){
        System.out.print("Product name : "+pname);
        System.out.println("Product code : "+pcode);
        System.out.println("Product price : "+price);
    }
    void lowprice(Product p1,Product p2)
    {

        if(price<=p1.price && price<=p2.price)
            System.out.println(price+" has the smallest price");  
        else if (p1.price<=price && p1.price<=p2.price)  
            System.out.println(p1.price+" has the smallest price");  
        else  
         
            System.out.println(p2.price+" has the smallest price");  
    }
}

import java.util.Scanner;

public class Main {public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
    int code,price;
    
    String name;
    Product prod1=new Product();
    Product prod2=new Product();
    Product prod3=new Product();
    System.out.println("Enter the details of 1st product : ");
    System.out.println("Enter  Product name : ");
    name=sc.nextLine();
    System.out.println("Enter the Product code : ");
    code=sc.nextInt();
    System.out.println("Enter the Product price : ");
    price=sc.nextInt();
    prod1.setdata(code, name, price);

    System.out.println("Enter the details of 2nd product : ");
    sc.nextLine();
    System.out.print("Enter the Product name : ");
    name=sc.nextLine();
    System.out.println("Enter the Product code : ");
    code=sc.nextInt();
    System.out.println("Enter the Product price : ");
    price=sc.nextInt();
    prod2.setdata(code, name, price);

    System.out.println("Enter the details of 3rd product : ");
    sc.nextLine();
    System.out.print("Enter the Product name : ");
    name=sc.nextLine();
    System.out.println("Enter the Product code : ");
    code=sc.nextInt();
    System.out.println("Enter the Product price : ");
    price=sc.nextInt();
    prod3.setdata(code, name, price);

    System.out.println("Product 1 ");
    prod1.getdata();
    System.out.println("Product 2 ");
    prod2.getdata();
    System.out.println("Product 3 ");
    prod3.getdata();

    prod1.lowprice(prod2, prod3);

}

}