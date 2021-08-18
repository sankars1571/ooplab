public class Rectangle {
	float length,breadth;
	void setData(float l,float b)
	{
		length=l;
		breadth=b;
	}
void getArea()
{
	
	float area=length*breadth;
	System.out.println("Area="+area);
}
}


public class RectangleArea {public static void main(String args[])
{
Rectangle r1=new Rectangle();
r1.setData(12.4f,13f);
r1.getArea();
r1.setData(10.5f,9f);
r1.getArea();
r1.setData(13f,14f);
r1.getArea();
}

}
