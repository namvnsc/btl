/* @vannamsc */

package Model;

import java.util.ArrayList;


public class KhoaHoc {
    private String ma;
    private String ten;
    private String moTa;
    private String UrlAnh;
    private int soThuTu;
    private ArrayList<BaiHoc> dsBaiHoc;
    
    
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public ArrayList<BaiHoc> getDsBaiHoc() {
        return dsBaiHoc;
    }

    public void setDsBaiHoc(ArrayList<BaiHoc> dsBaiHoc) {
        this.dsBaiHoc = dsBaiHoc;
    }

    public String getUrlAnh() {
        return UrlAnh;
    }

    public void setUrlAnh(String UrlAnh) {
        this.UrlAnh = UrlAnh;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    
}
