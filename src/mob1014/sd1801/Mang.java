/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014.sd1801;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class Mang {

    public static void main(String[] args) {
        int a[] = {4, 3, 5, 7, 6, 0, 8};
        int tong = 0;
        System.out.print("Do dai cua mang la: ");
        System.out.println(a.length);
        System.out.print("Mang ban dau la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        a[2] = a[2] * 2;
        System.out.print("Mang ban dau la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
//        // tinh tong
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0) {
//                tong += a[i];
//            }
//        }
//        System.out.println("\nTong la: " + tong);
//
//        System.out.println("Mang ban dau: " + Arrays.toString(a));

    }
}
