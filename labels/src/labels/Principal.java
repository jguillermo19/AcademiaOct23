package labels;

public class Principal {

	public static void main(String[] args) {
		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };

		ETIQUETA1: for (int[] mySimpleArray : myComplexArray) {

			ETIQUETA2: for (int i = 0; i < mySimpleArray.length; i++) {

				System.out.print(mySimpleArray[i] + "\t");

			}
			System.out.println();

		}
		
	}

}
