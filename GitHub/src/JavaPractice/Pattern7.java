package JavaPractice;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		while(row<=n) {
			
			//work
			int col = 1;
			while(col<=n) {
				if(row==1||row==n||col==1||col==n) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				col=col+1;
			}
			System.out.println();
			row=row+1;
		}

	}

}
