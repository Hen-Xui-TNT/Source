/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.BLL_TheLoai;
import BLL.BLL_sach;
import DAL.DAL_TheLoai;
import java.awt.PopupMenu;
import java.awt.event.KeyEvent;
import javax.swing.JMenuItem;
import GUI.frm_main.*;
import static GUI.pnl_danhmucsach.tbl_sach;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Huy Nhan
 */
public class frm_thongtinsach extends javax.swing.JFrame  {

    /**
     * Creates new form frm_themsach
     */
    public frm_thongtinsach() {
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

        Pmn_tacgia = new javax.swing.JPopupMenu();
        Pmn_theloai = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txt_nhaxuatban = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextArea();
        txt_masach = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_tensach = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_soluong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_giasach = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_timkiemtacgia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_tacgia = new javax.swing.JTable();
        btn_addtacgia = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_theloai = new javax.swing.JTable();
        btn_addtheloai = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_gianhap = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        txt_tinhtrangsach = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_timkiemtheloai = new javax.swing.JTextField();

        Pmn_tacgia.setAutoscrolls(true);

        Pmn_theloai.setAutoscrolls(true);

        jMenuItem1.setText("jMenuItem1");
        Pmn_theloai.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Thông tin sách");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txt_nhaxuatban.setInheritsPopupMenu(true);
        txt_nhaxuatban.setMaximumSize(new java.awt.Dimension(250, 25));
        txt_nhaxuatban.setMinimumSize(new java.awt.Dimension(250, 25));
        txt_nhaxuatban.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Mã sách :");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Tên sách :");
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Số lượng :");
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Giá sách :");
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 25));

        jScrollPane1.setInheritsPopupMenu(true);

        txt_mota.setColumns(20);
        txt_mota.setRows(5);
        jScrollPane1.setViewportView(txt_mota);

        txt_masach.setEditable(false);
        txt_masach.setInheritsPopupMenu(true);
        txt_masach.setMaximumSize(new java.awt.Dimension(250, 25));
        txt_masach.setMinimumSize(new java.awt.Dimension(250, 25));
        txt_masach.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Nhà xuất bản :");
        jLabel9.setOpaque(true);
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 25));

        txt_tensach.setInheritsPopupMenu(true);
        txt_tensach.setMaximumSize(new java.awt.Dimension(250, 25));
        txt_tensach.setMinimumSize(new java.awt.Dimension(250, 25));
        txt_tensach.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Mô tả :");
        jLabel10.setOpaque(true);
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 25));

        txt_soluong.setInheritsPopupMenu(true);
        txt_soluong.setMaximumSize(new java.awt.Dimension(250, 25));
        txt_soluong.setMinimumSize(new java.awt.Dimension(250, 25));
        txt_soluong.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Thể loại :");
        jLabel11.setOpaque(true);
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 25));

        txt_giasach.setInheritsPopupMenu(true);
        txt_giasach.setMaximumSize(new java.awt.Dimension(250, 25));
        txt_giasach.setMinimumSize(new java.awt.Dimension(250, 25));
        txt_giasach.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Tác giả :");
        jLabel12.setOpaque(true);
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 25));

        txt_timkiemtacgia.setAutoscrolls(false);
        txt_timkiemtacgia.setPreferredSize(new java.awt.Dimension(180, 25));
        txt_timkiemtacgia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_timkiemtacgiaKeyReleased(evt);
            }
        });

        jScrollPane2.setInheritsPopupMenu(true);

        tbl_tacgia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã tác giả", "Tên tác giả"
            }
        ));
        jScrollPane2.setViewportView(tbl_tacgia);
        if (tbl_tacgia.getColumnModel().getColumnCount() > 0) {
            tbl_tacgia.getColumnModel().getColumn(0).setResizable(false);
            tbl_tacgia.getColumnModel().getColumn(1).setResizable(false);
            tbl_tacgia.getColumnModel().getColumn(2).setResizable(false);
        }

        btn_addtacgia.setText("Add");
        btn_addtacgia.setInheritsPopupMenu(true);

        jScrollPane3.setInheritsPopupMenu(true);

        tbl_theloai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã thể loại", "Tên Thể loại"
            }
        ));
        jScrollPane3.setViewportView(tbl_theloai);

        btn_addtheloai.setText("Add");
        btn_addtheloai.setInheritsPopupMenu(true);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Giá nhập :");
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 25));

        txt_gianhap.setInheritsPopupMenu(true);
        txt_gianhap.setMaximumSize(new java.awt.Dimension(250, 25));
        txt_gianhap.setMinimumSize(new java.awt.Dimension(250, 25));
        txt_gianhap.setPreferredSize(new java.awt.Dimension(250, 25));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setInheritsPopupMenu(true);

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txt_tinhtrangsach.setInheritsPopupMenu(true);
        txt_tinhtrangsach.setMaximumSize(new java.awt.Dimension(250, 25));
        txt_tinhtrangsach.setMinimumSize(new java.awt.Dimension(250, 25));
        txt_tinhtrangsach.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Tình trạng :");
        jLabel13.setOpaque(true);
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 25));

        txt_timkiemtheloai.setAutoscrolls(false);
        txt_timkiemtheloai.setPreferredSize(new java.awt.Dimension(180, 25));
        txt_timkiemtheloai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_timkiemtheloaiKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_timkiemtacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_addtacgia))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_masach, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_nhaxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_giasach, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_timkiemtheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_addtheloai)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_masach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nhaxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_giasach, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_timkiemtheloai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_addtheloai))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_timkiemtacgia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_addtacgia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void txt_timkiemtacgiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemtacgiaKeyReleased
        //Pmn_tacgia.show(txt_timkiemtacgia, 0, 25);
        String key = txt_timkiemtacgia.getText();
        BLL.Popupmenu.DLPopupMenuTacGia(Pmn_tacgia, DAL.DAL_TacGia.timkiemPmn(key),
                "TenTacGia","MaTacGia",txt_timkiemtacgia,tbl_tacgia);
        
    }//GEN-LAST:event_txt_timkiemtacgiaKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        txt_gianhap.setText("");
        txt_giasach.setText("");
        txt_masach.setText("");
        txt_mota.setText("");
        txt_nhaxuatban.setText("");
        txt_soluong.setText("");
        txt_tensach.setText("");
        txt_tinhtrangsach.setText("");
        txt_timkiemtacgia.setText("");
        txt_timkiemtheloai.setText("");
        tbl_tacgia.setRowMargin(0);
        tbl_theloai.setRowMargin(0);
        frm_main.CNSach = 0;
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_gianhap.setText("");
        txt_giasach.setText("");
        txt_masach.setText("");
        txt_mota.setText("");
        txt_nhaxuatban.setText("");
        txt_soluong.setText("");
        txt_tensach.setText("");
        txt_tinhtrangsach.setText("");
        txt_timkiemtacgia.setText("");
        txt_timkiemtheloai.setText("");
        tbl_tacgia.setRowMargin(0);
        tbl_theloai.setRowMargin(0);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        int ipsach;
        switch (frm_main.CNSach) {
            case 1:
                // Sửa dữ liệu sách
                System.out.println("Sửa");
                BLL.BLL_sach.sua(txt_masach.getText(), txt_tensach.getText()
                        , txt_soluong.getText(), txt_tinhtrangsach.getText()
                        , txt_giasach.getText(), txt_gianhap.getText()
                        , txt_nhaxuatban.getText(), txt_mota.getText());
                BLL.BLL_sach.DLTable(tbl_sach, DAL.DAL_Sach.GetAll());
                //Xóa thông tin của chi tiết tác giả của sách
                DAL.DAL_ChiTietTacGia.Delete_ChiTietTacGia(txt_masach.getText());
                //sửa lại chi tiết tác giả của sách
                for (int i = 0; i < tbl_tacgia.getRowCount(); i++) {
                    
                    BLL.BLL_ChiTietTacGia.them(Integer.parseInt(txt_masach.getText()),tbl_tacgia.getValueAt(i, 1).toString());
                }
                //Xóa thông tin thể loại của sách
                DAL.DAL_ChiTietTheLoai.Delete_ChiTietTheLoai(txt_masach.getText());
                //sửa lại chi tiết thể loại của sách
                for (int i = 0; i < tbl_theloai.getRowCount(); i++) {
                    BLL.BLL_ChiTietTheLoai.them(Integer.parseInt(txt_masach.getText()), tbl_theloai.getValueAt(i, 1).toString());
                }
                break;
            case 2:
                // Thêm Dữ liệu sách
                BLL.BLL_sach.them(txt_tensach.getText()
                        , txt_soluong.getText(), txt_tinhtrangsach.getText()
                        , txt_giasach.getText(), txt_gianhap.getText()
                        , txt_nhaxuatban.getText(), txt_mota.getText());
                //lấy mã sách mới thêm
                ipsach = BLL.BLL_sach.LayIPSach();
                //sửa lại chi tiết tác giả của sách
                
                for (int i = 0; i < tbl_tacgia.getRowCount(); i++) {
                    System.out.println(ipsach);
                    System.out.println(tbl_tacgia.getValueAt(i, 1).toString());
                    BLL.BLL_ChiTietTacGia.them(ipsach,tbl_tacgia.getValueAt(i, 1).toString());
                }
                //sửa lại chi tiết thể loại của sách
                for (int i = 0; i < tbl_theloai.getRowCount(); i++) {
                    BLL.BLL_ChiTietTheLoai.them(ipsach, tbl_theloai.getValueAt(i, 1).toString());
                }
                this.setVisible(false);
                System.out.println("Thêm");
                break;
            default:
                System.out.println("lỗi");
                break;
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        if (frm_main.CNSach == 1) {// Sửa dữ liệu sách
//            
//        } else if(frm_main.CNSach == 2) {// Thêm Dữ liệu sách
//            
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_timkiemtheloaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemtheloaiKeyReleased
        String key = txt_timkiemtheloai.getText();
        BLL.Popupmenu.DLPopupMenuTheLoai(Pmn_theloai, DAL.DAL_TheLoai.timkiemPmn(key),
                "TenTheLoai","MaTheLoai",txt_timkiemtheloai,tbl_theloai);
    }//GEN-LAST:event_txt_timkiemtheloaiKeyReleased


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_thongtinsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_thongtinsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_thongtinsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_thongtinsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_thongtinsach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPopupMenu Pmn_tacgia;
    public static javax.swing.JPopupMenu Pmn_theloai;
    private javax.swing.JButton btn_addtacgia;
    private javax.swing.JButton btn_addtheloai;
    private javax.swing.JButton btn_reset;
    public static javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable tbl_tacgia;
    public static javax.swing.JTable tbl_theloai;
    public static javax.swing.JTextField txt_gianhap;
    public static javax.swing.JTextField txt_giasach;
    public static javax.swing.JTextField txt_masach;
    public static javax.swing.JTextArea txt_mota;
    public static javax.swing.JTextField txt_nhaxuatban;
    public static javax.swing.JTextField txt_soluong;
    public static javax.swing.JTextField txt_tensach;
    public static javax.swing.JTextField txt_timkiemtacgia;
    public static javax.swing.JTextField txt_timkiemtheloai;
    public static javax.swing.JTextField txt_tinhtrangsach;
    // End of variables declaration//GEN-END:variables
}
