import java.util.Scanner;

public class ThreeDReggularArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the No.of schools:- ");
		int school = scan.nextInt();

		System.out.println("Enter the No.of classes:- ");
		int classroom = scan.nextInt();

		System.out.println("Enter the No.of Students:- ");
		int students = scan.nextInt();

		int arr[][][] = new int[school][classroom][students];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("The school-" + (i + 1) + " class-" + (j + 1) + " student-" + (k + 1));
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		System.out.println("The array elements are:- ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++)

				{
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
