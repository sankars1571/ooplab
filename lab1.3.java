import java.util.Scanner;

public class oddoreven {
public static void main(String arg[]) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter a no");
	int a=s.nextInt();

	
	if(a%2==0)
	{System.out.println("the no is even");
	
	}
	else {
		System.out.println("the no is oddd");
	}
	
}
}
