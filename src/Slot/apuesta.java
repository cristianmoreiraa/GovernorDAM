/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Slot;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author usato
 */
public class apuesta extends javax.swing.JFrame {

    public int Dinero = 0;

    private void refrescar(){
        jLabel1.setText("Dinero: "+ Dinero);
    }

    private boolean triple(String letra){
        if (!C1.getText().equals(letra)) return false;
        if (!C2.getText().equals(letra)) return false;
        if (!C3.getText().equals(letra)) return false;
        return true;

    }

    private void incrementarPremio(){
        if (triple("J")) Dinero+=130;
        if (triple("Q")) Dinero+=150;
        if (triple("K")) Dinero+=175;
        if (triple("A")) Dinero+=150;
        if (triple("7")) Dinero+=200;
        if (triple("0")) Dinero+=200;
        if (triple("!")) Dinero+=200;
    }



    public void setCasillaAzar(javax.swing.JLabel destino){
        if (Math.random()<0.30){
            //destino.setIcon(icon);
            destino.setText("J");
            destino.setForeground(Color.cyan);
            return;
        }

        if (Math.random()<0.30){
            //destino.setIcon(icon);
            destino.setText("Q");
            destino.setForeground(Color.yellow);
            return;
        }
        if (Math.random()<0.30){
            //destino.setIcon(icon);
            destino.setText("K");
            destino.setForeground(Color.lightGray);
            return;
        }
        if (Math.random()<0.30){
            //destino.setIcon(icon);
            destino.setText("A");
            destino.setForeground(Color.cyan);
            return;
        }
        if (Math.random()<0.30){
            //destino.setIcon(icon);
            destino.setText("7");
            destino.setForeground(Color.cyan);
            return;
        }
        if (Math.random()<0.30){
            //destino.setIcon(icon);
            destino.setText("0");
            destino.setForeground(Color.red);
            return;
        }
        if (Math.random()<0.30){
            //destino.setIcon(icon);
            destino.setText("!");
            destino.setForeground(Color.green);
            return;
        }


    }


    /**
     * Creates new form apuesta
     */
    public apuesta() {

        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        C3 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("   A");
        jLabel3.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(588, 348));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 460));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C3.setBackground(new java.awt.Color(0, 0, 0));
        C3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        C3.setForeground(new java.awt.Color(0, 51, 255));
        C3.setText("A");
        C3.setToolTipText("");
        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 110, 154));

        C2.setBackground(new java.awt.Color(0, 0, 0));
        C2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        C2.setForeground(new java.awt.Color(0, 51, 255));
        C2.setText("A");
        C2.setToolTipText("");
        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 110, 154));

        C1.setBackground(new java.awt.Color(0, 0, 0));
        C1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        C1.setForeground(new java.awt.Color(0, 51, 255));
        C1.setText("A");
        C1.setToolTipText("");
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, 154));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar partida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 120, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Apostar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 120, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Dinero: 0");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 140, 53));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slot/Simbolos/peru.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 410, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (Dinero>=10){
            for(int n=0;n<10;n++){
                setCasillaAzar(C1);
                setCasillaAzar(C2);
                setCasillaAzar(C3);
                this.paintComponents(this.getGraphics());

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

            }
            Dinero-=10;
            incrementarPremio();
            refrescar();
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Dinero=1000;
        refrescar();

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
            java.util.logging.Logger.getLogger(apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
