/* @vannamsc */

package Model;

import java.util.ArrayList;


public class Phan {
    private String ma;
    private String ten;
    private int soThuTu;
    private ArrayList<LyThuyet> dsLyThuyet;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public ArrayList<LyThuyet> getDsLyThuyet() {
        return dsLyThuyet;
    }

    public void setDsLyThuyet(ArrayList<LyThuyet> dsLyThuyet) {
        this.dsLyThuyet = dsLyThuyet;
    }
    
    
}
