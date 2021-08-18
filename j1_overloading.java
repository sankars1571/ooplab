import java.util.*;
class overload
{
    void area(int a)
    {
        System.out.println("Area of the square: "+a*a+" sq units");
    }
    void area(double l, double b)
    {
        System.out.println("Area of the rectangle: "+l*b+" sq units");
    }
    void area(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area+" sq units");
    }
}
class j1_overloading
{
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
        overload o = new overload();
	int a;
	double x,y;
	double r;
	System.out.println("Enter length of square: ");
	a=sc.nextInt();
	o.area(a);

	System.out.println("Enter length and breadth of rectangle: ");
	x=sc.nextDouble();
	y=sc.nextDouble();
	o.area(x,y);

	System.out.println("Enter radius of circle: ");
	r=sc.nextDouble();
	o.area(r);
	sc.close();
    }
}
