package com.amel_e;

import static com.amel_e.GupdatedTable.tbl_udrink;
import static com.amel_e.GupdatedTable.tbl_ufood;
import static com.amel_e.GupdatedTable.tbl_uothers;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.DTDConstants;

public class GOrder extends javax.swing.JFrame implements Runnable {

    /**
     * FONT Creates new form GOrder
     */
    static Thread tt;
    CardLayout cardLayout;

    public GOrder() {
       
        initComponents();
        GOrder.fillProducts();
        cardLayout = (CardLayout) pnl_parent.getLayout();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        tbl_food.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tbl_food.getTableHeader().setOpaque(false);
        tbl_food.getTableHeader().setBackground(Color.BLACK);//???
        tbl_food.getTableHeader().setForeground(Color.BLACK);
        tbl_food.setRowHeight(25);

        tbl_drink.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tbl_drink.getTableHeader().setOpaque(false);
        tbl_drink.getTableHeader().setBackground(Color.BLACK);//???
        tbl_drink.getTableHeader().setForeground(Color.BLACK);
        tbl_drink.setRowHeight(25);

        tbl_others.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tbl_others.getTableHeader().setOpaque(false);
        tbl_others.getTableHeader().setBackground(Color.BLACK);//???
        tbl_others.getTableHeader().setForeground(Color.BLACK);
        tbl_others.setRowHeight(25);

        tbl_basket.getTableHeader().setFont(new Font("Segoe UI", Font.CENTER_BASELINE, 14));
        tbl_basket.getTableHeader().setOpaque(false);
        tbl_basket.getTableHeader().setBackground(Color.BLACK);//???
        tbl_basket.getTableHeader().setForeground(Color.BLACK);
        tbl_basket.setRowHeight(25);
         pnl_tip.setVisible(false);
         Carier.setTips(0.0);
    }
    public static double total = 0.0;
    private static int num = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        rb_drink = new javax.swing.JRadioButton();
        rb_food = new javax.swing.JRadioButton();
        rb_other = new javax.swing.JRadioButton();
        pnl_parent = new javax.swing.JPanel();
        pnl_empthy = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_food = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_food = new javax.swing.JTable();
        pnl_drink = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_drink = new javax.swing.JTable();
        pnl_other = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_others = new javax.swing.JTable();
        btn_buy = new javax.swing.JButton();
        pnl_basket = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_basket = new javax.swing.JTable();
        lbl_total = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_tips = new javax.swing.JButton();
        pnl_tip = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_amount = new javax.swing.JTextField();
        btn_give = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GOrder");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(42, 118, 232));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/ameleee.jpg"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORDER");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("amel-e");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 699, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, -1));

        btn_add.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 256, 424, -1));

        btn_delete.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 305, 424, -1));

        buttonGroup1.add(rb_drink);
        rb_drink.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        rb_drink.setText("Drink");
        rb_drink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_drinkActionPerformed(evt);
            }
        });
        jPanel2.add(rb_drink, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 266, 98, -1));

        buttonGroup1.add(rb_food);
        rb_food.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        rb_food.setText("Food");
        rb_food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_foodActionPerformed(evt);
            }
        });
        jPanel2.add(rb_food, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 266, 90, -1));

        buttonGroup1.add(rb_other);
        rb_other.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        rb_other.setText("Others");
        rb_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_otherActionPerformed(evt);
            }
        });
        jPanel2.add(rb_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(1023, 266, 99, -1));

        pnl_parent.setLayout(new java.awt.CardLayout());

        pnl_empthy.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/amel_e/ingredients-list-icon--icon-search-engine-10.png"))); // NOI18N

        javax.swing.GroupLayout pnl_empthyLayout = new javax.swing.GroupLayout(pnl_empthy);
        pnl_empthy.setLayout(pnl_empthyLayout);
        pnl_empthyLayout.setHorizontalGroup(
            pnl_empthyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        pnl_empthyLayout.setVerticalGroup(
            pnl_empthyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pnl_parent.add(pnl_empthy, "card5");

        tbl_food.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbl_food.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null}
            },
            new String [] {
                "Product Name", "Category", "Price"
            }
        ));
        tbl_food.setFocusable(false);
        tbl_food.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_food.setRowHeight(25);
        tbl_food.setSelectionBackground(new java.awt.Color(42, 118, 232));
        tbl_food.setShowVerticalLines(false);
        tbl_food.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_food);

        javax.swing.GroupLayout pnl_foodLayout = new javax.swing.GroupLayout(pnl_food);
        pnl_food.setLayout(pnl_foodLayout);
        pnl_foodLayout.setHorizontalGroup(
            pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        pnl_foodLayout.setVerticalGroup(
            pnl_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pnl_parent.add(pnl_food, "pnl_food");

        tbl_drink.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbl_drink.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null}
            },
            new String [] {
                "Product Name", "Category", "Price"
            }
        ));
        tbl_drink.setFocusable(false);
        tbl_drink.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_drink.setRowHeight(25);
        tbl_drink.setSelectionBackground(new java.awt.Color(42, 118, 232));
        tbl_drink.setShowVerticalLines(false);
        tbl_drink.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_drink);

        javax.swing.GroupLayout pnl_drinkLayout = new javax.swing.GroupLayout(pnl_drink);
        pnl_drink.setLayout(pnl_drinkLayout);
        pnl_drinkLayout.setHorizontalGroup(
            pnl_drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        pnl_drinkLayout.setVerticalGroup(
            pnl_drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pnl_parent.add(pnl_drink, "pnl_drink");

        jScrollPane4.setFocusable(false);

        tbl_others.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbl_others.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null}
            },
            new String [] {
                "Product Name", "Category", "Price"
            }
        ));
        tbl_others.setFocusable(false);
        tbl_others.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_others.setRowHeight(25);
        tbl_others.setSelectionBackground(new java.awt.Color(42, 118, 232));
        tbl_others.setShowVerticalLines(false);
        tbl_others.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbl_others);

        javax.swing.GroupLayout pnl_otherLayout = new javax.swing.GroupLayout(pnl_other);
        pnl_other.setLayout(pnl_otherLayout);
        pnl_otherLayout.setHorizontalGroup(
            pnl_otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        pnl_otherLayout.setVerticalGroup(
            pnl_otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pnl_parent.add(pnl_other, "pnl_other");

        jPanel2.add(pnl_parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 315, -1, -1));

        btn_buy.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_buy.setText("BUY");
        btn_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyActionPerformed(evt);
            }
        });
        jPanel2.add(btn_buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 970, 430, -1));

        pnl_basket.setBackground(new java.awt.Color(255, 255, 255));
        pnl_basket.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BASKET", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(42, 118, 232))); // NOI18N

        tbl_basket.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbl_basket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Category", "Price"
            }
        ));
        tbl_basket.setFocusable(false);
        tbl_basket.setSelectionBackground(new java.awt.Color(42, 118, 232));
        tbl_basket.setShowVerticalLines(false);
        tbl_basket.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tbl_basket);

        javax.swing.GroupLayout pnl_basketLayout = new javax.swing.GroupLayout(pnl_basket);
        pnl_basket.setLayout(pnl_basketLayout);
        pnl_basketLayout.setHorizontalGroup(
            pnl_basketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnl_basketLayout.setVerticalGroup(
            pnl_basketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        jPanel2.add(pnl_basket, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 356, -1, -1));

        lbl_total.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_total.setText("Total: ");
        jPanel2.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 867, 260, 22));

        btn_back.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 940, 98, -1));

        btn_tips.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_tips.setText("TIP?");
        btn_tips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tipsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tips, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 930, 100, 32));

        pnl_tip.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 118, 232));
        jLabel3.setText("Please enter amount for giving tips ");

        btn_give.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_give.setText("GIVE!");
        btn_give.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_tipLayout = new javax.swing.GroupLayout(pnl_tip);
        pnl_tip.setLayout(pnl_tipLayout);
        pnl_tipLayout.setHorizontalGroup(
            pnl_tipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tipLayout.createSequentialGroup()
                .addGroup(pnl_tipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_tipLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(tf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 120, Short.MAX_VALUE))
                    .addGroup(pnl_tipLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnl_tipLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btn_give)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_tipLayout.setVerticalGroup(
            pnl_tipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tipLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_give)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pnl_tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 880, 410, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 1030));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb_foodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_foodActionPerformed
        // bu ve alttaki 2 method hangi radio button seçili ise onun panelini aktif ediyor.
        if (rb_food.isSelected()) {
            cardLayout.show(pnl_parent, "pnl_food");
        }
    }//GEN-LAST:event_rb_foodActionPerformed

    private void rb_drinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_drinkActionPerformed
        // TODO add your handling code here:
        if (rb_drink.isSelected()) {
            cardLayout.show(pnl_parent, "pnl_drink");
        }
    }//GEN-LAST:event_rb_drinkActionPerformed

    private void rb_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_otherActionPerformed
        // TODO add your handling code here:
        if (rb_other.isSelected()) {
            cardLayout.show(pnl_parent, "pnl_other");
        }
    }//GEN-LAST:event_rb_otherActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        //add butonuna basınca tabloya ürünü ekliyor ve tutarını hesaplıyor.
        //System clastaki add methodunu kullanıyoruz.
        if (tbl_food.getSelectedRow()==-1 && tbl_drink.getSelectedRow()==-1 && tbl_others.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(this, "Please select PRODUCT!");
        }
        else{
            Manager.getCustomer().get(Manager.getIndex()).getS1().add();
        }  
        


    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        //delete butonuna basınca tablodan ürünü siliyor ve tutarını totalden düşüyor.
        //System clastaki delete methodunu kullanıyoruz. 
        
        if (tbl_basket.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(this, "Please select product that you want to delete!");
        }
        Manager.getCustomer().get(Manager.getIndex()).getS1().delete();

    }//GEN-LAST:event_btn_deleteActionPerformed


    private void btn_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyActionPerformed
        // müşterinin parası tutardan çoksa seçtiği ürünleri alıyor ve thread harekete başlıyor.
        
        
        if(tbl_drink.getSelectedRow()==-1 && tbl_food.getSelectedRow()==-1 && tbl_others.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "Please add item to basket for buy!!");
        }
            
        else if (Double.valueOf(Manager.getCustomer().get(Manager.getIndex()).getAccount()) >= total) {
            fillOrdersFile();
            double res = Double.valueOf(Manager.getCustomer().get(Manager.getIndex()).getAccount()) - total;
            Manager.getCustomer().get(Manager.getIndex()).setAccount(String.valueOf(res));
            
            
            tt = new Thread(new Move(Manager.getCustomer().get(Manager.getIndex()).getAddress(), Manager.getCustomer().get(Manager.getIndex()).getName() + " " + Manager.getCustomer().get(Manager.getIndex()).getName()));
            tt.start();
            
            Manager.fillFile();
            Manager.empthyList();
            Manager.fillList();
            
            JOptionPane.showMessageDialog(this, "Order completed, please OPEN MAP for cargo tracking!");
            new GCustomerHome().setVisible(true);
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(this, "Money is suffecient!!");
        }


    }//GEN-LAST:event_btn_buyActionPerformed

    public static void fillProducts() {
        //adminin managerhome da eklediği ürünü tablomuza eklemek için kullanıyoruz.
       
        DefaultTableModel model1 = (DefaultTableModel) tbl_food.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tbl_drink.getModel();
        DefaultTableModel model3 = (DefaultTableModel) tbl_others.getModel();

        BufferedReader reader;
        String line = "";
        String res = "";
        String[] control;
        int count1 = 0, count2 = 0, count3 = 0, sayi = 0;
        boolean flag1 = true, flag2 = true, flag3 = true;
        try {
            reader = new BufferedReader(new FileReader("/home/nbt/Documents/Amel_e/src/com/amel_e/Product.txt"));
            line = reader.readLine();
            while (line != null) {

                res += line;
                res += " ";
                sayi++;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (res != null) {
            control = res.split(" ");
            for (int i = 0; i < 30; i++) {
                if (model1.getValueAt(i, 2) == null && flag1) {
                    count1 = i;
                    flag1 = false;
                }

                if (model2.getValueAt(i, 2) == null && flag2) {
                    count2 = i;
                    flag2 = false;
                }

                if (model3.getValueAt(i, 2) == null && flag3) {
                    count3 = i;
                    flag3 = false;
                }

            }
            for (int i = 0; i < sayi * 3; i += 3) {
                if (control[i + 1].equals("Food")) {
                    
                    model1.setValueAt(control[i], count1, 0);
                    model1.setValueAt(control[i + 1], count1, 1);
                    model1.setValueAt(control[i + 2], count1++, 2);
                    
                }
                if (control[i + 1].equals("Drink")) {
                   
                    model2.setValueAt(control[i], count2, 0);
                    model2.setValueAt(control[i + 1], count2, 1);
                    model2.setValueAt(control[i + 2], count2++, 2);
                   
                }
                if (control[i + 1].equals("Others")) {
                 
                    model3.setValueAt(control[i], count3, 0);
                    model3.setValueAt(control[i + 1], count3, 1);
                    model3.setValueAt(control[i + 2], count3++, 2);
                   
                }
            }

        }

    }
    
    public static void fillProducts2() {
        //adminin managerhome da eklediği ürünü tablomuza eklemek için kullanıyoruz.
        
        DefaultTableModel model4 = (DefaultTableModel) tbl_ufood.getModel();
        DefaultTableModel model5 = (DefaultTableModel) tbl_udrink.getModel();
        DefaultTableModel model6 = (DefaultTableModel) tbl_uothers.getModel();
        
        BufferedReader reader;
        String line = "";
        String res = "";
        String[] control;
        int count1 = 0, count2 = 0, count3 = 0, sayi = 0;
        boolean flag1 = true, flag2 = true, flag3 = true;
        try {
            reader = new BufferedReader(new FileReader("/home/nbt/Documents/Amel_e/src/com/amel_e/Product.txt"));
            line = reader.readLine();
            while (line != null) {

                res += line;
                res += " ";
                sayi++;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (res != null) {
            control = res.split(" ");
            for (int i = 0; i < 30; i++) {
                if (model4.getValueAt(i, 2) == null && flag1) {
                    count1 = i;
                    flag1 = false;
                }

                if (model5.getValueAt(i, 2) == null && flag2) {
                    count2 = i;
                    flag2 = false;
                }

                if (model6.getValueAt(i, 2) == null && flag3) {
                    count3 = i;
                    flag3 = false;
                }

            }
            for (int i = 0; i < sayi * 3; i += 3) {
                if (control[i + 1].equals("Food")) {
                 
                    model4.setValueAt(control[i], count1, 0);
                    model4.setValueAt(control[i + 1], count1, 1);
                    model4.setValueAt(control[i + 2], count1++, 2);
                }
                if (control[i + 1].equals("Drink")) {
                    
                   model5.setValueAt(control[i], count2, 0);
                    model5.setValueAt(control[i + 1], count2, 1);
                    model5.setValueAt(control[i + 2], count2++, 2);
                }
                if (control[i + 1].equals("Others")) {
                   
                   model6.setValueAt(control[i], count3, 0);
                   model6.setValueAt(control[i + 1], count3, 1);
                  model6.setValueAt(control[i + 2], count3++, 2);
                }
            }

        }

    }

    public void fillOrdersFile() {
        //Müşterinin aldığı ürünleri dosyaya yazıyor.
        String line = "";
        FileOutputStream fos = null;

        DefaultTableModel model = (DefaultTableModel) tbl_basket.getModel();
        int secili_row = tbl_basket.getSelectedRow();
        line += Manager.getCustomer().get(Manager.getIndex()).name + Manager.getCustomer().get(Manager.getIndex()).surname + "\n";
        int count = tbl_basket.getRowCount();
        for (int i = 0; i < count; i++) {
            line += tbl_basket.getValueAt(i, 0).toString() + " " + tbl_basket.getValueAt(i, 1).toString() + " " + tbl_basket.getValueAt(i, 2).toString() + "\n";
        }
        line += "key\n";
        byte[] info = line.getBytes();
        try {
            fos = new FileOutputStream("/home/nbt/Documents/Amel_e/src/com/amel_e/Orders.txt", true);
            fos.write(info);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // bir önceki frame dönüyor.
        //double res = Double.valueOf(Manager.getCustomer().get(Manager.getIndex()).getAccount()) - total;
       //GLogin.gCustomerHome.getLbl_account().setText("Account: " + String.valueOf(res));
        new GCustomerHome().setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_tipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tipsActionPerformed
        pnl_tip.setVisible(true);
    }//GEN-LAST:event_btn_tipsActionPerformed

    private void btn_giveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giveActionPerformed
        // TODO add your handling code here:
        
        if (tf_amount.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "If you won't give some tips Why did you press give button? :/");
            pnl_tip.setVisible(false);
        }
        else{

        double tip = Double.valueOf(tf_amount.getText());
        Carier.setTips(tip);
        double res = Double.parseDouble(Manager.getCustomer().get(Manager.getIndex()).getAccount()) - tip;
        Manager.getCustomer().get(Manager.getIndex()).setAccount(res+"");
        pnl_tip.setVisible(false);
        }
        
    }//GEN-LAST:event_btn_giveActionPerformed

    @Override
    public void run() {
    }

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
            java.util.logging.Logger.getLogger(GOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ExecutorService executor2 = Executors.newFixedThreadPool(3);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GOrder().setVisible(true);
                //executor2.submit(tt);
                //  executor2.shutdown();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_give;
    private javax.swing.JButton btn_tips;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JLabel lbl_total;
    private javax.swing.JPanel pnl_basket;
    private javax.swing.JPanel pnl_drink;
    private javax.swing.JPanel pnl_empthy;
    private javax.swing.JPanel pnl_food;
    private javax.swing.JPanel pnl_other;
    private javax.swing.JPanel pnl_parent;
    private javax.swing.JPanel pnl_tip;
    public static javax.swing.JRadioButton rb_drink;
    public static javax.swing.JRadioButton rb_food;
    public static javax.swing.JRadioButton rb_other;
    public static javax.swing.JTable tbl_basket;
    public static javax.swing.JTable tbl_drink;
    public static javax.swing.JTable tbl_food;
    public static javax.swing.JTable tbl_others;
    private javax.swing.JTextField tf_amount;
    // End of variables declaration//GEN-END:variables

}
