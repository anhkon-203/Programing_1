/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anhkon
 */
public class Activity_2 {
    public static void main(String[] args) {
        double [] Arr = {3,5,9};
        double max = Arr[0];
        for (double d : Arr) {
            if (max < d) {
                max = d;
            }
        }
        System.out.println("Max: " + max);
    }
}
