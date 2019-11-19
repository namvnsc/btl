/* @vannamsc */

package test;

import DAO.KhoaHocDAO;
import Model.KhoaHoc;


public class run {
    public static void main(String[] args) {
        for(KhoaHoc kh: (new KhoaHocDAO().getAll())){
            for(String s: kh.getMoTa().trim().split("/.")){
                System.out.println(s);
            }
        }
    }
}
