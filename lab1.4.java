import java.util.Scanner;

public class MatrixAddition {public static void main(String ar[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the rows and columns of matrix");
	int m=s.nextInt();
	int n=s.nextInt();
	int a[][]=new int[m][n];
	int b[][]=new int[m][n];
	int c[][]=new int[m][n];
	
	System.out.println("enter the elements of a");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) { 
			a[i][j]=s.nextInt();
			}
			
			
			}
			
		
		
			
			
	System.out.println("enter the elements of b");	
	for(int i=0;i<m;i++) 
		for(int j=0;j<n;j++) {   
			b[i][j]=s.nextInt();
		        
			
		
	}
			
			
		
	
	
	
	
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++) {
			
			c[i][j]=a[i][j]+b[i][j];
			
			
			
			
			}
			
	
	System.out.println("first matrix is");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) { 
			
			System.out.print(a[i][j]+ "\t");
			}System.out.println();
	}
	System.out.println("second matrix is");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) { 
				
				System.out.print(b[i][j]+ "\t");
				} System.out.println();
	}
	System.out.println("sum of matrix is");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) { 
			
			System.out.print(c[i][j]+ "\t");
			}System.out.println();
	}
	
					
					
		
}
	
	
	
	
	
	
	
}
