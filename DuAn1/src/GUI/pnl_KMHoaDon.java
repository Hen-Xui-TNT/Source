/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author HuyNhan
 */
public class pnl_KMHoaDon extends javax.swing.JPanel {

    /**
     * Creates new form pnl_KMHoaDon
     */
    public pnl_KMHoaDon() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbn_SL = new javax.swing.JRadioButton();
        rbn_tien = new javax.swing.JRadioButton();
        rbn_Voucher = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_KMSoLuong = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_KMTien = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_KmVoucher = new javax.swing.JTextPane();

        rbn_SL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbn_SL.setText("Khuyến Mãi Theo Số Lượng");
        rbn_SL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_SLActionPerformed(evt);
            }
        });

        rbn_tien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbn_tien.setText("Khuyến Mãi Theo Số Tiền Trong Hóa Đơn");
        rbn_tien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_tienActionPerformed(evt);
            }
        });

        rbn_Voucher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbn_Voucher.setText("Khuyến Mãi Theo Coupon, Voucher");
        rbn_Voucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_VoucherActionPerformed(evt);
            }
        });

        txt_KMSoLuong.setEditable(false);
        jScrollPane1.setViewportView(txt_KMSoLuong);

        txt_KMTien.setEditable(false);
        jScrollPane2.setViewportView(txt_KMTien);

        txt_KmVoucher.setEditable(false);
        jScrollPane3.setViewportView(txt_KmVoucher);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbn_Voucher)
                    .addComponent(rbn_tien)
                    .addComponent(rbn_SL)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbn_SL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbn_tien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(rbn_Voucher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbn_SLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_SLActionPerformed
        
    }//GEN-LAST:event_rbn_SLActionPerformed

    private void rbn_tienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_tienActionPerformed
        
    }//GEN-LAST:event_rbn_tienActionPerformed

    private void rbn_VoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_VoucherActionPerformed
        
    }//GEN-LAST:event_rbn_VoucherActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JRadioButton rbn_SL;
    public static javax.swing.JRadioButton rbn_Voucher;
    public static javax.swing.JRadioButton rbn_tien;
    public static javax.swing.JTextPane txt_KMSoLuong;
    public static javax.swing.JTextPane txt_KMTien;
    public static javax.swing.JTextPane txt_KmVoucher;
    // End of variables declaration//GEN-END:variables
}