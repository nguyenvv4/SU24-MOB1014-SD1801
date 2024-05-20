/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014.sd1801;

import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class bai3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // nhap n . Neu n > 0 thi dung lai
        Integer n;
        System.out.println("Moi ban nhap n: ");
        n = sc.nextInt();
        while (n < 0) {
            System.out.println("Ban da nhap sai");
            System.out.println("Moi ban nhap n: ");
            n = sc.nextInt();
        }
        System.out.println("n hop le la: " + n);

    }
}
