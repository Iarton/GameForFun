package prjjogowar;

import java.awt.Color;
import static java.awt.SystemColor.menu;
import javax.swing.JFrame;
import model.ClassOpt;


public class frmMenu extends javax.swing.JFrame {

    private ClassOpt opt;

    public frmMenu() {
        initComponents();
        opt = new ClassOpt();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.ORANGE);
        opt.setName1("Player 1");
        opt.setName2("Player 2");
        opt.setVidaP1(100);
        opt.setVidaP2(100);
        opt.setApP1(5);
        opt.setApP2(5);
    }

    public ClassOpt getOpt() {
        return opt;
    }

    public void setOpt(ClassOpt opt) {
        this.opt = opt;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOpt = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(0, 255, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJogar.setBackground(new java.awt.Color(255, 0, 0));
        btnJogar.setFont(new java.awt.Font("Trajan Pro", 3, 24)); // NOI18N
        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 159, -1));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 58)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("WAR GAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 85));

        btnOpt.setBackground(new java.awt.Color(51, 255, 255));
        btnOpt.setFont(new java.awt.Font("Trajan Pro", 3, 24)); // NOI18N
        btnOpt.setText("Opções");
        btnOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 159, -1));

        btnSair.setBackground(new java.awt.Color(0, 255, 51));
        btnSair.setFont(new java.awt.Font("Trajan Pro", 3, 24)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 159, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Version: 1.6");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 80, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/atack2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        frmJogo f = new frmJogo(opt, this);
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnJogarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptActionPerformed
        frmOpt MOpt = new frmOpt(opt, this);
        MOpt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOptActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnOpt;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
