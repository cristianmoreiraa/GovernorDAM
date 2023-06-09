/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TresEnRaya.ventana;

import TresEnRaya.Conexion.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

import static javax.swing.DropMode.INSERT;

/**+
 * 6
 *
 * @author crist
 */
public class Register extends javax.swing.JFrame  {

    Conectar con1 = new Conectar();
    Connection conet;
    PreparedStatement ps;

    /**
     * Creates new form Crear
     */
    public Register() {
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

        jPanel1 = new javax.swing.JPanel();
        lNombre = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        bAñadirNuevo = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lNombre.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lNombre.setText("NOMBRE");
        jPanel1.add(lNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, 70));

        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });
        jPanel1.add(tNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 210, 70));

        bAñadirNuevo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bAñadirNuevo.setText("Añadir Nuevo");
        bAñadirNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadirNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(bAñadirNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 170, 50));

        bExit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });
        jPanel1.add(bExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 303, 80, 30));

        fondo.setIcon(new javax.swing.ImageIcon("/imagenes/fondoInterfazLog.png")); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 560, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {
        /**
         * Campo donde Metemos el Nombre de la persona que deseamos guardar.
         */
    }

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {
        Leaderboard obj = new Leaderboard();
        obj.setVisible(true);
        dispose();
    }

    private void bAñadirNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre = tNombre.getText();

        try {
            if (tNombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Falta introducir datos.");
            } else {
                //conet = con1.establecerConexionJorge();
                conet =  con1.establecerConexion1();
                ps = conet.prepareStatement("INSERT INTO tres_en_raya.casino(Nombre, Win, Lose) VALUES (?,0,0)");
                ps.setString(1, nombre);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se ha registrado correctamente");
                Leaderboard obj1 = new Leaderboard();
                    obj1.setVisible(true);
                    dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo ha fallado o ya existe ese usuario");
        }


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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton bAñadirNuevo;
    private javax.swing.JButton bExit;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lNombre;
    private javax.swing.JTextField tNombre;
    // End of variables declaration
}
