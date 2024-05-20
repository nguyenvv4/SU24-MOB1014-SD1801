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
public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban chon lan 1: ");
        System.out.println("1. Nhâp a, b tính tổng a+b");
        System.out.println("2. Nhập a,b tính a*b");
        System.out.println("3. Nhâp thông tin cua hoc sinh");
        System.out.println("4. Thoát");
        Integer yeuCau = 0;
        do {
            yeuCau = sc.nextInt();
            switch (yeuCau) {
                case 1:
                    System.out.println("Ban da chon yeu cau 1");
                    System.out.println(tong());
                    break;
                case 2:
                    System.out.println("Ban da chon yeu cau 2");
                    break;
                case 3:
                    System.out.println("Ban da chon yeu cau 3");
                    break;
                case 4:
                    System.out.println("Ban da dung chuong trinh");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban da nhap sai");
                    break;
            }
        } while (yeuCau != 4);

    }

    public static int tong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        return a + b;
    }
}
