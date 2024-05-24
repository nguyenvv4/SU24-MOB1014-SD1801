/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014.sd1801.array;

import mob1014.sd1801.oop.*;
import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class HocSinh {

    public int id;
    public String ten;
    public float diem;
    public String trangThai;

    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Moi ban nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Moi ban nhap diem: ");
        diem = sc.nextFloat();
        sc.nextLine();
        System.out.println("Moi ban nhap trang thai: ");
        trangThai = sc.nextLine();
    }

    void inThongTin() {
        System.out.println("ID la: " + id);
        System.out.println("Ho ten la: " + ten);
        System.out.println("Diem la: " + diem);
        System.out.println("Trang thai: " + trangThai);
        System.out.println("====================");
    }

}
