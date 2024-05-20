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
public class Hdt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sinhVien1 = new SinhVien();
        System.out.println("Moi ban nhap ma: ");
        String ma = sc.nextLine();
        sinhVien1.maSinhVien = ma;
        System.out.println("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        sinhVien1.hoTen = hoTen;
        System.out.println("Nhap nam sinh: ");
        int namSinh = sc.nextInt();
        sinhVien1.namSinh = namSinh;
        sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        sinhVien1.diaChi = diaChi;
        System.out.println(sinhVien1.toString());
        sinhVien1.inTuoi();
    
        
    }
}
