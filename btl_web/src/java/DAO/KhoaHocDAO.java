/* @vannamsc */

package DAO;

import Model.BaiHoc;
import java.util.ArrayList;
import Model.KhoaHoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhoaHocDAO extends DAO{

    public KhoaHocDAO() {
        super();
    }
    
    public ArrayList<KhoaHoc> getAll(){
        ArrayList<KhoaHoc> ds = new ArrayList<KhoaHoc>();
        String sql = "select * from Khoa_Hoc";
        try{
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                KhoaHoc kh = new KhoaHoc();
                kh.setMa(rs.getString("Ma"));
                kh.setTen(rs.getString("Ten"));
                kh.setMoTa(rs.getString("Mo_Ta"));
                kh.setUrlAnh(rs.getString("Url_Anh"));
                kh.setSoThuTu(rs.getInt("So_Thu_Tu"));
                ds.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(ds, new Comparator<KhoaHoc>(){
            @Override
            public int compare(KhoaHoc o1, KhoaHoc o2) {
                return o1.getSoThuTu()-o2.getSoThuTu();
            }
        });
        return ds;
    }
}
