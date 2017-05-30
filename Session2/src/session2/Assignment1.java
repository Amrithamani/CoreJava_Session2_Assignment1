package session2;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialize variable which need to use for size.

		int size = 5;

		// to calculate number of lines using outer looping statement

		for (int i = 0; i < size; i++) {

			// to calculate number of spaces per line using inner looping
			// statement

			for (int j = 0; j < size; j++) {

				// check the conditions using if else...if decision making
				// statement

				if (i == j || i + j == size - 1) {

					System.out.print("*");// print the asterisk character

				} else if (i == 1 && j == 4 || i == 2 && j >= 2 || i == 3 && j > 3) {

					System.out.print(" ");// print the white space

				} else {

					System.out.print("_");// print the underscore character

				}
			}

			System.out.println();// print the new line
		}

	}

}
