/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amel_e;

import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nbt
 */
public class GupdatedTable extends javax.swing.JFrame {

    /**
     * Creates new form GupdatedTable
     */
    CardLayout cardLayout;
    public GupdatedTable() {
        initComponents();
        cardLayout = (CardLayout) pnl_cardlayout.getLayout();
        GOrder.fillProducts2();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rb_drink = new javax.swing.JRadioButton();
        rb_other = new javax.swing.JRadioButton();
        rb_food = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_cardlayout = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnl_food = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ufood = new javax.swing.JTable();
        pnl_drink = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_udrink = new javax.swing.JTable();
        pnl_others = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_uothers = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rb_drink);
        rb_drink.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        rb_drink.setText("Drink");
        rb_drink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_drinkActionPerformed(evt);
            }
        });
        jPanel1.add(rb_drink, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 98, -1));

        buttonGroup1.add(rb_other);
        rb_other.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        rb_other.setText("Others");
        rb_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_otherActionPerformed(evt);
            }
        });
        jPanel1.add(rb_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 99, -1));

        buttonGroup1.add(rb_food);
        rb_food.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        rb_food.setText("Food");
        rb_food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_foodActionPerformed(evt);
            }
        });
        jPanel1.add(rb_food, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 90, -1));

        jPanel2.setBackground(new java.awt.Color(42, 118, 232));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/ameleee.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 914, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 180));

        pnl_cardlayout.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/order_list_167825.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pnl_cardlayout.add(jPanel3, "card5");

        tbl_ufood.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbl_ufood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Category", "Price"
            }
        ));
        tbl_ufood.setFocusable(false);
        tbl_ufood.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_ufood.setRowHeight(25);
        tbl_ufood.setSelectionBackground(new java.awt.Color(42, 118, 232));
        tbl_ufood.setShowVerticalLines(false);
        tbl_ufood.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_ufood);

        javax.swing.GroupLayout pnl_foodLayout = new javax.swing.GroupLayout(pnl_food);
        pnl_food.setLayout(pnl_foodLayout);
        pnl_foodLayout.setHorizontalGroup(
            pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        pnl_foodLayout.setVerticalGroup(
            pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pnl_cardlayout.add(pnl_food, "pnl_food");

        tbl_udrink.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbl_udrink.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Category", "Price"
            }
        ));
        tbl_udrink.setFocusable(false);
        tbl_udrink.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_udrink.setRowHeight(25);
        tbl_udrink.setSelectionBackground(new java.awt.Color(42, 118, 232));
        tbl_udrink.setShowVerticalLines(false);
        tbl_udrink.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_udrink);

        javax.swing.GroupLayout pnl_drinkLayout = new javax.swing.GroupLayout(pnl_drink);
        pnl_drink.setLayout(pnl_drinkLayout);
        pnl_drinkLayout.setHorizontalGroup(
            pnl_drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        pnl_drinkLayout.setVerticalGroup(
            pnl_drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_drinkLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_cardlayout.add(pnl_drink, "pnl_drink");

        jScrollPane4.setFocusable(false);

        tbl_uothers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbl_uothers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Category", "Price"
            }
        ));
        tbl_uothers.setFocusable(false);
        tbl_uothers.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_uothers.setRowHeight(25);
        tbl_uothers.setSelectionBackground(new java.awt.Color(42, 118, 232));
        tbl_uothers.setShowVerticalLines(false);
        tbl_uothers.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbl_uothers);

        javax.swing.GroupLayout pnl_othersLayout = new javax.swing.GroupLayout(pnl_others);
        pnl_others.setLayout(pnl_othersLayout);
        pnl_othersLayout.setHorizontalGroup(
            pnl_othersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(pnl_othersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );
        pnl_othersLayout.setVerticalGroup(
            pnl_othersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(pnl_othersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );

        pnl_cardlayout.add(pnl_others, "pnl_others");

        jPanel1.add(pnl_cardlayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 500, 450));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb_foodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_foodActionPerformed
        // bu ve alttaki 2 method hangi radio button seçili ise onun panelini aktif ediyor.
        if (rb_food.isSelected()) {
            cardLayout.show(pnl_cardlayout, "pnl_food");
        }
    }//GEN-LAST:event_rb_foodActionPerformed

    private void rb_drinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_drinkActionPerformed
        // TODO add your handling code here:
        if (rb_drink.isSelected()) {
            cardLayout.show(pnl_cardlayout, "pnl_drink");
        }
    }//GEN-LAST:event_rb_drinkActionPerformed

    private void rb_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_otherActionPerformed
        // TODO add your handling code here:
        if (rb_other.isSelected()) {
            cardLayout.show(pnl_cardlayout, "pnl_others");
        }
    }//GEN-LAST:event_rb_otherActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model4 = (DefaultTableModel) tbl_ufood.getModel();
        DefaultTableModel model5 = (DefaultTableModel) tbl_udrink.getModel();
        DefaultTableModel model6 = (DefaultTableModel) tbl_uothers.getModel();
        int count1 = tbl_ufood.getSelectedRow();
        int count2 = tbl_udrink.getSelectedRow();
        int count3 = tbl_uothers.getSelectedRow();
       
        
        if(rb_food.isSelected()){
            GManagerHome.tf_productName.setText(tbl_ufood.getValueAt(count1, 0).toString());
            GManagerHome.tf_price.setText(tbl_ufood.getValueAt(count1, 2).toString().split(" ")[0]);
            GManagerHome.cb_category.setSelectedIndex(0);
        }
            
        if(rb_drink.isSelected()){
            GManagerHome.tf_productName.setText(tbl_udrink.getValueAt(count2, 0).toString());
            GManagerHome.tf_price.setText(tbl_udrink.getValueAt(count2, 2).toString().split(" ")[0]);
            GManagerHome.cb_category.setSelectedIndex(1);
        }
            
        if(rb_other.isSelected()){
            GManagerHome.tf_productName.setText(tbl_uothers.getValueAt(count3, 0).toString());
            GManagerHome.tf_price.setText(tbl_uothers.getValueAt(count3, 2).toString().split(" ")[0]);
            GManagerHome.cb_category.setSelectedIndex(2);
        }
           this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GupdatedTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GupdatedTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GupdatedTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GupdatedTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GupdatedTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnl_cardlayout;
    private javax.swing.JPanel pnl_drink;
    private javax.swing.JPanel pnl_food;
    private javax.swing.JPanel pnl_others;
    public static javax.swing.JRadioButton rb_drink;
    public static javax.swing.JRadioButton rb_food;
    public static javax.swing.JRadioButton rb_other;
    public static javax.swing.JTable tbl_udrink;
    public static javax.swing.JTable tbl_ufood;
    public static javax.swing.JTable tbl_uothers;
    // End of variables declaration//GEN-END:variables
}