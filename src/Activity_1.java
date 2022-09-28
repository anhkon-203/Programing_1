
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author anhkon
 */
public class Activity_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b, Hb,A ;
        System.out.println("Enter Base");
        b = sc.nextFloat();
        System.out.println("Enter Height");
        Hb = sc.nextFloat();
        A = (b*Hb) / 2;
        System.out.println("Its area (cm2) is:" + A);
    }
}
