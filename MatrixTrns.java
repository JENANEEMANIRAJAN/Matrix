package matrixTrans;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTrns {

	public static int[][]mat(int arr[][], int a, int b) {
	
		int sum = 0; 
		for(int i=0; i<a; i++) {
			{
		for ( int j=0; j<b; j++) {
			if(i<j) 
			sum = arr[i][j];
			arr[i][j] = arr[j][i];
			arr[j][i] = sum;
		}
		
			}
		}
		return arr;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int arr[][] = new int[a][b];
	for(int i=0; i<a; i++) {
		for (int j=0; j<b; j++) {
			
		arr[i][j] = sc.nextInt();
		
		}
		
	}
	int val[][] = mat(arr, a, b);
	for(int []val1 : val) {
			System.out.println(Arrays.toString(val1));

	}
	}
}
