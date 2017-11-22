/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HuyNhan
 */
public class BLL_sach {
    public static void DLTable(JTable Ten_table,ResultSet rs) {
        DefaultTableModel table = (DefaultTableModel)Ten_table.getModel();
        Object[] item = new Object[20];
        table.setRowCount(0);
        try {
            while(rs.next()){
                item[0] = table.getRowCount() + 1;
                item[1] = rs.getString("MaSach");
                item[2] = rs.getString("TenSach");
                item[3] = rs.getString("SoLuongSach");
                item[4] = rs.getString("TinhTrangSach");
                item[5] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GiaSach"));
                item[6] = ChuyenDoi_ThongBao.TienVietNam(rs.getDouble("GiaNhap"));
                item[7] = rs.getString("NhaXuatBan");
                item[8] = rs.getString("MoTa");
                table.addRow(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Quyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
