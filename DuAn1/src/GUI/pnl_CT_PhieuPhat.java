/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Yuuki Nguyen
 */
public class pnl_CT_PhieuPhat extends javax.swing.JPanel {

    /**
     * Creates new form pnl_Thongtinmuahang
     */
    public pnl_CT_PhieuPhat() {
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

        spnSoLuongPhat = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        ghichu = new javax.swing.JLabel();
        ghichu1 = new javax.swing.JLabel();
        cbbLoiPhat = new javax.swing.JComboBox<>();
        cc = new javax.swing.JScrollPane();
        txtGhiChu_CTPP = new javax.swing.JTextPane();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Số sách phạt");

        ghichu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ghichu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ghichu.setText("Ghi Chú");

        ghichu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ghichu1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ghichu1.setText("Lỗi Phạt");

        cbbLoiPhat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbbLoiPhat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trả muộn (-30%)", "Hỏng nhẹ (dưới 3 tờ - 30%)", "Hỏng nặng (từ 3 tờ trở lên - 60%)", "Làm mất  (- 100%)" }));

        cc.setViewportView(txtGhiChu_CTPP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ghichu1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnSoLuongPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLoiPhat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cc))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ghichu1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLoiPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnSoLuongPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addComponent(cc))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbbLoiPhat;
    private javax.swing.JScrollPane cc;
    private javax.swing.JLabel ghichu;
    private javax.swing.JLabel ghichu1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JSpinner spnSoLuongPhat;
    public static javax.swing.JTextPane txtGhiChu_CTPP;
    // End of variables declaration//GEN-END:variables
}