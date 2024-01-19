package Assignmentpattern;
import java.util.Scanner;
public class problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n:- ");
        int n = sc.nextInt();


        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print((char)(i+64)+ " ");
        }
        System.out.println();
        n--;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char)(i+64)+ " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" " + " ");

            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print( (char)(i+64)+" ");
            }
            System.out.println();
        }
    }
    }

