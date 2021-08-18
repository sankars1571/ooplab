public class Complex {
	double Real;
    double img;
    Complex(){
        Real=0.0;
        img=0.0;
    }
    Complex(double real){
        Real=real;
        img=0.0;
    }
    Complex(double real,double imaginary){
        Real=real;
        img=imaginary;
    }
    Complex plus(Complex c){
        Complex sum=new Complex(Real+c.Real,img+c.img);
        return sum;
    }
    void getcomplex(){
        System.out.print("( "+Real+"+"+img+"i )");
    }

}

import java.util.Scanner;

public class ComplexSum {public static void main(String[] args) {
    double real,imaginary;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the 1st complex number (real, img ): ");
    real=s.nextDouble();
    imaginary=s.nextDouble();
    Complex c1=new Complex(real,imaginary);
    System.out.println("Enter the 2nd complex number (real, img :) ");
    real=s.nextDouble();
    imaginary=s.nextDouble();
    Complex c2=new Complex(real,imaginary);
    Complex sum=new Complex();
    sum=c1.plus(c2);
    System.out.println("Sum of Complex Numbers is : ");
    c1.getcomplex();
    System.out.print(" + ");
    c2.getcomplex();
    System.out.print(" = ");
    sum.getcomplex();
}

}