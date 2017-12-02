/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.awt.Color;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import javax.swing.JTabbedPane;

/**
 *
 * @author Huy Nhan
 */
public class BLL_main {
    public static void themtab(String tentab,JTabbedPane tbn,Component TenFormHienThi){
         int check = 0;
        int tongtab = tbn.getTabCount();
        if (tongtab > 5) {
            ChuyenDoi_ThongBao.ThongBao_Loi("Quá số lượng tab hiển thị !!!", "Lỗi hiển thị");
        }else if (tongtab == 0) {
            tbn.addTab(tentab,TenFormHienThi);
            tbn.setTabComponentAt(tongtab,new ButtonTabComponent(tbn));
            tbn.setBackgroundAt(tongtab , Color.yellow);
            tbn.setSelectedIndex(tongtab);
        }else{
            
            for (int i = 0; i < tongtab; i++) {
                if (tbn.getTitleAt(i).equals(tentab)) {
                    check = 1;
                    break;
                } else {
                    check = 0;
                }
            }
            if (check == 0) {
                tbn.addTab(tentab,TenFormHienThi);
                tbn.setTabComponentAt(tongtab,new ButtonTabComponent(tbn));
                tbn.setBackgroundAt(tongtab, Color.yellow);
                tbn.setSelectedIndex(tongtab);
            }
        }
        
        
    }
    public static int GetMaxWidth() {
          return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
     }
     public static int GetMaxHeight() {
         return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
     }

    
}
