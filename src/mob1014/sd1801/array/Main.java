/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014.sd1801.array;

import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class Main {

    public static void main(String[] args) {
        // khoi tao 1 arraylist chua hoc sinh
        ArrayList<HocSinh> arr = new ArrayList<>();
        // nhap 1 mang sinh vien
        for (int i = 0; i < 3; i++) {
            HocSinh hocSinh = new HocSinh();
            hocSinh.nhapThongTin();
            arr.add(hocSinh);
        }

        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).inThongTin();
        }
    }
    
    // Tạo đối tượng khách hàng: id, họ tên địa chỉ,luong,
    // giới tính, số điện thoại
    // và phương thức nhập thông tin, in thông tin
    // Tạo 1 ArrayList khách hàng 5 phần tử nhập vào từ bàn phím
    // 1. Nhập id 1 khách hàng, In ra thông tin khách hàng vừa nhập
    // 2. Nhập id khach hàng, xoá khách hàng vừa tìm được
    // 3. Tìm kiếm khách hàng có lương >10
    // 4. Tìm khách hàng có lương nhỏ nhất
    
}
