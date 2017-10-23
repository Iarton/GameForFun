/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjjogowar;

import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.ClassOpt;


public class frmJogo extends javax.swing.JFrame {

    int Life1 = 100, Life2 = 100;
    int total1, total2, action1 = 5, action2 = 5;
    String Life1t, Pname1; 
    frmMenu menut;
    public frmJogo(ClassOpt opt, frmMenu menut) {
        initComponents();
        setLocationRelativeTo(null);
        this.menut=menut;
        getContentPane().setBackground(Color.YELLOW);
        Pname1 = menut.getOpt().getName1();
        PlayName1.setText(Pname1);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtack1 = new javax.swing.JButton();
        btnAtack2 = new javax.swing.JButton();
        lblVida1 = new javax.swing.JLabel();
        lblVida2 = new javax.swing.JLabel();
        PlayName1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRep1 = new javax.swing.JButton();
        btnRep2 = new javax.swing.JButton();
        Action1 = new javax.swing.JLabel();
        Result1 = new javax.swing.JLabel();
        Result2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnHold1 = new javax.swing.JButton();
        btnHold2 = new javax.swing.JButton();
        btnCharge1 = new javax.swing.JButton();
        btnCharge2 = new javax.swing.JButton();
        pgsVida1 = new javax.swing.JProgressBar();
        pgsVida2 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WarGame");
        setBackground(new java.awt.Color(102, 204, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnAtack1.setBackground(new java.awt.Color(255, 0, 0));
        btnAtack1.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        btnAtack1.setText("Atack!  (-2 AP)");
        btnAtack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtack1MouseClicked(evt);
            }
        });
        btnAtack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtack1ActionPerformed(evt);
            }
        });

        btnAtack2.setBackground(new java.awt.Color(255, 0, 0));
        btnAtack2.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        btnAtack2.setText("Atack!  (-2 AP)");
        btnAtack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtack2MouseClicked(evt);
            }
        });
        btnAtack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtack2ActionPerformed(evt);
            }
        });

        lblVida1.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        lblVida1.setText("100");

        lblVida2.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        lblVida2.setText("100");

        PlayName1.setBackground(new java.awt.Color(204, 204, 0));
        PlayName1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        PlayName1.setText("Player 1");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setText("Player 2");

        btnRep1.setBackground(new java.awt.Color(0, 204, 255));
        btnRep1.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        btnRep1.setText("Repair (-3 AP)");
        btnRep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep1ActionPerformed(evt);
            }
        });

        btnRep2.setBackground(new java.awt.Color(0, 204, 255));
        btnRep2.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        btnRep2.setText("Repair (-3 AP)");
        btnRep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep2ActionPerformed(evt);
            }
        });

        Action1.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        Action1.setText("Report:");

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel4.setText("HP");

        jLabel5.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel5.setText("Action Points");

        jLabel7.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        jLabel7.setText("5");

        jLabel8.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        jLabel8.setText("5");
        jLabel8.setToolTipText("");

        btnHold1.setBackground(new java.awt.Color(153, 153, 153));
        btnHold1.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        btnHold1.setText("HOLD!!! (+1 AP)");
        btnHold1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHold1ActionPerformed(evt);
            }
        });

        btnHold2.setBackground(new java.awt.Color(153, 153, 153));
        btnHold2.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        btnHold2.setText("HOLD!!! (+1 AP)");
        btnHold2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHold2ActionPerformed(evt);
            }
        });

        btnCharge1.setBackground(new java.awt.Color(255, 102, 0));
        btnCharge1.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        btnCharge1.setActionCommand("CHARGE!!!(AP  -5, HP -30)");
        btnCharge1.setLabel("CHARGE!!!(AP  -8, HP -30)");
        btnCharge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharge1ActionPerformed(evt);
            }
        });

        btnCharge2.setBackground(new java.awt.Color(255, 102, 0));
        btnCharge2.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        btnCharge2.setLabel("CHARGE!!!(AP  -8, HP -30)");
        btnCharge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharge2ActionPerformed(evt);
            }
        });

        pgsVida1.setBackground(new java.awt.Color(0, 255, 255));
        pgsVida1.setForeground(new java.awt.Color(255, 0, 0));
        pgsVida1.setValue(100);

        pgsVida2.setForeground(new java.awt.Color(255, 0, 0));
        pgsVida2.setValue(100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnCharge1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCharge2)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(pgsVida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273)
                        .addComponent(pgsVida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(Action1)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(387, 387, 387)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAtack1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRep1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnHold1)
                                            .addComponent(Result1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnHold2))
                                    .addComponent(btnAtack2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Result2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(410, 410, 410)
                                .addComponent(btnRep2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel4)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PlayName1))
                        .addGap(336, 336, 336)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblVida2)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlayName1)
                        .addGap(3, 3, 3)
                        .addComponent(lblVida1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(lblVida2)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pgsVida1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(pgsVida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(107, 107, 107)
                        .addComponent(Action1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnAtack1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(btnRep1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(Result1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnHold1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHold2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnAtack2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(Result2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btnRep2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCharge1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCharge2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtack1MouseClicked
        // TODO add your handling code here:
        Result r = new Result();
            int randomNum = r.getrNum();
            
        action1 = action1 - 2;
        // BOTAO ATACA Playa1 ataca
        this.jLabel7.setText("" + action1);
        if(action1 < 0)  
        {
             
             Life1 = Life1 - 25;
             this.Result1.setText("Rebelião!!!(-25 HP)");   
             this.lblVida1.setText("" + Life1);
             action1 = 0;
             pgsVida1.setValue(Life1);
             this.jLabel7.setText(""+action1);
            btnAtack1.setEnabled(false);
            btnRep1.setEnabled(false);
            btnAtack2.setEnabled(true);
            btnRep2.setEnabled(true);
            btnHold1.setEnabled(false);
            btnHold2.setEnabled(true);
            btnCharge1.setEnabled(false);
            btnCharge2.setEnabled(true);
        if (Life1 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
            System.exit(0);
        }
        }else{
            
        Life2 = Life2 - randomNum;
        pgsVida2.setValue(Life2);
        this.lblVida2.setText("" + Life2);
        //Aki result
        if (randomNum >= 100) {
            this.Result1.setText("Full Nation Strike");
        }
        if (randomNum >= 98 && randomNum < 100) {
            this.Result1.setText("Biologic Weapon");
        }
        if (randomNum >= 90 && randomNum < 98) {
            this.Result1.setText("Full Army Strike");
        }
        if(randomNum >= 80 && randomNum <=89) {
            this.Result1.setText("Strategic Atack");
        }
        if (randomNum >= 60 && randomNum <= 79) {
            this.Result1.setText("Army Atack");
        }
        if (randomNum >= 30 && randomNum <= 59) {
            this.Result1.setText("Infantary Rush");
        }
        if (randomNum >= 10 && randomNum <= 29) {
            this.Result1.setText("Recon Atack");
        }
        if (randomNum >= 1 && randomNum <= 9) {
            this.Result1.setText("Small Troop Atack");
        }
        if (randomNum == 0) {
            this.Result1.setText("INSURGENCY!(Enemy Ap +1)");
            action2 = action2 + 1;
            this.jLabel8.setText(""+action2);
        }
        System.out.println(+Life2 + ", " + randomNum);
        }
        if (Life2 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
            System.exit(0);
        }
            btnAtack1.setEnabled(false);
            btnRep1.setEnabled(false);
            btnAtack2.setEnabled(true);
            btnRep2.setEnabled(true);
            btnHold1.setEnabled(false);
            btnHold2.setEnabled(true);
            btnCharge1.setEnabled(false);
            btnCharge2.setEnabled(true);

    }//GEN-LAST:event_btnAtack1MouseClicked

    private void btnAtack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtack2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtack2ActionPerformed

    private void btnAtack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtack2MouseClicked
        // TODO add your handling code here:
        Result r = new Result();
            int randomNum = r.getrNum();
        action2 = action2 - 2;
        // BOTAO ATACA Playa2 ataca
        this.jLabel8.setText("" + action2);
        if(action2 < 0)  
        {
             Life2 = Life2 - 25;
             this.Result2.setText("Rebelião!!!(-25 HP)");   
             this.lblVida2.setText("" + Life2);
             action2 = 0;
             pgsVida2.setValue(Life2);
             this.jLabel8.setText(""+action2);
            btnAtack2.setEnabled(false);
            btnRep2.setEnabled(false);
            btnRep1.setEnabled(true);
            btnAtack1.setEnabled(true);
            btnHold2.setEnabled(false);
            btnHold1.setEnabled(true);
            btnCharge1.setEnabled(true);
            btnCharge2.setEnabled(false);
            if (Life2 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
            System.exit(0);
        }
        }else{
        Life1 = Life1 - randomNum;
        pgsVida1.setValue(Life1);
        this.lblVida1.setText("" + Life1);
        //Aki Result
        if (randomNum >= 100) {
            this.Result2.setText("Full Nation Strike");
        }
        if (randomNum >= 98 && randomNum < 100) {
            this.Result2.setText("Biologic Weapon");
        }
        if (randomNum >= 90 && randomNum < 98) {
            this.Result2.setText("Full Army Strike");
        }
        if(randomNum >= 80 && randomNum <=89) {
            this.Result2.setText("Strategic Atack");
        }
        if (randomNum >= 60 && randomNum <= 79) {
            this.Result2.setText("Army Atack");
        }
        if (randomNum >= 30 && randomNum <= 59) {
            this.Result2.setText("Infantary Rush");
        }
        if (randomNum >= 10 && randomNum <= 29) {
            this.Result2.setText("Recon Atack");
        }
        if (randomNum >= 1 && randomNum <= 9) {
            this.Result2.setText("Small Troop Atack");
        }
        if (randomNum == 0) {
            this.Result2.setText("INSURGENCY!(Enemy Ap +1)");
            action1 = action1 + 1;
            this.jLabel7.setText(""+action1);
        }
        System.out.println(+Life1 + ", " + randomNum);
        }

        if (Life1 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
        }
        btnAtack1.setEnabled(true);
        btnRep1.setEnabled(true);
        btnAtack2.setEnabled(false);
        btnRep2.setEnabled(false);
        btnHold2.setEnabled(false);
        btnHold1.setEnabled(true);    
        btnCharge1.setEnabled(true);
        btnCharge2.setEnabled(false);
    }//GEN-LAST:event_btnAtack2MouseClicked

    private void btnRep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep1ActionPerformed
         // Repair player1
        int min = -20, max = 50;
        Random rd = new Random();
        int randomNum = rd.nextInt(max - min) + min;
        action1 = action1 - 3;
        this.jLabel7.setText("" + action1);
        if(action1 < 0)  
        {
             Life1 = Life1 - 25;
             Life2 = Life2 + 25;
             this.Result1.setText("TRAIÇÃO!!!(You:HP -25, Enemy:HP +25)");   
             this.lblVida1.setText("" + Life1);
             this.lblVida2.setText(""+ Life2);
             action1 = 0;
             this.jLabel7.setText(""+action1);
            btnAtack1.setEnabled(false);
            btnRep1.setEnabled(false);
            btnAtack2.setEnabled(true);
            btnRep2.setEnabled(true);
            btnHold1.setEnabled(false);
            btnHold2.setEnabled(true);
            btnCharge1.setEnabled(false);
            btnCharge2.setEnabled(true);
            if (Life1 <= 0) {
                this.Result1.setText("We fail with desonor");
            JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
            System.exit(0);
        }
        }else{
        Life1 = Life1 + randomNum;
        pgsVida1.setValue(Life1);
        this.lblVida1.setText("" + Life1);
        //Aki result
        if (randomNum <= 50 && randomNum >=48 ) {
            this.Result1.setText("Master Chief Work");
        } 
        if (randomNum <= 41 && randomNum >= 47 ) {
            this.Result1.setText("Chief Work");
        }
        if (randomNum <= 40 && randomNum >= 31) {
            this.Result1.setText("Art Chief Work");
        }
        if (randomNum <= 30 && randomNum >= 21) {
            this.Result1.setText("Master Enginner");
        }
        if (randomNum <= 29 && randomNum >= 20) {
            this.Result1.setText("Engenner");
        }
        if (randomNum <= 19 && randomNum >= 10) {
            this.Result1.setText("Rebuild");
        }
        if (randomNum <= 9 && randomNum >= 1) {
            this.Result1.setText("Repair");
        }
        if (randomNum == 0) {
            this.Result1.setText("No one to Repair");
        }
        if (randomNum <= -1 && randomNum >= -9) {
            this.Result1.setText("Incident on Repair");
        }
        if (randomNum <= -10 && randomNum >= -18) {
            this.Result1.setText("Acidental Explosion");
        }
        if (randomNum <= -19 && randomNum >= -20) {
            this.Result1.setText("Shit Goes Down(AP -1)");
            action1 = action1 - 1;
            this.jLabel7.setText(""+action1);
        }
          }
        if (Life1 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
            System.exit(0);
        }
        btnAtack1.setEnabled(false);
        btnRep1.setEnabled(false);
        btnAtack2.setEnabled(true);
        btnRep2.setEnabled(true);
        btnHold1.setEnabled(false);
        btnHold2.setEnabled(true);
        btnCharge1.setEnabled(false);
        btnCharge2.setEnabled(true);
    }//GEN-LAST:event_btnRep1ActionPerformed

    private void btnRep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep2ActionPerformed
                // Repair player 2
        int min = -20, max = 50;
        Random rd = new Random();
        int randomNum = rd.nextInt(max - min) + min;
        
        action2 = action2 - 3;
        this.jLabel8.setText("" + action2);
         if(action2 < 0)  
        {
             Life2 = Life2 - 25;
             Life1 = Life1 + 25;
             this.Result2.setText("TRAIÇÃO!!!(You:HP -25, Enemy:HP +25)");   
             this.lblVida2.setText("" + Life2);
             this.lblVida1.setText(""+ Life1);
             action2 = 0;
             this.jLabel8.setText(""+action2);
            btnAtack2.setEnabled(false);
            btnRep2.setEnabled(false);
            btnRep1.setEnabled(true);
            btnAtack1.setEnabled(true);
            btnHold2.setEnabled(false);
            btnHold1.setEnabled(true);
            btnCharge1.setEnabled(true);
            btnCharge2.setEnabled(false);
            if (Life2 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
            System.exit(0);
        }
        }else{
        this.jLabel8.setText("" + action2);
        
        Life2 = Life2 + randomNum;
        pgsVida2.setValue(Life2);
        this.lblVida2.setText("" + Life2);
        //aki result
       if (randomNum <= 50 && randomNum >=48 ) {
            this.Result2.setText("Master Chief Work");
        } 
        if (randomNum <= 41 && randomNum >= 47 ) {
            this.Result2.setText("Chief Work");
        }
        if (randomNum <= 40 && randomNum >= 31) {
            this.Result2.setText("Art Chief Work");
        }
        if (randomNum <= 30 && randomNum >= 21) {
            this.Result2.setText("Master Enginner");
        }
        if (randomNum <= 29 && randomNum >= 20) {
            this.Result2.setText("Engenner");
        }
        if (randomNum <= 19 && randomNum >= 10) {
            this.Result2.setText("Rebuild");
        }
        if (randomNum <= 9 && randomNum >= 1) {
            this.Result2.setText("Repair");
        }
        if (randomNum == 0) {
            this.Result2.setText("No one to Repair");
        }
        if (randomNum <= -1 && randomNum >= -9) {
            this.Result2.setText("Incident on Repair");
        }
        if (randomNum <= -10 && randomNum >= -18) {
            this.Result2.setText("Acidental Explosion");
        }
        if (randomNum <= -19 && randomNum >= -20) {
            this.Result2.setText("Shit Goes Down(AP -1)");
            action2 = action2 - 1;
            this.jLabel8.setText(""+action2);
        }
       }
        if (Life2 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
            System.exit(0);
        }
        btnAtack1.setEnabled(true);
        btnRep1.setEnabled(true);
        btnAtack2.setEnabled(false);
        btnRep2.setEnabled(false);
        btnHold2.setEnabled(false);
        btnHold1.setEnabled(true);
        btnCharge1.setEnabled(true);
        btnCharge2.setEnabled(false);
    }//GEN-LAST:event_btnRep2ActionPerformed

    private void btnAtack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtack1ActionPerformed

    private void btnHold1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHold1ActionPerformed
        // TODO add your handling code here:
        action1 = action1 + 1;
        this.jLabel7.setText("" + action1);
            btnAtack1.setEnabled(false);
            btnRep1.setEnabled(false);
            btnAtack2.setEnabled(true);
            btnRep2.setEnabled(true);
            btnHold1.setEnabled(false);
            btnHold2.setEnabled(true);
            btnCharge1.setEnabled(false);
            btnCharge2.setEnabled(true);
    }//GEN-LAST:event_btnHold1ActionPerformed

    private void btnHold2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHold2ActionPerformed
        // TODO add your handling code here:
        action2 = action2 + 1;
        this.jLabel8.setText("" + action2);
            btnAtack2.setEnabled(false);
            btnRep2.setEnabled(false);
            btnAtack1.setEnabled(true);
            btnRep1.setEnabled(true);
            btnHold2.setEnabled(false);
            btnHold1.setEnabled(true);
            btnCharge1.setEnabled(true);
            btnCharge2.setEnabled(false);
    }//GEN-LAST:event_btnHold2ActionPerformed

    private void btnCharge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharge1ActionPerformed
  //Charge play1
        int minc = 50, maxc = 200;
        action1 = action1 - 8;
        this.jLabel7.setText(""+action1);
        Life1 = Life1 - 30;
        pgsVida1.setValue(Life1);
        this.lblVida1.setText(""+Life1);
        if(action1 < 0)
        {
            this.Result1.setText("THEY HAVE BETRAYED US!!!(Enemy AP +4)");
            action2 = action2 + 4;
            action1 = 0;
             this.jLabel7.setText(""+action1);
            this.jLabel8.setText(""+action2);
            btnAtack1.setEnabled(false);
            btnRep1.setEnabled(false);
            btnAtack2.setEnabled(true);
            btnRep2.setEnabled(true);
            btnHold1.setEnabled(false);
            btnHold2.setEnabled(true);
            btnCharge1.setEnabled(false);
            btnCharge2.setEnabled(true);
        }else{
            if(Life1 <= 0){
         JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
         System.exit(0);
        }else{
                Random r = new Random();
                int randomNum = r.nextInt(maxc - minc) + minc;
                Life2 = Life2 - randomNum;
                pgsVida2.setValue(Life2);
                this.lblVida2.setText(""+Life2);
                this.Result1.setText("FREEDOM!!!!");
            btnAtack1.setEnabled(false);
            btnRep1.setEnabled(false);
            btnAtack2.setEnabled(true);
            btnRep2.setEnabled(true);
            btnHold1.setEnabled(false);
            btnHold2.setEnabled(true);
            btnCharge1.setEnabled(false);
            btnCharge2.setEnabled(true);
            if(Life2 <= 0)
            {
                JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
         System.exit(0);
            }
            }    
        }
    }//GEN-LAST:event_btnCharge1ActionPerformed

    private void btnCharge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharge2ActionPerformed
        // CHARGE PLAY2
         int minc = 50, maxc = 200;
        action2 = action2 - 8;
        this.jLabel8.setText(""+action2);
        Life2 = Life2 - 30;
        pgsVida2.setValue(Life2);
        this.lblVida2.setText(""+Life2);
        if(action2 < 0)
        {
            this.Result2.setText("THEY HAVE BETRAYED US!!!(Enemy AP +4)");
            action1 = action1 + 4;
            this.jLabel7.setText(""+action1);
            action2 = 0;
             this.jLabel8.setText(""+action2);
            btnAtack2.setEnabled(false);
            btnRep2.setEnabled(false);
            btnRep1.setEnabled(true);
            btnAtack1.setEnabled(true);
            btnHold2.setEnabled(false);
            btnHold1.setEnabled(true);
            btnCharge2.setEnabled(false);
            btnCharge1.setEnabled(true);
        }else{
            if(Life2 <= 0){
         JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
         System.exit(0);
        }else{
                Random r = new Random();
                int randomNum = r.nextInt(maxc - minc) + minc;
                Life1 = Life1 - randomNum;
                pgsVida1.setValue(Life1);
                this.lblVida1.setText(""+Life1);
                this.Result2.setText("FREEDOM!!!!");
            btnAtack2.setEnabled(false);
            btnRep2.setEnabled(false);
            btnAtack1.setEnabled(true);
            btnRep1.setEnabled(true);
            btnHold2.setEnabled(false);
            btnHold1.setEnabled(true);
            btnCharge2.setEnabled(false);
            btnCharge1.setEnabled(true);
            if(Life1 <= 0)
            {
                JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
         System.exit(0);
            }
            }    
        }
    }//GEN-LAST:event_btnCharge2ActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        ClassOpt opt = new ClassOpt();
        int vidaDef;
        vidaDef = opt.getVidaP1();
        System.out.println(vidaDef);
        if(vidaDef > 0){
        lblVida1.setText(String.valueOf(vidaDef));
        }
    }//GEN-LAST:event_formMouseEntered

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        this.dispose();
        menut.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(frmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Action1;
    private javax.swing.JLabel PlayName1;
    private javax.swing.JLabel Result1;
    private javax.swing.JLabel Result2;
    private javax.swing.JButton btnAtack1;
    private javax.swing.JButton btnAtack2;
    private javax.swing.JButton btnCharge1;
    private javax.swing.JButton btnCharge2;
    private javax.swing.JButton btnHold1;
    private javax.swing.JButton btnHold2;
    private javax.swing.JButton btnRep1;
    private javax.swing.JButton btnRep2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblVida1;
    private javax.swing.JLabel lblVida2;
    private javax.swing.JProgressBar pgsVida1;
    private javax.swing.JProgressBar pgsVida2;
    // End of variables declaration//GEN-END:variables

    private Object getclass(JLabel Action2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void dispose(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
