import java.util.Scanner;

public class TwoDJaggedArray { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No.of classes:- ");
		int classroom = scan.nextInt();
		int arr[] []= new int [classroom][];
		arr[0]= new int [4];
		arr[1]= new int [3];
		arr[2]= new int [5];
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println("The class "+(i+1)+" student"+(j+1));
				arr[i][j]= scan.nextInt();
			}
		}
		System.out.println("The array elements are:- ");
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}


