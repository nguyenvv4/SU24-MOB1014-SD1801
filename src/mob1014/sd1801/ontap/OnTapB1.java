/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014.sd1801.ontap;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class OnTapB1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("1. giải phương trình bậc 2\n"
                    + "2. nhập và in ra thông tin nhan vien\n"
                    + "3. khởi tạo 1 mảng 6 số bất kì, tìm max\n"
                    + "4. Thoát");
            System.out.println("Moi ban chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    cau1();
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ban da chon sai, moi chon lai");
                    break;
            }

        } while (n != 4);
    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien();
        System.out.println("Nhap vao id: ");
        nhanVien.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ho ten: ");
        nhanVien.hoTen = sc.nextLine();
        System.out.println("Nhap vao tuoi: ");
        nhanVien.tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao gioi tinh: ");
        nhanVien.gioiTinh = sc.nextLine();
        System.out.println("Nhap vao luong: ");
        nhanVien.luong = sc.nextFloat();
        System.out.println(nhanVien.toString());
    }

    public static void bai3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so n: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Moi nhap a[%d]: ", i);
            a[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i]) {
                max = a[i];
            }
        }
        System.out.println("Gia tri lon nhat la: " + max);
    }

    public static void cau1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap a: ");
        int a = sc.nextInt();
        System.out.println("Moi ban nhap b: ");
        int b = sc.nextInt();
        System.out.println("Moi ban nhap c: ");
        int c = sc.nextInt();
        if (a == 0) {
            System.out.println("Phuong trinh co nghiem : " + (float) -c / b);
        } else {
            float delta = (float) (Math.pow(b, 2) - 4 * a * c);
            if (delta > 0) {
                System.out.println("Phuong trinh co 2 nghiem");
                float x1 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                float x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                System.out.printf("x1 = %f va x2 = %f", x1, x2);
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep: ");
                float x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }

}
