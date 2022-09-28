
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author anhkon
 */
public class Activity_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        float A = sc.nextFloat();
        if (A == 0) {
            System.out.println("The number is Zero");
        } else if (A >= 1 && A <= 1000000) {
            System.out.println("A  positive number");
        } else if (A <= -1 && A >= -1000000) {
            System.out.println("A negative  number");
        } else if (A > 0 && A < 1) {
            System.out.println("A small positive number");
        } else if (A < 0 && A > -1) {
            System.out.println("A small negative number");
        } else if (A > 1000000) {
            System.out.println("A Large positive number");
        } else if (A < -1000000) {
            System.out.println("A Large negative number");
        }
    }
}
