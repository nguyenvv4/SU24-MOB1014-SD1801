/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mob1014.sd1801;

import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class MOB1014SD1801 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // int a = 10;
        String hoTen;
        Integer tuoi;
        String diaChi;
        String gioiTinh;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.println("Moi ban nhap tuoi: ");
//        tuoi = scanner.nextInt();
//        scanner.nextLine();
        tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap dia chi: ");
        diaChi = scanner.nextLine();

        System.out.println("Ho ten la: " + hoTen);
        System.out.println("Tuoi la: " + tuoi);
        System.out.println("Dia chi la: " + diaChi);
        System.out.println("Gia tri: " + (float)4 / 3);
        // Nhap diem va in ra hoc luc
    }

}
