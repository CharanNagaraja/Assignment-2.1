import java.util.Scanner;

public class xpattern {

	private static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		    keyboard = new Scanner (System.in);
		    System.out.println(" Please type a number grater than 2 :");
		    int num=keyboard.nextInt();
		    drawCross(num);

		}
	
		private static void drawCross(int num) {

		int startCur = 0; 
		int endCur = num-1; 
		for (int i = 0; i < num; i++) 
		{ 
		for (int j = 0; j < num; j++) 
		{ 
		if (startCur == endCur && j == i) 
		System.out.print('*'); 
		else if (startCur == j || endCur == j) 
		System.out.print('*'); 
		else 
		System.out.print(' '); 
		} 
		startCur++; 
		endCur--; 
		System.out.println(); 
		} 
		}
}