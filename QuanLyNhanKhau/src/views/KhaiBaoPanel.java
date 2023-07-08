package views;

import controllers.KhaiBaoManagerController.KhaiBaoMangerPanelController;
import services.KhaiBaoService;
import views.KhaiBaoManagerFrame.ThemMoiKhaiBao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;


public class KhaiBaoPanel extends javax.swing.JPanel {
    private JFrame parentFrame;
    private KhaiBaoMangerPanelController controller = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JLabel textNote;

    /**
     * Creates new form KhaiBaoPanel
     */
    public KhaiBaoPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        this.controller = new KhaiBaoMangerPanelController(tablePanel, jtfSearch);
        controller.setParentJFrame(parentFrame);
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
        tablePanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        textNote = new javax.swing.JLabel();
        jtfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(855, 465));


        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Xóa ");
        jButton1.setPreferredSize(new java.awt.Dimension(101, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Button1Action(e);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Thêm mới");
        jButton2.setBackground(Color.RED);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Button2Action(e);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
                tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
                tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 389, Short.MAX_VALUE)
        );


        textNote.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        textNote.setText("Tìm kiếm theo tên hoặc số CMT");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(textNote, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        )
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textNote, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 306, Short.MAX_VALUE)))
                                .addContainerGap())
        );

    }// </editor-fold>//GEN-END:initComponents

    public void Button2Action(ActionEvent e) {
        ThemMoiKhaiBao themMoi = new ThemMoiKhaiBao(this.controller, this.parentFrame);
        themMoi.setVisible(true);
        themMoi.setLocationRelativeTo(null);
        themMoi.setResizable(true);
        ThemMoiKhaiBao themMoiKhaiBao = new ThemMoiKhaiBao();
        if(themMoiKhaiBao.stateButton == 1){
            KhaiBaoService khaiBaoService = new KhaiBaoService();
            controller.khaiBaoBeanList = khaiBaoService.getListKhaiBao("");
            controller.setDataTable();
        }

    }

    public void Button1Action(ActionEvent e) {
        try {
            if (this.controller.xoaKhaiBao(this.controller.getKhaiBaoBean())){
                JOptionPane.showMessageDialog(null,"Xóa thành công!");
                controller.refreshData();
            }

        } catch (Exception exception){
            System.out.println(exception.getMessage());
            JOptionPane.showMessageDialog(null, "Chọn thông tin test trước khi xóa!");
        }



    }

    private void jtfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchActionPerformed
        // TODO add your handling code here:
    }


    // End of variables declaration//GEN-END:variables
}
