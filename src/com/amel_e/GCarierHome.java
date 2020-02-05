
package com.amel_e;



import javax.swing.JOptionPane;

public class GCarierHome extends javax.swing.JFrame {

    /**
     * Creates new form GCarierHome
     */
    public GCarierHome() {
        initComponents();

        lbl_name_surname.setText( Carier.getCarier().get(0).name + " " + Carier.getCarier().get(0).surname);
        lbl_tips.setText("Tips: " + Carier.getTips());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_name_surname = new javax.swing.JLabel();
        lbl_tips = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_amount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_withdraw = new javax.swing.JButton();
        tf_card_number = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lbl_name_surname.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_name_surname.setForeground(new java.awt.Color(45, 118, 232));
        lbl_name_surname.setText("name");

        lbl_tips.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_tips.setForeground(new java.awt.Color(45, 118, 232));
        lbl_tips.setText("tips");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name_surname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tips, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_tips)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 232));
        jLabel1.setText("Amount: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 41));

        tf_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_amountActionPerformed(evt);
            }
        });
        jPanel2.add(tf_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 70, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 232));
        jLabel2.setText("Card Number: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, 42));

        btn_withdraw.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_withdraw.setText("Withdraw");
        btn_withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_withdrawActionPerformed(evt);
            }
        });
        jPanel2.add(btn_withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 170, 42));
        jPanel2.add(tf_card_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 90, 40));

        jPanel3.setBackground(new java.awt.Color(45, 118, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARRIER");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 100));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("amel-e");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/ameleee.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 180));

        btn_back.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_amountActionPerformed

    private void btn_withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_withdrawActionPerformed
        // kuryenin bahşişleri çekmek için kullanacağı method.
        
        if(tf_amount.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter AMOUNT that you want to withdraw it!");
        }else if(tf_card_number.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter CARD NUMBER to withdraw your money!");
        }
        
        
        else if (Carier.getTips() >= Double.valueOf(tf_amount.getText())) {
            double res = Carier.getTips() - Double.valueOf(tf_amount.getText());
            Carier.withDraw(res);
            lbl_tips.setText(String.valueOf(res));
        } else {
            JOptionPane.showMessageDialog(this, "Sorry,Your tips does not enough to take that money");
            tf_amount.setText(null);
            tf_card_number.setText(null);
        }

    }//GEN-LAST:event_btn_withdrawActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.setVisible(false);
        new GLogin().setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(GCarierHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GCarierHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GCarierHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GCarierHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GCarierHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_withdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbl_name_surname;
    private javax.swing.JLabel lbl_tips;
    private javax.swing.JTextField tf_amount;
    private javax.swing.JTextField tf_card_number;
    // End of variables declaration//GEN-END:variables
}