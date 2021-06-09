import java.util.Scanner;

public class Symmetricorantisymetric {
	public static void main(String ar[]) {

	Scanner s=new Scanner(System.in);
	System.out.println("enter the rows and columns");
	int m=s.nextInt();
	int n=s.nextInt();
	
	int a[][]=new int[m][n];
	
	
	System.out.println("enter the values");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) { 
			a[i][j]=s.nextInt();
			}
	}
	System.out.println("the matrix is");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) { 
			System.out.print(a[i][j]+"\t");
			}System.out.println();
	 }
	
	