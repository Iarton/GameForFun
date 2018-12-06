package prjjogowar;

import java.awt.Color;
import javax.swing.JOptionPane;
import model.ClassOpt;
public class frmOpt extends javax.swing.JFrame {

    ClassOpt opt;
    frmMenu menupr;

    public frmOpt(ClassOpt opt, frmMenu menupr) {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        this.opt = opt;
        this.menupr = menupr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        HpPlay1 = new javax.swing.JTextField();
        NamePlay1 = new javax.swing.JTextField();
        HpPlay2 = new javax.swing.JTextField();
        NamePlay2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Ap2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Ap1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(1);
        jTextArea1.setRows(1);
        jTextArea1.setText("* Version 1.0   Release  \n* Version 1.1   Add Results, fix bugs\n* Version 1.2   Add Action points system, fix bugs\n* Version 1.3   Improved AP System, fix bugs\n* Version 1.4   Add Charge atack \n* Version 1.4.1 Windows centralizad\n* Version 1.4.2 Layout Improvement, add bugs(ops)\n* Version 1.4.3 Fix some bugs and now AP will never be less than 0\n* Version 1.5 Add Menu, fix bug\n* Version 1.5.1 Improved Results, Improved Atack and Repair, add Hp Bar\n* Version 1.5.2 Add images on Menus, fix bugs\n* Version 1.5.3 Reduce Charge health cost, fix bugs\n* Version 1.5.4 Fix bugs menu related, improved menu\n* Version 1.6 Add way to change name and HP from both Players");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 470, 120));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton1.setText("Save Changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        HpPlay1.setText("100");
        HpPlay1.setMargin(new java.awt.Insets(0, 4, 0, 0));
        getContentPane().add(HpPlay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 120, 20));
        HpPlay1.getAccessibleContext().setAccessibleName("NamePlay1");

        NamePlay1.setText("Player 1");
        NamePlay1.setMargin(new java.awt.Insets(0, 4, 0, 0));
        getContentPane().add(NamePlay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, 20));

        HpPlay2.setText("100");
        HpPlay2.setMargin(new java.awt.Insets(0, 4, 0, 0));
        getContentPane().add(HpPlay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 120, 20));

        NamePlay2.setText("Player 2");
        NamePlay2.setMargin(new java.awt.Insets(0, 4, 0, 0));
        getContentPane().add(NamePlay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 120, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Name Player 2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        Ap2.setText("5");
        Ap2.setMargin(new java.awt.Insets(0, 4, 0, 0));
        getContentPane().add(Ap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 120, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("AP Player 2");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        Ap1.setText("5");
        Ap1.setMargin(new java.awt.Insets(0, 4, 0, 0));
        getContentPane().add(Ap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("AP Player 1");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Life Player 2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Life Player 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Changelog");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Name Player 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/atack3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 280));

        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/atack3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 280));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Life Player 1");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menupr.getOpt().setName1(NamePlay1.getText());
        menupr.getOpt().setVidaP1(Integer.parseInt(HpPlay1.getText()));
        menupr.getOpt().setApP1(Integer.parseInt(Ap1.getText()));
        menupr.getOpt().setName2(NamePlay2.getText());
        menupr.getOpt().setVidaP2(Integer.parseInt(HpPlay2.getText()));
        menupr.getOpt().setApP2(Integer.parseInt(Ap2.getText()));
        JOptionPane.showMessageDialog(null, "Changes Saved");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        menupr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ap1;
    private javax.swing.JTextField Ap2;
    private javax.swing.JTextField HpPlay1;
    private javax.swing.JTextField HpPlay2;
    private javax.swing.JTextField NamePlay1;
    private javax.swing.JTextField NamePlay2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
