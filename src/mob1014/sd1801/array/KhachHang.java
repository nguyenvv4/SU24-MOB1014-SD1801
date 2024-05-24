/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014.sd1801.array;

/**
 *
 * @author nguyenvv
 */
public class KhachHang {

    public int id;
    public String hoTen;
    public String diaChi;
    public float luong;
    public String gioiTinh;
    public String sdt;

    public void InThongTin() {
        System.out.println("Id la: " + id);
        System.out.println("Ho ten la: " + hoTen);
        System.out.println("Dia chi la: " + diaChi);
        System.out.println("Luong la: " + luong);
        System.out.println("Gioi tinh la: " + gioiTinh);
        System.out.println("SO dien thoai la: " + sdt);
    }

    public KhachHang(int id, String hoTen, String diaChi, float luong, String gioiTinh, String sdt) {
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.luong = luong;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public KhachHang() {
    }
    
    
}
