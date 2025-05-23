package com.campusdual.classroom;
import com.campusdual.util.Utils;
public class Exercise18 {

	public static void main(String[] args) {
		int[]myArray = new int[] {1, 2,3,4,5,6,7,8,9,10};

		createAndInitializeArray(3);

		showInlineArray(createAndInitializeArray(3));
		showInlineArray(createAndInitializeArray(4));

		//Metodo Clase Utils
		System.out.println(Utils.getRandomNumberInRange(myArray[0], myArray.length));
	}

	public static int[] createAndInitializeArray(int index) {
		int[] numeros = new int[index];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i+1;
		}
		return numeros;
	}

	public static void showInlineArray(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(myArray[i]);

		}
	}
}
