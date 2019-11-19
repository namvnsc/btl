/* @vannamsc */

package DAO;

import static DAO.DAO.con;
import java.util.ArrayList;
import Model.BaiHoc;
import com.sun.javafx.css.Combinator;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaiHocDAO extends DAO{

    public BaiHocDAO() {
        super();
    }
    
    public ArrayList<BaiHoc> getAll(String maKhoaHoc){
        ArrayList<BaiHoc> ds = new ArrayList<>();
        String sql = "select * from Bai_Hoc where Ma_Khoa_Hoc=?";
        try{
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, maKhoaHoc);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                BaiHoc bh = new BaiHoc();
                bh.setMa(rs.getString("Ma"));
                bh.setTen(rs.getString("Ten"));
                bh.setSoThuTu(rs.getInt("So_Thu_Tu"));
                ds.add(bh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(ds, new Comparator<BaiHoc>(){
            @Override
            public int compare(BaiHoc o1, BaiHoc o2) {
                return o1.getSoThuTu()-o2.getSoThuTu();
            }
        });
        return ds;
    }
}
