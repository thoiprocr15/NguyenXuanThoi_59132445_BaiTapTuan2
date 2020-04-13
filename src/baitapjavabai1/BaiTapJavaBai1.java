/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjavabai1;

/**
 *
 * @author 张氏红绒
 */
public class BaiTapJavaBai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien NV1 = new NhanVien("Nguyễn Xuân Thời", "Cam Ranh", 20, 5000000, 200);
        NhanVien NV2 = new NhanVien("Diệp Túy Dũng", "Cam Ranh", 21, 6000000, 400);
        NhanVien NV3 = new NhanVien("Nguyễn Nam Dương", "Cam Ranh", 20, 8000000, 500);
        
        NV1.getThongTin();
        NV2.getThongTin();
        NV3.getThongTin();
    }
    
    
}
