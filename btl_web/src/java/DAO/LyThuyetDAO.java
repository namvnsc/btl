/* @vannamsc */

package DAO;

import static DAO.DAO.con;
import java.util.ArrayList;
import Model.LyThuyet;
import com.sun.javafx.css.Combinator;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LyThuyetDAO extends DAO{

    public LyThuyetDAO() {
        super();
    }
    
    public ArrayList<LyThuyet> getAll(String maBaiHoc){
        ArrayList<LyThuyet> ds = new ArrayList<>();
        String sql = "select * from LyThuyet where Ma_Khoa_Hoc=?";
        try{
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, maBaiHoc);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                LyThuyet lt = new LyThuyet();
                lt.setSoThuTu(rs.getInt("So_Thu_Tu"));
                lt.setLoai(rs.getString("Loai"));
                lt.setChiTiet(rs.getString("Chi_Tiet"));
                ds.add(lt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(ds, new Comparator<LyThuyet>(){
            @Override
            public int compare(LyThuyet o1, LyThuyet o2) {
                return o1.getSoThuTu()-o2.getSoThuTu();
            }
        });
        return ds;
    }
}
