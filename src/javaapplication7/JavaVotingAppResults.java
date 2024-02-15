/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import static javaapplication7.JavaVotingApp.jTextField1;
import static javaapplication7.JavaVotingApp.jTextField2;


/**
 *
 * @author Alysa Emilio
 */
public class JavaVotingAppResults extends javax.swing.JFrame {

    /**
     * Creates new form JavaVotingAppResults
     */
    public JavaVotingAppResults() {
        initComponents();
        this.setSize(975, 312);
        setLocationRelativeTo(null);
        this.setTitle("VOTING APP");
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        winnertf = new javax.swing.JTextField();
        winnerbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/vss.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 310);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESULTS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(740, 20, 110, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CALL OF DUTY:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(640, 80, 87, 16);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(750, 80, 160, 22);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(750, 120, 160, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PUBG MOBILE:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(640, 120, 84, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WINNER:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(640, 180, 53, 16);

        winnertf.setEditable(false);
        winnertf.setForeground(new java.awt.Color(0, 0, 0));
        winnertf.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                winnertfComponentShown(evt);
            }
        });
        winnertf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winnertfActionPerformed(evt);
            }
        });
        jPanel1.add(winnertf);
        winnertf.setBounds(750, 170, 160, 22);

        winnerbtn.setBackground(new java.awt.Color(204, 0, 51));
        winnerbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        winnerbtn.setForeground(new java.awt.Color(0, 0, 0));
        winnerbtn.setText("SHOW WINNER");
        winnerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winnerbtnActionPerformed(evt);
            }
        });
        jPanel1.add(winnerbtn);
        winnerbtn.setBounds(810, 240, 125, 23);

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 240, 125, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(989, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JavaVotingApp n = new JavaVotingApp();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void winnertfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winnertfActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_winnertfActionPerformed

    private void winnerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winnerbtnActionPerformed
        int codm = Integer.parseInt(jTextField1.getText());
        int pubg = Integer.parseInt(jTextField2.getText());
        if(codm>pubg)
        {
            winnertf.setText("Call of Duty Wins");
        }
        else if (codm<pubg)
        {
            winnertf.setText("Pubg Mobile Wins");
        }
                else
                    winnertf.setText("Tie");             
    }//GEN-LAST:event_winnerbtnActionPerformed

    private void winnertfComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_winnertfComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_winnertfComponentShown

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
            java.util.logging.Logger.getLogger(JavaVotingAppResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaVotingAppResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaVotingAppResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaVotingAppResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaVotingAppResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    private javax.swing.JButton winnerbtn;
    private javax.swing.JTextField winnertf;
    // End of variables declaration//GEN-END:variables
}
