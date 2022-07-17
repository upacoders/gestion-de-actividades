/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Pantallas;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import pantallas.AgregarEspacioTrabajo;
import pantallas.espacio_de_trabajo;
import pantallas.estadopantallatablero;

/**
 *
 * @author user
 */
public class pantallaTablero extends javax.swing.JFrame {
estadopantallatablero estadopantallatablero;
    /** Creates new form pantallaEditarperfil */
    public pantallaTablero() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        labelusuario = new javax.swing.JLabel();
        lbltuerca = new javax.swing.JLabel();
        lblnombrefirma = new javax.swing.JLabel();
        lblpartesup = new javax.swing.JLabel();
        lblpartelat = new javax.swing.JLabel();
        btnaggacti = new javax.swing.JButton();
        lblevaluaciones = new javax.swing.JLabel();
        lblacciones = new javax.swing.JLabel();
        panelpendientes = new javax.swing.JScrollPane();
        listPendientes = new javax.swing.JList<>();
        panelenproceso = new javax.swing.JScrollPane();
        listEnProceso = new javax.swing.JList<>();
        panelTerminadas = new javax.swing.JScrollPane();
        listTerminadas = new javax.swing.JList<>();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1760, 690));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("MENÚ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 150, 70, 24);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setText("Espacios de trabajo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 190, 330, 23);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Dashboard");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 230, 330, 23);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setText("Configuraciones");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 270, 330, 23);

        labelusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logousuario.png"))); // NOI18N
        getContentPane().add(labelusuario);
        labelusuario.setBounds(1260, 70, 55, 55);

        lbltuerca.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbltuerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotuerca.png"))); // NOI18N
        lbltuerca.setText("jLabel1");
        lbltuerca.setMaximumSize(new java.awt.Dimension(50, 50));
        lbltuerca.setMinimumSize(new java.awt.Dimension(50, 50));
        getContentPane().add(lbltuerca);
        lbltuerca.setBounds(15, 47, 50, 50);

        lblnombrefirma.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblnombrefirma.setText("Euclick");
        getContentPane().add(lblnombrefirma);
        lblnombrefirma.setBounds(80, 50, 148, 45);

        lblpartesup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partesuperior2.png"))); // NOI18N
        getContentPane().add(lblpartesup);
        lblpartesup.setBounds(0, 0, 1760, 140);

        lblpartelat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partelateral.png"))); // NOI18N
        getContentPane().add(lblpartelat);
        lblpartelat.setBounds(0, 140, 330, 560);

        btnaggacti.setBackground(new java.awt.Color(255, 255, 204));
        btnaggacti.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnaggacti.setText("+ Agregar Actividad");
        btnaggacti.setBorder(null);
        btnaggacti.setBorderPainted(false);
        btnaggacti.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnaggacti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaggactiMouseClicked(evt);
            }
        });
        getContentPane().add(btnaggacti);
        btnaggacti.setBounds(1160, 150, 250, 40);

        lblevaluaciones.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblevaluaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblevaluaciones.setText("Evaluaciones");
        lblevaluaciones.setToolTipText("");
        getContentPane().add(lblevaluaciones);
        lblevaluaciones.setBounds(350, 150, 250, 40);

        lblacciones.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblacciones.setText("Acciones");
        getContentPane().add(lblacciones);
        lblacciones.setBounds(370, 200, 250, 40);

        panelpendientes.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        listPendientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pendiente", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listPendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listPendientes.setName(""); // NOI18N
        panelpendientes.setViewportView(listPendientes);
        listPendientes.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(panelpendientes);
        panelpendientes.setBounds(360, 500, 460, 120);

        panelenproceso.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        panelenproceso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        listEnProceso.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "En proceso", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        panelenproceso.setViewportView(listEnProceso);

        getContentPane().add(panelenproceso);
        panelenproceso.setBounds(360, 240, 460, 120);

        panelTerminadas.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        listTerminadas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Terminadas", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listTerminadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelTerminadas.setViewportView(listTerminadas);

        getContentPane().add(panelTerminadas);
        panelTerminadas.setBounds(360, 370, 460, 120);
        getContentPane().add(content);
        content.setBounds(860, 190, 540, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaggactiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaggactiMouseClicked
<<<<<<< HEAD
        estadopantallatablero pT = estadopantallatablero();
=======
        estadopantallatablero pT = null;
        try {
            pT = new estadopantallatablero();
        } catch (Exception ex) {
            Logger.getLogger(pantallaTablero.class.getName()).log(Level.SEVERE, null, ex);
        }
>>>>>>> 785bb0877d0fde26e29d8bb035c6038a0b936d23
        pT.setSize(540,470);
        pT.setLocation(0,0);
        
        content.removeAll();
        content.add(pT, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnaggactiMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(pantallaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaTablero().setVisible(true);
            }
        }); 
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaggacti;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JLabel lblacciones;
    private javax.swing.JLabel lblevaluaciones;
    private javax.swing.JLabel lblnombrefirma;
    private javax.swing.JLabel lblpartelat;
    private javax.swing.JLabel lblpartesup;
    private javax.swing.JLabel lbltuerca;
    private javax.swing.JList<String> listEnProceso;
    private javax.swing.JList<String> listPendientes;
    private javax.swing.JList<String> listTerminadas;
    private javax.swing.JScrollPane panelTerminadas;
    private javax.swing.JScrollPane panelenproceso;
    private javax.swing.JScrollPane panelpendientes;
    // End of variables declaration//GEN-END:variables

    private estadopantallatablero estadopantallatablero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
