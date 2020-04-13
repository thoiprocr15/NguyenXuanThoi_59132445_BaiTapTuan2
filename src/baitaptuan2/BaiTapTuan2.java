/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan2;

/**
 *
 * @author 张氏红绒
 */
public class BaiTapTuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LopHoc LH = new LopHoc();
        
        HocSinh HS1 = new HocSinh("59CNTT", "Chơi sáo", "Nguyễn Xuân Thời", 24, "Cam Ranh", "0868346796");
        HocSinh HS2 = new HocSinh("59DDT", "Chơi Guitar", "Diệp Túy Dũng", 23, "Cam Ranh", "0935448679");
        HocSinh HS3 = new HocSinh("59KTTT", "Nhảy", "Nguyễn Nam Dương", 22, "Cam Ranh", "0995054202");
        
        LH.themHocSinh(HS1);
        LH.themHocSinh(HS2);
        LH.themHocSinh(HS3);
        
        LH.inDSHS();
    }
    
}
