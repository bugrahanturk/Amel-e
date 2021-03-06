
package com.amel_e;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GLogin extends javax.swing.JFrame {

    Person person;
    Manager manager;
    public static GMap gMap;
    public static GOrder gOrder;
    public static GCustomerHome gCustomerHome;
    public static GManagerHome gManagerHome;
    public static GupdatedTable gupdatedTable;

    /**
     * Creates new form GLogin1
     */
    public GLogin() {
        initComponents();
        manager = new Manager();
        btn_register.setVisible(false);
        btn_delete.setVisible(false);
        Manager.fillFile();
        Manager.empthyList();
        Manager.fillList();
        gMap = new GMap();
        gOrder = new GOrder();
        gManagerHome = new GManagerHome();
        gupdatedTable = new GupdatedTable();

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
        jPanel2 = new javax.swing.JPanel();
        lbl_amele = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnl_customer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cb_customer = new javax.swing.JCheckBox();
        pnl_carrier = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cb_carier = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        tf_userName = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        pnl_admin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cb_admin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GLogin");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));

        lbl_amele.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lbl_amele.setForeground(new java.awt.Color(255, 255, 255));
        lbl_amele.setText("AMEL-E");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/ameleee.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbl_amele, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addComponent(lbl_amele, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 190));

        pnl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_customerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_customerMouseExited(evt);
            }
        });
        pnl_customer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/icons8-customer-64.png"))); // NOI18N
        pnl_customer.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        cb_customer.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cb_customer.setText("CUSTOMER");
        cb_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_customerActionPerformed(evt);
            }
        });
        pnl_customer.add(cb_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, -1));

        jPanel1.add(pnl_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 150, 110));

        pnl_carrier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_carrierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_carrierMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/icons8-scooter-64.png"))); // NOI18N

        cb_carier.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cb_carier.setText("CARIER");
        cb_carier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_carierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_carrierLayout = new javax.swing.GroupLayout(pnl_carrier);
        pnl_carrier.setLayout(pnl_carrierLayout);
        pnl_carrierLayout.setHorizontalGroup(
            pnl_carrierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cb_carier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_carrierLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnl_carrierLayout.setVerticalGroup(
            pnl_carrierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_carrierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_carier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnl_carrier, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 140, 110));

        lbl_username.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/icons8-add-user-male-26_1.png"))); // NOI18N
        lbl_username.setText("Username:");

        lbl_password.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbl_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/icons8-forgot-password-26.png"))); // NOI18N
        lbl_password.setText("Password :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_password)
                    .addComponent(lbl_username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_userName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pf_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_password)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 270, -1));

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/icons8-login-rounded-up-26.png"))); // NOI18N
        btn_login.setText("LOG IN");
        btn_login.setBorder(null);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        btn_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_loginKeyPressed(evt);
            }
        });

        btn_register.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/icons8-add-user-male-26_1.png"))); // NOI18N
        btn_register.setText("REGISTER");
        btn_register.setBorder(null);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/icons8-delete-bin-26.png"))); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.setBorder(null);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(btn_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 300, 120));

        pnl_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_adminMouseExited(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/icons8-admin-settings-male-64.png"))); // NOI18N

        cb_admin.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cb_admin.setText("ADMIN");
        cb_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_adminLayout = new javax.swing.GroupLayout(pnl_admin);
        pnl_admin.setLayout(pnl_adminLayout);
        pnl_adminLayout.setHorizontalGroup(
            pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_adminLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(cb_admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_adminLayout.setVerticalGroup(
            pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_adminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_admin)
                .addContainerGap())
        );

        jPanel1.add(pnl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 558));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        //hangi check box seçili ise sadece onun için olan giriş yapılıyor.

        if (cb_admin.isSelected()) {
            person = new Manager();

            if (person.login(tf_userName.getText(), pf_password.getText())) {
                JOptionPane.showMessageDialog(this, "Login is Succesful!");

                this.setVisible(false);
                gManagerHome.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Login is Failed! Try Again Please!");
            }
        } else if (cb_customer.isSelected()) {
            person = new Customer();

            if (person.login(tf_userName.getText(), pf_password.getText())) {
                JOptionPane.showMessageDialog(this, "Login is Succesful!");
                GCustomerHome x = new GCustomerHome();
                gCustomerHome = x;
                this.setVisible(false);
                gCustomerHome.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Login is Failed! Try Again Please!");
            }
        } else if (cb_carier.isSelected()) {
            person = new Carier();
            if (person.login(tf_userName.getText(), pf_password.getText())) {
                JOptionPane.showMessageDialog(this, "Login is Succesful!");
                GCarierHome gCarierHome = new GCarierHome();
                this.setVisible(false);
                gCarierHome.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Login is Failed! Try Again Please!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "You Have to Choose Your Role!");

        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        //Registera basınca register frami açılıp login frami kapanıyor.

        GRegister gregister = new GRegister();
        gregister.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        //Deleteye basınca girilmiş olan kullanıcı adı ve şifreye sahip olan hesabı sistemimizden siliyor.

        boolean flag = false;
        for (Customer c : Manager.getCustomer()) {
            if (c.userName.equals(tf_userName.getText()) && c.password.equals(pf_password.getText())) {
                manager.delete(c);
                flag = true;
                break;
            }
        }
        if (flag) {
            JOptionPane.showMessageDialog(this, "Account Deleted!");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_loginKeyPressed
        // Login butonunun üzerine gelince "Enter" a basınca giriş işlemini yapıyor yukarıdaki metothun aynısı.
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cb_admin.isSelected()) {
                person = new Manager();

                if (person.login(tf_userName.getText(), pf_password.getText())) {
                    JOptionPane.showMessageDialog(this, "Login is Succesful!");
                    this.setVisible(false);
                    gManagerHome.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(this, "Login is Failed! Try Again Please!");
                }
            } else if (cb_customer.isSelected()) {
                person = new Customer();

                if (person.login(tf_userName.getText(), pf_password.getText())) {
                    JOptionPane.showMessageDialog(this, "Login is Succesful!");
                    this.setVisible(false);
                    GCustomerHome x = new GCustomerHome();
                    gCustomerHome = x;
                    gCustomerHome.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Login is Failed! Try Again Please!");
                }
            } else if (cb_carier.isSelected()) {
                person = new Carier();
                if (person.login(tf_userName.getText(), pf_password.getText())) {
                    JOptionPane.showMessageDialog(this, "Login is Succesful!");
                    GCarierHome gCarierHome = new GCarierHome();
                    this.setVisible(false);
                    gCarierHome.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Login is Failed! Try Again Please!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "You Have to Choose Your Role!");

            }

        }
    }//GEN-LAST:event_btn_loginKeyPressed

    private void pnl_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_adminMouseEntered

        // setColor(pnl_admin);
    }//GEN-LAST:event_pnl_adminMouseEntered

    private void pnl_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_adminMouseExited

        //resetColor(pnl_admin);
    }//GEN-LAST:event_pnl_adminMouseExited

    private void pnl_customerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_customerMouseEntered
        // setColor(pnl_customer);
    }//GEN-LAST:event_pnl_customerMouseEntered

    private void pnl_customerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_customerMouseExited
        // resetColor(pnl_customer);
    }//GEN-LAST:event_pnl_customerMouseExited

    private void pnl_carrierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_carrierMouseEntered
        //setColor(pnl_carrier);
    }//GEN-LAST:event_pnl_carrierMouseEntered

    private void pnl_carrierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_carrierMouseExited
        //resetColor(pnl_carrier);
    }//GEN-LAST:event_pnl_carrierMouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        //setColor(jPanel7);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // resetColor(jPanel7);
    }//GEN-LAST:event_jPanel7MouseExited

    private void cb_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_adminActionPerformed
        cb_carier.setSelected(false);
        cb_customer.setSelected(false);
        btn_register.setVisible(false);
        btn_delete.setVisible(false);
    }//GEN-LAST:event_cb_adminActionPerformed

    private void cb_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_customerActionPerformed
        // TODO add your handling code here:

        cb_carier.setSelected(false);
        cb_admin.setSelected(false);
        btn_register.setVisible(true);
        btn_delete.setVisible(true);


    }//GEN-LAST:event_cb_customerActionPerformed

    private void cb_carierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_carierActionPerformed
        // TODO add your handling code here:
        cb_admin.setSelected(false);
        cb_customer.setSelected(false);
        btn_register.setVisible(false);
        btn_delete.setVisible(false);
    }//GEN-LAST:event_cb_carierActionPerformed
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(240, 240, 240));
    }
    /**
     * @param args the command line arguments
     */
    static int k = 1;
    static int m = 0;
    static int count = 0;

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
            java.util.logging.Logger.getLogger(GLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        String[] bots = {"Emre Aktaş", "N.Buğrahan Türk", "Aysu Sözen"};

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GLogin().setVisible(true);
                
    }
        });
                }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_admin;
    private javax.swing.JCheckBox cb_carier;
    private javax.swing.JCheckBox cb_customer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl_amele;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPanel pnl_admin;
    private javax.swing.JPanel pnl_carrier;
    private javax.swing.JPanel pnl_customer;
    private javax.swing.JTextField tf_userName;
    // End of variables declaration//GEN-END:variables
}
