/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014.sd1801.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class MainKhachHang {

    public static void main(String[] args) {
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        KhachHang kh1 = new KhachHang(1, "Nguyen Van A", "Ha Noi", 100000, "Nam", "0987654321");
        KhachHang kh2 = new KhachHang(2, "Nguyen Van A", "Ha Noi", 100000, "Nam", "0987654321");
        KhachHang kh3 = new KhachHang(3, "Nguyen Van A", "Ha Noi", 100000, "Nam", "0987654321");
        KhachHang kh4 = new KhachHang(4, "Nguyen Van A", "Ha Noi", 100000, "Nam", "0987654321");
        KhachHang kh5 = new KhachHang(5, "Nguyen Van A", "Ha Noi", 100000, "Nam", "0987654321");

        listKhachHang.add(kh1);
        listKhachHang.add(kh2);
        listKhachHang.add(kh3);
        listKhachHang.add(kh4);
        listKhachHang.add(kh5);

//        for (int i = 0; i < 5; i++) {
//            listKhachHang.get(i).InThongTin();
//        }
        // y2
        // duyet qua cac phan tu trong mang
        // for int i => for index=> duyet qua vi tri cac phan tu
        // foreach for duyet qua cac phan tu
        for (KhachHang kh : listKhachHang) {
            kh.InThongTin();
            System.out.println("==============");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id can xoa: ");
        Integer id = scanner.nextInt();
        System.out.println(id);
        KhachHang tmp = new KhachHang();
        // cach 1
//        for (KhachHang kh : listKhachHang) {
//            if (kh.id == id) {
//                tmp = kh;
//            }
//        }
        for (int i = 0; i < 5; i++) {
            if (listKhachHang.get(i).id == id) {
                tmp = listKhachHang.get(i);
            }
        }
        listKhachHang.remove(tmp);
        System.out.println("Danh sach sau khi xoa la: ");
        for (KhachHang kh : listKhachHang) {
            kh.InThongTin();
            System.out.println("==============");
        }

    }
}
