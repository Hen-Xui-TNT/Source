/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.awt.Component;
import javax.swing.JTabbedPane;

/**
 *
 * @author Huy Nhan
 */
public class BLL_main {
    public static void themtab(String tentab,JTabbedPane tbn,Component TenFormHienThi){
         int tongtab = tbn.getTabCount();
        if (tongtab > 5) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Quá số lượng tab hiển thị !!!", "Lỗi hiển thị");
        }else if (tongtab == 0) {
            tbn.add(tentab,TenFormHienThi);
            tbn.setTabComponentAt(tongtab,new ButtonTabComponent(tbn));
        }else{
            int check = 0;
            for (int i = 0; i < tbn.getTabCount(); i++) {
                if (!tbn.getTitleAt(i).equals(tentab)) {
                    check = 1;
                } else {
                    check = 0;
                }
            }
            if (check == 1) {
                tbn.add(tentab,TenFormHienThi);
                tbn.setTabComponentAt(tongtab,new ButtonTabComponent(tbn));
            }
        }
        
        
    }
}
