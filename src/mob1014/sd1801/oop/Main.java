/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014.sd1801.oop;

/**
 *
 * @author nguyenvv
 */
public class Main {

    public static void main(String[] args) {

//        MayTinh mt = new MayTinh();
//        int tong = mt.tong(5, 3);
//        System.out.println(tong);
//        int tong2 = mt.tong(1, 2, 3);
//        System.out.println(tong2);
//        Constructor khong tham so
//        HCN hcn = new HCN();
        // constructor co tham so
        HCN hcn = new HCN(4, 3);
        float chuVi = hcn.chuVi();
        float dienTich = hcn.dienTich();
        System.out.println(chuVi);
        System.out.println(dienTich);
        // tao sinh vien id, ten, diem, trang thai
        // pt: nhapthongtin, inthongtin, danhgiahocluc
//        SinhVien sinhVien = new SinhVien();
//        sinhVien.nhapThongTin();
//        System.out.println("THong tin sinh vien la");
//        sinhVien.inThongTin();
//        String hocLuc = sinhVien.hocLuc1();
//        System.out.println(hocLuc);
    }
}
