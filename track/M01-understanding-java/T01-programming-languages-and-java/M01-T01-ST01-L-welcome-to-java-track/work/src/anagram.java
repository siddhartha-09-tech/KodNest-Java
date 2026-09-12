import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the  2 string:- ");
		String s1= sc.next();
		String s2= sc.next();
        if(s1.length()!=s2.length()){
            System.out.println("NOT ANAGRAM");
            return;
        }
		char arr[] = s1.toCharArray(); 
		char arr1[] =s2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		String new_s1= new String(arr);
		String new_s2= new String(arr1);
		
		
	
		if(new_s1.equalsIgnoreCase(new_s2)) {
			System.out.println("ANAGRAM");
		}else {
			System.out.println("NOT ANAGRAM");
		}
		
		
		
	}
}
