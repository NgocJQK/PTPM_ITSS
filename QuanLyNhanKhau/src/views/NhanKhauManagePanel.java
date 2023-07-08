package views;

import controllers.NhanKhauManagerPanelController;
import views.NhanKhauManagerFrame.AddNewPeopleJFrame;
import views.NhanKhauManagerFrame.DangKyTamTruJFrame;
import views.NhanKhauManagerFrame.DangKyTamVangJFrame;
import views.NhanKhauManagerFrame.KhaiTuJFrame;

import javax.swing.*;


public class NhanKhauManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form NhanKhauManagePanel
     */
    private NhanKhauManagerPanelController controller = null;
    private JFrame parentJFrame;
    public NhanKhauManagePanel(JFrame parentFrame) {
        this.parentJFrame = parentFrame;
        initComponents();
        controller = new NhanKhauManagerPanelController(tablePanel, jtfSearch);
        controller.setParentJFrame(parentJFrame);
        controller.setDataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tamVangBtn = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        addNewBtn = new javax.swing.JButton();
        tamTruBtn = new javax.swing.JButton();
        khaiTuBtn = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tamVangBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tamVangBtn.setText("ĐK tạm vắng");
        tamVangBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamVangBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        addNewBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addNewBtn.setText("Thêm mới");
        addNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBtnActionPerformed(evt);
            }
        });

        tamTruBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tamTruBtn.setText("ĐK tạm trú");
        tamTruBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamTruBtnActionPerformed(evt);
            }
        });

        khaiTuBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        khaiTuBtn.setText("Khai Tử");
        khaiTuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khaiTuBtnActionPerformed(evt);
            }
        });

        jtfSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nhập tên để tìm kiếm: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addNewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tamVangBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(tamTruBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(khaiTuBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tamVangBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tamTruBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(khaiTuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBtnActionPerformed
        AddNewPeopleJFrame addNewPeopleJFrame = new AddNewPeopleJFrame(this.controller, this.parentJFrame);
        addNewPeopleJFrame.setLocationRelativeTo(null);
        addNewPeopleJFrame.setResizable(false);
        addNewPeopleJFrame.setVisible(true);
    }//GEN-LAST:event_addNewBtnActionPerformed

    private void tamVangBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamVangBtnActionPerformed
        // hien jframe dang ky tam vang
        DangKyTamVangJFrame dangKyTamVangJFrame = new DangKyTamVangJFrame(this.parentJFrame);
        dangKyTamVangJFrame.setLocationRelativeTo(null);
        dangKyTamVangJFrame.setResizable(false);
        dangKyTamVangJFrame.setVisible(true);
    }//GEN-LAST:event_tamVangBtnActionPerformed

    private void tamTruBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamTruBtnActionPerformed
        DangKyTamTruJFrame dangKyTamTruJFrame = new DangKyTamTruJFrame(this.parentJFrame);
        dangKyTamTruJFrame.setLocationRelativeTo(null);
        dangKyTamTruJFrame.setResizable(false);
        dangKyTamTruJFrame.setVisible(true);
    }//GEN-LAST:event_tamTruBtnActionPerformed

    private void khaiTuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khaiTuBtnActionPerformed
        KhaiTuJFrame khaiTuJFrame = new KhaiTuJFrame(this.parentJFrame);
        khaiTuJFrame.setLocationRelativeTo(null);
        khaiTuJFrame.setResizable(false);
        khaiTuJFrame.setVisible(true);
    }//GEN-LAST:event_khaiTuBtnActionPerformed

    private void jtfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JButton khaiTuBtn;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton tamTruBtn;
    private javax.swing.JButton tamVangBtn;
    // End of variables declaration//GEN-END:variables
}
