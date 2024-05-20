/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014.sd1801.oop;

/**
 *
 * @author nguyenvv
 */
public class HCN {

    public float chieuDai;

    public float chieuRong;

    public HCN(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    

    float chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    float dienTich() {
        return chieuDai * chieuRong;
    }
}
