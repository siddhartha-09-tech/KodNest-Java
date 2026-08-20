import java.util.Scanner;

public class Employe {
    int Eid;
    String Ename;
    float Esalary;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the No.of Employees:- ");
        int n = scan.nextInt();
        Employe[] ar = new Employe[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new Employe();
            System.out.println("Enter the " + (i + 1) + "- Employe ID :-");
            ar[i].Eid = scan.nextInt();
            System.out.println("Enter the " + (i + 1) + "- Employe NAME :-");
            ar[i].Ename = scan.next();
            System.out.println("Enter the " + (i + 1) + "- Employe SALARY :-");
            ar[i].Esalary = scan.nextFloat();

        }
        System.out.println("The Employe Detaiils are :- ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i].Eid + " ");
            System.out.print(ar[i].Ename + " ");
            System.out.print(ar[i].Esalary + " ");
            System.out.println();

        }

    }

}
