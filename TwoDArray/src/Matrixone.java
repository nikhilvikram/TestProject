//import java.util.Arrays;
import java.util.Scanner;

public class Matrixone {
	Scanner sc =new Scanner(System.in);
	 int arr[][]= new int [2][2];
	public int [][]  inputArray() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				arr[i][j]=sc.nextInt();
					
			}
		}
	return arr;
	}
	
	
	
	public int[][] adder(int a1[][],int a2 [][]){
		int a3[][]=new int [2][2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
              a3[i][j]=a1[i][j]+a2[i][j];
			}
			}
		return a3;
	}
	
	
	
	public void display(int a4[][]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(a4[i][j]+"  ");		
		}
		System.out.println();
	}
}
}
