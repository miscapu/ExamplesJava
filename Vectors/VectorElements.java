/*
 * @Author: MiSCapu
 * @Topic: Vectors
 * Problem: Develop a program that allows you to enter a vector of 8 elements, and report 
 * 1. The cumulative value of all vector elements
 * 2. The cumulative value of the vector elements that are greater than 36
 * 3. Amount of values greater than 50 
 */

//to enter values by keyboard, we need Scanner class
import java.util.Scanner;

public class VectorElements{
	//declare attributes
	private Scanner KeyboardEnter;
	private int[] Vector1;
	private int SumElementsVector;

	//declare method InitializeAttributes
	public void InitializeAttributes(){
		//init variable than contain entered values: KeyboardEnter
		KeyboardEnter = new Scanner(System.in);
		//init vector Vector1
		Vector1 = new int[8]; 
		//init vector than contain 8 values. For it we need "for" structure
		for (int CountElements = 0;CountElements<8;CountElements++) {
			//for number of counter/in asked user(*optional)
			int y = CountElements + 1;
			//asked values to the user
			System.out.print("Please, enter the #"+y+" element for vector: ");
			Vector1[CountElements] = KeyboardEnter.nextInt();
		}
	}

	//declare method CumulativeValueAll
	public void CumulativeValueAll(){
		SumElementsVector = 0;
		for (int CountElements = 0;CountElements<8;CountElements++) {
			SumElementsVector = SumElementsVector + Vector1[CountElements];
		}

		System.out.println("The sum of all vectors elements is: "+SumElementsVector);
	}


	//declare method CumulativeElementsGreater36
	public void CumulativeElementsGreater36(){
		int SumElementsVectorGreater36 = 0;
		for (int CountElements = 0;CountElements<8;CountElements++) {
			if (Vector1[CountElements]>36) {
				SumElementsVectorGreater36 = SumElementsVectorGreater36 + Vector1[CountElements];
			}

		}
		System.out.println("The Sum of vectors greater than 36 is: "+SumElementsVectorGreater36);
	}

	//declare method CumulativeNumberElementsGreater50
	public void CumulativeNumberElementsGreater50(){
		int NumberElementsGreater50 = 0;
		for (int CountElements=0;CountElements<8;CountElements++ ) {
			if (Vector1[CountElements]>50) {
				NumberElementsGreater50 = NumberElementsGreater50 + 1;
			}
		}
		System.out.println("The quantity of values greater than 50 is: "+NumberElementsGreater50);
	}




	public static void main(String[] args) {
		VectorElements Demo;
		Demo = new VectorElements();
		Demo.InitializeAttributes();
		Demo.CumulativeValueAll();
		Demo.CumulativeElementsGreater36();
		Demo.CumulativeNumberElementsGreater50();
	}

}