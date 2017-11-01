/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.DBConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Huy Nhan
 */
public class DuAn1 {

    /**
     * @param args the command line arguments
     */
   public static DAL.DBConnection conn = new DBConnection();
    public static frm_main frm_m = new frm_main();
    public static void main(String[] args) {
        // TODO code application logic here
        frm_m.show();
    }
    
             public static void ThongBao(String tieude, String noidung){
        JOptionPane.showMessageDialog(new JFrame(), noidung, tieude, 0);
    }
    
    public static void ThongBaoOK(String tieude, String noidung){
        JOptionPane.showMessageDialog(new JFrame(), noidung, tieude, JOptionPane.NO_OPTION);
    }
    
}
