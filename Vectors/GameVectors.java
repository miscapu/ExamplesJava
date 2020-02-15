/*
 * @Author: MiSCapu
 * @Topic: Vectors 
 * @Problem: Create a program than ask the load of the 2 numerical vectors integers of 4 elements: 
 * 1. Obtain the sum of this vectors
 * 2. Result(1) save in the third vector of the same size
 */

//to ask values by keyboard, we need the class Scanner
import java.util.Scanner;

public class GameVectors{
	//declare variables
	private Scanner KeyboardEnter;
	private int[] Vector1;
	private int[] Vector2;
	private int[] Vector3;

	//method Attributes charge
	public void AttributesCharge(){
		KeyboardEnter = new Scanner(System.in);
		Vector1 = new int[4];
		Vector2 = new int[4];
		

		//vector1
		for (int CountElements = 0;CountElements<4;CountElements++) {
			int y = CountElements + 1;
			System.out.print("Please, enter the #"+y+" element for the vector1: ");
			Vector1[CountElements] = KeyboardEnter.nextInt();
		}
		//vector2
		for (int CountElements = 0;CountElements < 4; CountElements++) {
			int y = CountElements +1;
			System.out.print("Please, enter the #"+y+" element for the Vector2: ");
			Vector2[CountElements] = KeyboardEnter.nextInt();
		}

	}

	public void CalculateSumComponentsVectors(){
		Vector3 = new int[4];
		for (int CountElements=0;CountElements < 4;CountElements++) {
			Vector3[CountElements] = Vector1[CountElements]+ Vector2[CountElements];
		}
		
		
		for (int CountElements=0;CountElements<4;CountElements++) {
			System.out.println("The sum of each component is: "+Vector3[CountElements]);
		}
		
	}

	public static void main(String[] args) {
		GameVectors Demo;
		Demo = new GameVectors();
		Demo.AttributesCharge();
		Demo.CalculateSumComponentsVectors();
	}
}