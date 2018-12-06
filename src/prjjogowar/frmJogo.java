package prjjogowar;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import model.ClassOpt;
import model.FunctionGame;

public class frmJogo extends javax.swing.JFrame {

    int Life1;
    int Life2;
    int total1, total2, action1 = 5, action2 = 5;
    String Life1t, Pname1;
    frmMenu menut;
    FunctionGame fg = new FunctionGame();

    public frmJogo(ClassOpt opt, frmMenu menut) {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.YELLOW);
        this.menut = menut;
        PlayName1.setText(menut.getOpt().getName1());
        PlayName2.setText(menut.getOpt().getName2());
        Life1 = (menut.getOpt().getVidaP1());
        Life2 = (menut.getOpt().getVidaP2());
        lblVida1.setText(String.valueOf(Life1));
        lblVida2.setText(String.valueOf(Life2));
        action1 = (menut.getOpt().getApP1());
        action2 = (menut.getOpt().getApP2());
        jLabel7.setText(String.valueOf(action1));
        jLabel8.setText(String.valueOf(action2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtack1 = new javax.swing.JButton();
        btnAtack2 = new javax.swing.JButton();
        lblVida1 = new javax.swing.JLabel();
        lblVida2 = new javax.swing.JLabel();
        PlayName1 = new javax.swing.JLabel();
        PlayName2 = new javax.swing.JLabel();
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

        btnAtack2.setBackground(new java.awt.Color(255, 0, 0));
        btnAtack2.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        btnAtack2.setText("Atack!  (-2 AP)");
        btnAtack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtack2MouseClicked(evt);
            }
        });

        lblVida1.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        lblVida1.setText("100");

        lblVida2.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        lblVida2.setText("100");

        PlayName1.setBackground(new java.awt.Color(204, 204, 0));
        PlayName1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        PlayName1.setText("Player 1");

        PlayName2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        PlayName2.setText("Player 2");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PlayName1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(lblVida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(299, 299, 299)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PlayName2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(lblVida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(PlayName2)
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
        int randomNum = fg.randomGen(0, 100);

        action1 = action1 - 2;
        this.jLabel7.setText("" + action1);
        if (action1 < 0) {

            Life1 = Life1 - 25;
            this.Result1.setText("Rebelião!!!(-25 HP)");
            this.lblVida1.setText("" + Life1);
            action1 = 0;
            pgsVida1.setValue(Life1);
            this.jLabel7.setText("" + action1);
            if (Life1 <= 0) {
                JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
                System.exit(0);
            }
        } else {

            Life2 = Life2 - randomNum;
            pgsVida2.setValue(Life2);
            this.lblVida2.setText("" + Life2);
            this.Result1.setText(fg.resultadoAtack(randomNum));

            if (randomNum == 0) {
                action2 = action2 + 1;
                this.jLabel8.setText("" + action2);
            }
            System.out.println(+Life2 + ", " + randomNum);
        }
        if (Life2 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
            System.exit(0);
        }
        
        fg.disabler(btnAtack1,btnRep1, btnHold1,btnCharge1);
        fg.enabler(btnAtack2,btnRep2, btnHold2,btnCharge2);

    }//GEN-LAST:event_btnAtack1MouseClicked

    private void btnAtack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtack2MouseClicked
        int randomNum = fg.randomGen(0, 100);
        action2 = action2 - 2;
        this.jLabel8.setText("" + action2);
        if (action2 < 0) {
            Life2 = Life2 - 25;
            this.Result2.setText("Rebelião!!!(-25 HP)");
            this.lblVida2.setText("" + Life2);
            action2 = 0;
            pgsVida2.setValue(Life2);
            this.jLabel8.setText("" + action2);
            if (Life2 <= 0) {
                JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
                System.exit(0);
            }
        } else {
            Life1 = Life1 - randomNum;
            pgsVida1.setValue(Life1);
            this.lblVida1.setText("" + Life1);
            Result2.setText(fg.resultadoAtack(randomNum));

            if (randomNum == 0) {
                action1 = action1 + 1;
                this.jLabel7.setText("" + action1);
            }
            System.out.println(+Life1 + ", " + randomNum);
        }

        if (Life1 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
        }
        
        fg.enabler(btnAtack1,btnRep1, btnHold1,btnCharge1);
        fg.disabler(btnAtack2,btnRep2, btnHold2,btnCharge2);
    }//GEN-LAST:event_btnAtack2MouseClicked

    private void btnRep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep1ActionPerformed
        int randomNum = fg.randomGen(-20, 50);
        action1 = action1 - 3;
        this.jLabel7.setText("" + action1);
        if (action1 < 0) {
            Life1 = Life1 - 25;
            Life2 = Life2 + 25;
            this.Result1.setText("TRAIÇÃO!!!(You:HP -25, Enemy:HP +25)");
            this.lblVida1.setText("" + Life1);
            this.lblVida2.setText("" + Life2);
            action1 = 0;
            this.jLabel7.setText("" + action1);
            if (Life1 <= 0) {
                this.Result1.setText("We fail with desonor");
                JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
                System.exit(0);
            }
        } else {
            Life1 = Life1 + randomNum;
            pgsVida1.setValue(Life1);

            this.lblVida1.setText("" + Life1);

            this.Result1.setText(fg.resultRepair(randomNum));

            if (randomNum <= -19 && randomNum >= -20) {
                action1 = action1 - 1;
                this.jLabel7.setText("" + action1);
            }
        }
        if (Life1 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
            System.exit(0);
        }
        fg.disabler(btnAtack1,btnRep1, btnHold1,btnCharge1);
        fg.enabler(btnAtack2,btnRep2, btnHold2,btnCharge2);
    }//GEN-LAST:event_btnRep1ActionPerformed

    private void btnRep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep2ActionPerformed
        int randomNum = fg.randomGen(-20, 50);

        action2 = action2 - 3;
        this.jLabel8.setText("" + action2);
        if (action2 < 0) {
            Life2 = Life2 - 25;
            Life1 = Life1 + 25;
            this.Result2.setText("TRAIÇÃO!!!(You:HP -25, Enemy:HP +25)");
            this.lblVida2.setText("" + Life2);
            this.lblVida1.setText("" + Life1);
            action2 = 0;
            this.jLabel8.setText("" + action2);
            if (Life2 <= 0) {
                JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
                System.exit(0);
            }
        } else {
            this.jLabel8.setText("" + action2);

            Life2 = Life2 + randomNum;
            pgsVida2.setValue(Life2);
            this.lblVida2.setText("" + Life2);
            this.Result2.setText(fg.resultRepair(randomNum));

            if (randomNum <= -19 && randomNum >= -20) {
                action2 = action2 - 1;
                this.jLabel8.setText("" + action2);
            }
        }
        if (Life2 <= 0) {
            JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
            System.exit(0);
        }
        
        fg.enabler(btnAtack1,btnRep1, btnHold1,btnCharge1);
        fg.disabler(btnAtack2,btnRep2, btnHold2,btnCharge2);
    }//GEN-LAST:event_btnRep2ActionPerformed

    private void btnHold1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHold1ActionPerformed
        action1 = action1 + 1;
        this.jLabel7.setText("" + action1);
        
        
        fg.disabler(btnAtack1,btnRep1, btnHold1,btnCharge1);
        fg.enabler(btnAtack2,btnRep2, btnHold2,btnCharge2);
    }//GEN-LAST:event_btnHold1ActionPerformed

    private void btnHold2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHold2ActionPerformed
        // TODO add your handling code here:
        action2 = action2 + 1;
        this.jLabel8.setText("" + action2);
        
        fg.enabler(btnAtack1,btnRep1, btnHold1,btnCharge1);
        fg.disabler(btnAtack2,btnRep2, btnHold2,btnCharge2);
        
    }//GEN-LAST:event_btnHold2ActionPerformed

    private void btnCharge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharge1ActionPerformed
        action1 = action1 - 8;
        this.jLabel7.setText("" + action1);
        Life1 = Life1 - 30;
        pgsVida1.setValue(Life1);
        this.lblVida1.setText("" + Life1);
        if (action1 < 0) {
            this.Result1.setText("THEY HAVE BETRAYED US!!!(Enemy AP +4)");
            action2 = action2 + 4;
            action1 = 0;
            this.jLabel7.setText("" + action1);
            this.jLabel8.setText("" + action2);
        } else {
            if (Life1 <= 0) {
                JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
                System.exit(0);
            } else {
                int randomNum = fg.randomGen(50, 200);
                Life2 = Life2 - randomNum;
                pgsVida2.setValue(Life2);
                this.lblVida2.setText("" + Life2);
                this.Result1.setText("FREEDOM!!!!");
                if (Life2 <= 0) {
                    JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
                    System.exit(0);
                }
            }
        }
        
        fg.disabler(btnAtack1,btnRep1, btnHold1,btnCharge1);
        fg.enabler(btnAtack2,btnRep2, btnHold2,btnCharge2);
    }//GEN-LAST:event_btnCharge1ActionPerformed

    private void btnCharge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharge2ActionPerformed
        action2 = action2 - 8;
        this.jLabel8.setText("" + action2);
        Life2 = Life2 - 30;
        pgsVida2.setValue(Life2);
        this.lblVida2.setText("" + Life2);
        if (action2 < 0) {
            this.Result2.setText("THEY HAVE BETRAYED US!!!(Enemy AP +4)");
            action1 = action1 + 4;
            this.jLabel7.setText("" + action1);
            action2 = 0;
            this.jLabel8.setText("" + action2);
        } else {
            if (Life2 <= 0) {
                JOptionPane.showMessageDialog(null, "O Player 1 Venceu");
                System.exit(0);
            } else {
                int randomNum = fg.randomGen(50, 200);
                Life1 = Life1 - randomNum;
                pgsVida1.setValue(Life1);
                this.lblVida1.setText("" + Life1);
                this.Result2.setText("FREEDOM!!!!");
                if (Life1 <= 0) {
                    JOptionPane.showMessageDialog(null, "O Player 2 Venceu");
                    System.exit(0);
                }
            }
        }
        
        fg.enabler(btnAtack1,btnRep1, btnHold1,btnCharge1);
        fg.disabler(btnAtack2,btnRep2, btnHold2,btnCharge2);
    }//GEN-LAST:event_btnCharge2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        menut.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Action1;
    private javax.swing.JLabel PlayName1;
    private javax.swing.JLabel PlayName2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblVida1;
    private javax.swing.JLabel lblVida2;
    private javax.swing.JProgressBar pgsVida1;
    private javax.swing.JProgressBar pgsVida2;
    // End of variables declaration//GEN-END:variables
}
