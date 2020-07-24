import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// *---( Define variables )---*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please provide Matrix lengh (line x columns): ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Please provide Matrix contents: ");
		for (int i=0 ; i<mat.length ; i++) {
			System.out.print("Line " + i + ": ");
			for (int j=0 ; j<mat[i].length ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.print("Please provide a number: ");
		int x = sc.nextInt();
		
		
		for (int i=0 ; i<mat.length ; i++) {
			for (int j=0 ; j<mat[i].length ; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position: " + i + "," + j);
					
					if (i>0) System.out.println("Up: " + mat[i-1][j]);
					if (j>0) System.out.println("Left: " + mat[i][j-1]);
					if (j<mat[i].length-1) System.out.println("Right: " + mat[i][j+1]);
					if (i<mat.length-1) System.out.println("Down: " + mat[i+1][j]);
				}
			}
		}
		
		sc.close();
		
	}

}
