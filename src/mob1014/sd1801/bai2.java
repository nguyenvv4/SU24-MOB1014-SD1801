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
public class bai2 {

    public static void main(String[] args) {
        // in ra các số tưf 1 đến 10

        // Tạo menu như sau:
        //1. Nhâp a, b tính tổng a+b
        //2. Nhập a,b tính a*b
        //3. Nhâp thông tin cua hoc sinh
        //4. Thoát
        // Yêu cầu: Tạo menu như trên, dừng lại khi chọn 4
        // Chỉ cần in ra các đoạn text không cần code chức năng
        Scanner sc = new Scanner(System.in);
        String tmp = "";
        System.out.println("1. Nhâp a, b tính tổng a+b");
        System.out.println("2. Nhập a,b tính a*b");
        System.out.println("3. Nhâp thông tin cua hoc sinh");
        System.out.println("4. Thoát");
        System.out.println("Moi ban chon yeu cau: ");
        Integer yeuCau = sc.nextInt();
        do {
            System.out.println("Ban co muon tiep tuc khong");
            tmp = sc.nextLine();
            if (tmp.equals("no")) {
                return;
            }else{
                System.out.println("Moi ban chon tiep: ");
                yeuCau = sc.nextInt();
            }
            switch (yeuCau) {
                case 1:
                    System.out.println("Ban da chon yeu cau 1");
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
}
